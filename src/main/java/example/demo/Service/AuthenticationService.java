package example.demo.Service;

import example.demo.Entity.Role;
import example.demo.Entity.User;
import example.demo.Repository.RoleCustomRepo;
import example.demo.Repository.UserRepository;
import example.demo.auth.AuthenticationRequest;
import example.demo.auth.AuthenticationResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
    private final UserRepository userRepository;
    private final AuthenticationManager authenticationManager;
    private final RoleCustomRepo roleCustomRepo;
    private final JWTService jwtService;
    public AuthenticationResponse authenticate(AuthenticationRequest authenticationRequest) {
        authenticationManager.authenticate(
                        new UsernamePasswordAuthenticationToken(authenticationRequest.getEmail(), authenticationRequest.getPassword())
                );
        User user = userRepository.findByEmail(authenticationRequest.getEmail()).orElseThrow();
        List<Role> role = null;
        if (user != null) {
            role = roleCustomRepo.getRole(user);
        }
        Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
        Set<Role> set = new HashSet<>();
        role.stream().forEach(r -> set.add(new Role(r.getName())));
        user.setRoles(set);
        set.stream().forEach(i -> authorities.add(new SimpleGrantedAuthority(i.getName())));
        var jwtToken = jwtService.generateToken(user, authorities);
        var jwtRefreshToken = jwtService.generateRefreshToken(user, authorities);
        return AuthenticationResponse.builder().token(jwtToken).refreshToken(jwtRefreshToken).build();
    }
}
