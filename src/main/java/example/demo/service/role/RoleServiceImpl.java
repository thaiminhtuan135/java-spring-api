package example.demo.service.role;

import example.demo.model.Role;
import example.demo.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleServiceImpl implements RoleService{
    @Autowired
    private RoleRepository roleRepository;


    @Override
    public Role save(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public Optional<Role> getRoleById(int id) {
        return roleRepository.findById(id);
    }

    @Override
    public void delete(int id) {
        roleRepository.deleteById(id);
    }

    @Override
    public List<Role> getRoles() {
        return roleRepository.findAll();
    }
}
