package example.demo.service;

import example.demo.exception.UserNotFoundException;
import example.demo.model.Student;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);

    public List<Student> getAllStudent();

    public Student get(Integer id) throws UserNotFoundException;

    public void delete(Integer id);

    public List<Student> searchUser(String keyword);
}
