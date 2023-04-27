package example.demo.service;

import example.demo.exception.UserNotFoundException;
import example.demo.model.Student;
import example.demo.repository.StudentRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        Optional<Student> studentOptional = studentRepository.findStudentByName(student.getName());
        if (studentOptional.isPresent()) {
            throw new IllegalStateException("name taken");
        }

        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Student get(Integer id) throws UserNotFoundException {
        Optional<Student> student =  studentRepository.findById(id);
        if (student.isPresent()) {
            return student.get();
        } else {
            throw new UserNotFoundException("user not found with id : " + id);
        }
    }

    @Override
    public void delete(Integer id) {
        studentRepository.deleteById(id);
        
    }

    @Override
    public List<Student> searchUser(String keyword) {
        if (keyword.equals("")) {
            return getAllStudent();
        }
        List<Student> searchList = new ArrayList<>();
        for (Student student: getAllStudent()) {
            if (student.getName().contains(keyword)) {
                searchList.add(student);
            }
        }
        return searchList;
    }
}
