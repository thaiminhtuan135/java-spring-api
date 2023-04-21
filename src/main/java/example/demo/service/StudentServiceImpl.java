package example.demo.service;

import example.demo.model.Classs;
import example.demo.model.Student;
import example.demo.repository.ClassRepository;
import example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private ClassRepository classRepository;

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
    public Student get(Integer id) {
        return studentRepository.findById(id).get();
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

    @Override
    public void addListStudent() {
        Random random = new Random();

        int randomNumber = random.nextInt((2014 - 2002) + 1) + 2002;
        for (int i = 1; i <= 5; i++) {
            Classs aClasss = Classs.builder().name("lop" + i).number(20).build();
            classRepository.save(aClasss);
            for (int j = 1; j < 20; j++) {
                Student student = Student.builder()
                                            .name("Tuan" + j)
                                            .year_of_birth(randomNumber)
                                            .address("Bac ninh " + j).classs(aClasss).build();
                System.out.println(student);
                studentRepository.save(student);
            }
        }

    }
}
