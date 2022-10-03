package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.AUGUST;
import static java.time.Month.JANUARY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student mariam = new Student(
                    "Mariam",
                    "mariam@gmail.com",
                    LocalDate.of(2000, JANUARY, 1)
            );
            Student adrian = new Student(
                    "adrian",
                    "adrianaranda@gmail.com",
                    LocalDate.of(2004, AUGUST, 21));
            repository.saveAll(
                    List.of(mariam, adrian)
            );
        };
    }
}
