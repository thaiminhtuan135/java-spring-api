package example.demo;

import example.demo.domain.Role;
import example.demo.domain.User;
import example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.HashSet;

@SpringBootApplication
//@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
//@RequiredArgsConstructor
public class DemoApplication {

	public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

    }
    @Bean
    CommandLineRunner runner(UserService userService) {
        return args -> {
            userService.saveRole(new Role(null,"ROLE_USER"));
            userService.saveRole(new Role(null,"ROLE_MANAGER"));
            userService.saveRole(new Role(null,"ROLE_ADMIN"));
            userService.saveRole(new Role(null,"ROLE_SUPER_ADMIN"));

            userService.saveUser(new User(null, "John Travolta","john" , "123456", new ArrayList<>()));
            userService.saveUser(new User(null, "Will Smith","will" , "123456", new ArrayList<>()));
            userService.saveUser(new User(null, "Jim Carry","jim" , "123456", new ArrayList<>()));
            userService.saveUser(new User(null, "Arnold Schwarzenegger","arnold" , "123456", new ArrayList<>()));

            userService.addRoleToUser("john","ROLE_ADMIN");
            userService.addRoleToUser("john","ROLE_MANAGER");
            userService.addRoleToUser("will","ROLE_MANAGER");
            userService.addRoleToUser("jim","ROLE_ADMIN");
            userService.addRoleToUser("arnold","ROLE_ADMIN");
            userService.addRoleToUser("arnold","ROLE_MANAGER");

        };
    }

}
