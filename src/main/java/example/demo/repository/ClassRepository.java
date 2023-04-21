package example.demo.repository;

import example.demo.model.Classs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClassRepository extends JpaRepository<Classs,InternalError> {

    @Query("select c from Classs c where c.name = ?1")
    Optional<Classs> findByClassName(String name);

}
