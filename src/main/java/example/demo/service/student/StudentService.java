package example.demo.service.student;

import example.demo.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    Student save(Student student);

    Optional<Student> getStudentById(int id);

    void delete(int id);

    List<Student> getStudents();
}
