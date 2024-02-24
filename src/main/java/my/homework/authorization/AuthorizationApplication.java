package my.homework.authorization;

import my.homework.authorization.controller.AuthorizationController;
import my.homework.authorization.repository.UserRepository;
import my.homework.authorization.service.AuthorizationService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class AuthorizationApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthorizationApplication.class, args);
    }

}
