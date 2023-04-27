package example.demo.service.student;

import example.demo.model.Student;
import example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Optional<Student> getStudentById(int id) {
        return studentRepository.findById(id);
    }

    @Override
    public void delete(int id) {
    studentRepository.deleteById(id);
    }

    @Override
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }
}
