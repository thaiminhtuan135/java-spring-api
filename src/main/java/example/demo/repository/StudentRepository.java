package example.demo.repository;

import example.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    @Query("SELECT s FROM Student s WHERE s.name = ?1")
    Optional<Student> findStudentByName(String name);
}
