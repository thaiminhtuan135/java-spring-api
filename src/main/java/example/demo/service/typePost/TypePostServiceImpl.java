package example.demo.service.typePost;

import example.demo.model.TypePost;
import example.demo.repository.TypePostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TypePostServiceImpl implements TypePostService {
    @Autowired
    private TypePostRepository typePostRepository;
    @Override
    public TypePost save(TypePost typePost) {
        return typePostRepository.save(typePost);
    }

    @Override
    public Optional<TypePost> getTypePostById(int id) {
        return typePostRepository.findById(id);
    }

    @Override
    public void delete(int id) {
        typePostRepository.deleteById(id);
    }

    @Override
    public List<TypePost> getTypePosts() {
        return typePostRepository.findAll();
    }
}
