package example.demo.Repository;

import example.demo.Entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
//    @Query("SELECT s FROM Role s WHERE s.name = ?1")
    Role findByName(String role);
}
