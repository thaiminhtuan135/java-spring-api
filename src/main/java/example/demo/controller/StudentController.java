package example.demo.controller;

import example.demo.model.Student;
import example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/student")

public class StudentController {
    @Autowired
    private StudentService studentService;

    public final List<Student> students = new ArrayList<>();

    @PostMapping("/add")
    public ResponseEntity<Student> add(@RequestBody Student student) {
//        studentService.saveStudent(student);
//        return "New student is added";
        return new ResponseEntity<>(studentService.saveStudent(student), HttpStatus.OK);

    }

    @GetMapping("/getAll")
    public List<Student> getAllStudent() {
//        List<Student> studentAddress = new ArrayList<>();
//        List<Student> students = getStudent();
//        for (Student student : students) {
//            if (student.getAddress().equals("bac ninh")) {
//                studentAddress.add(student);
//            }
//        }

        return studentService.getAllStudent();
//        return studentAddress;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> get(@PathVariable Integer id) {
        try {
            Student student = studentService.get(id);
            return new ResponseEntity<Student>(student, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Student> update(@RequestBody Student student, @PathVariable Integer id) {

        Optional<Student> studentOptional = Optional.ofNullable(studentService.get(id));

        return studentOptional.map(student1 -> {
            student.setId(student1.getId());
            return new ResponseEntity<>(studentService.saveStudent(student), HttpStatus.OK);
        }).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));

    }

    @DeleteMapping("{id}")
    public String delete(@PathVariable Integer id) {

        studentService.delete(id);
        return "Deleted student with id " + id;
    }

    @GetMapping("/search")
    public ResponseEntity<?> search(@RequestParam(name = "keyword", required = false, defaultValue = "") String name) {
//        studentService.searchUser(name);
        return ResponseEntity.status(HttpStatus.OK).body(studentService.searchUser(name));
    }

    @GetMapping("/add-list-student")
    public ResponseEntity<String> addStudents() {
        studentService.addListStudent();
        return ResponseEntity.ok("them thanh cong") ;
    }
//    private static List<Student> getStudent() {
//        return List.of(
//                new Student(1, "james bond", "bac ninh"),
//                new Student(2, "alina smith", "ha noi"),
//                new Student(3, "anna cook", "hai duong"),
//                new Student(4, "jame god", "ninh binh"),
//                new Student(5, "robin", "bac ninh"),
//                new Student(6, "robin", "thi cau")
//        );
//    }
}
