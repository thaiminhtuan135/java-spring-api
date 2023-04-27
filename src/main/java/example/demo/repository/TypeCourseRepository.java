package example.demo.repository;

import example.demo.model.TypeCourse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeCourseRepository extends JpaRepository<TypeCourse, Integer> {
    Page<TypeCourse> findAll(Pageable pageable);

}
