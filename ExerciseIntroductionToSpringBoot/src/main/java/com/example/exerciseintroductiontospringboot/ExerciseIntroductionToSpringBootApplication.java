package com.example.exerciseintroductiontospringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ExerciseIntroductionToSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExerciseIntroductionToSpringBootApplication.class, args);
    }

}
