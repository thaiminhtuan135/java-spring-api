package example.demo.Service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import example.demo.Entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Date;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class JWTService {
    private static final String Secret_key = "123";

    public String generateToken(User user, Collection<SimpleGrantedAuthority> authorities) {
        Algorithm algorithm = Algorithm.HMAC256(Secret_key.getBytes());
        return JWT
                .create()
                .withSubject(user.getEmail())
                .withExpiresAt(new Date(System.currentTimeMillis()+ 60 * 60 * 1000))
                .withClaim("roles", authorities.stream().map(GrantedAuthority::getAuthority).collect(Collectors.toList()))
                .sign(algorithm);
    }

    public String generateRefreshToken(User user, Collection<SimpleGrantedAuthority> authorities) {
        Algorithm algorithm = Algorithm.HMAC256(Secret_key.getBytes());
        return JWT
                .create()
                .withSubject(user.getEmail())
                .withExpiresAt(new Date(System.currentTimeMillis()+ 60 * 60 * 1000))
                .sign(algorithm);
    }
}
