package example.demo.service.course;

import example.demo.model.Course;
import example.demo.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService{
    @Autowired
    private CourseRepository courseRepository;
    @Override
    public Course save(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public Optional<Course> getCourseById(int id) {
        return courseRepository.findById(id);
    }

    @Override
    public List<Course> getCourses() {
        return courseRepository.findAll();
    }

    @Override
    public void delete(int id) {
        courseRepository.deleteById(id);
    }
}
