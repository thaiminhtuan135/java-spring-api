package example.demo.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@Entity
@Builder
@Table(name = "category")
@Getter
@Setter
@RequiredArgsConstructor
public class CategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String code;
    @Column
    private String name;

    @OneToMany(mappedBy = "category")
    private List<NewEntity> news = new ArrayList<>();
}
