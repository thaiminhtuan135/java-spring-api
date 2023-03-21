package example.demo;

import example.demo.model.Person;
import example.demo.repository.AddressRepository;
import example.demo.repository.PersonRepository;
import example.demo.service.StorageService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


import java.io.IOException;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)

//@RequiredArgsConstructor
public class DemoApplication {


	public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

    }

}
