package example.demo.repository;

import example.demo.model.TypePost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypePostRepository extends JpaRepository<TypePost, Integer> {
}
