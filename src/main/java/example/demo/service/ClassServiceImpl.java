package example.demo.service;

import example.demo.model.Classs;
import example.demo.repository.ClassRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClassServiceImpl {
    private ClassRepository classRepository;

    public Classs saveStudent(Classs aClasss) {
        Optional<Classs> studentOptional = classRepository.findByClassName(aClasss.getName());
        if (studentOptional.isPresent()) {
            throw new IllegalStateException("name taken");
        }

        return classRepository.save(aClasss);
    }

}
