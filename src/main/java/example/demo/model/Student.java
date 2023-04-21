package example.demo.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;

    @Column(name = "year_of_birth")
    private int year_of_birth;
    @Column(name = "address")
    private String address;

    @ManyToOne()
    @JoinColumn(name = "classs_id")
    private Classs classs;
}
