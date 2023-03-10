package example.demo.controller;

import example.demo.model.Person;
import example.demo.model.Student;
import example.demo.service.PersonService;
import example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/student")

public class StudentController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private PersonService personService;


    @PostMapping("/add")
    public ResponseEntity<Student> add(@RequestBody Student student) {
//        studentService.saveStudent(student);
//        return "New student is added";
        return new ResponseEntity<>(studentService.saveStudent(student), HttpStatus.OK);

    }

    @GetMapping("/getAll")
    public List<Student> getAllStudent() {
        return studentService.getAllStudent();
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
    public ResponseEntity<?> search(@RequestParam(name = "keyword" , required = false , defaultValue = "") String name) {
//        studentService.searchUser(name);
        return ResponseEntity.status(HttpStatus.OK).body(studentService.searchUser(name));
    }

    @GetMapping("/add-list-address")
    public ResponseEntity<String> addAddress() {
        personService.addListPerson();
        return ResponseEntity.ok("them thanh cong") ;
    }
}
