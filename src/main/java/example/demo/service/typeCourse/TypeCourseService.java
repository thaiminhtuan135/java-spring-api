package example.demo.service.typeCourse;

import example.demo.model.TypeCourse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface TypeCourseService {
    TypeCourse save(TypeCourse typeCourse);

    Optional<TypeCourse> getTypeCourseById(int id);

    void delete(int id);

    List<TypeCourse> getTypeCourses();

    Page<TypeCourse> pagination(Pageable pageable);
}
