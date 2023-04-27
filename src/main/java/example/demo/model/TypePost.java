package example.demo.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.List;

@Data
@Entity
@Table
@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@Builder
public class TypePost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank
    private String name;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "typePost")
    @JsonManagedReference
    private List<Topic> topics;
}
