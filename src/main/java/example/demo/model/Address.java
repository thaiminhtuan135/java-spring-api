package example.demo.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
@Table
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "city")
    private String city;
    @Column(name = "province")
    private String province;

    @OneToOne
    @JoinColumn(name = "person_id")
    private Person person;

}
