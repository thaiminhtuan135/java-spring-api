package example.demo.service.typeCourse;

import example.demo.model.TypeCourse;
import example.demo.repository.TypeCourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TypeCourseServiceImpl implements TypeCourseService{
    @Autowired
    private TypeCourseRepository typeCourseRepository;
    @Override
    public TypeCourse save(TypeCourse typeCourse) {
        return typeCourseRepository.save(typeCourse);
    }

    @Override
    public Optional<TypeCourse> getTypeCourseById(int id) {
        return typeCourseRepository.findById(id);
    }

    @Override
    public void delete(int id) {
        typeCourseRepository.deleteById(id);
    }

    @Override
    public List<TypeCourse> getTypeCourses() {
        return typeCourseRepository.findAll();
    }

    @Override
    public Page<TypeCourse> pagination(Pageable pageable) {
        return typeCourseRepository.findAll(pageable);
    }
}
