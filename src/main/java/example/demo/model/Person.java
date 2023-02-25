package example.demo.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Builder
@Table
@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name")
    private String name;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "address_id", referencedColumnName = "id")
//    private Address address;

}
