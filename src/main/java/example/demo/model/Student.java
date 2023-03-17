package example.demo.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table
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
    @Column(name = "address")
    private String address;

//    public Student(int id, String name, String address) {
//        this.id = id;
//        this.name = name;
//        this.address = address;
//    }

//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
}
