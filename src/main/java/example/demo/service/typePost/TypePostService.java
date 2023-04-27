package example.demo.service.typePost;

import example.demo.model.TypePost;

import java.util.List;
import java.util.Optional;

public interface TypePostService {

    TypePost save(TypePost typePost);

    Optional<TypePost> getTypePostById(int id);

    void delete(int id);

    List<TypePost> getTypePosts();
}
