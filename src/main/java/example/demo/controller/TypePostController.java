package example.demo.controller;

import com.google.gson.Gson;
import example.demo.model.TypePost;
import example.demo.service.typePost.TypePostService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@CrossOrigin
@RequestMapping("/admin/type-post")
public class TypePostController {
    @Autowired
    private TypePostService typePostService;
    private final com.google.gson.Gson gson = example.demo.util.Gson.gson();

    @GetMapping("/list")
    public List<TypePost> getTypePost() {
        return typePostService.getTypePosts();
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody @Valid TypePost typePost) {
//        try {
//            TypePost typePost1 = gson.fromJson(typePost, TypePost.class);
//            System.out.println(typePost1);
            return new ResponseEntity<>(typePostService.save(typePost), HttpStatus.CREATED);
//        } catch (Exception e) {
//            return new ResponseEntity<>("Create fail", HttpStatus.INTERNAL_SERVER_ERROR);
//        }
    }

    @PutMapping("/{id}/edit")
    public ResponseEntity<TypePost> update(@RequestBody String dataUpdate, @PathVariable Integer id) {

        return typePostService.getTypePostById(id).map(typePost1 -> {
            TypePost typePost2 = gson.fromJson(dataUpdate, TypePost.class);
            typePost2.setId(typePost1.getId());
            return new ResponseEntity<>(typePostService.save(typePost2), HttpStatus.OK);

        }).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/{id}")
    public ResponseEntity<TypePost> getbyId(@PathVariable Integer id) {
        try {
            TypePost typePost = typePostService.getTypePostById(id).get();
            return new ResponseEntity<>(typePost, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id) {
        try {
            TypePost typePost = typePostService.getTypePostById(id).get();
            typePostService.delete(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
