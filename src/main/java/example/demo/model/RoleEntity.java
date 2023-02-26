package example.demo.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@Entity
@Builder
@Table(name = "role")
@Getter
@Setter
@RequiredArgsConstructor
public class RoleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String code;
    @Column
    private String name;
    @ManyToMany(mappedBy = "roles")
    private List<UserEntity> userEntities = new ArrayList<>();

}
