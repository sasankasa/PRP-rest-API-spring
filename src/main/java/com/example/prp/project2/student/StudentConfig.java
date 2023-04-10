package com.example.prp.project2.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunnerStudent(StudentRepository repository) {
        return args -> {
            Student shoto = new Student(
                    "Shoto",
                    "shoto@todoroki.es",
                    LocalDate.of(2007, JANUARY, 11),
                    "1A"
            );

            Student izuku = new Student(
                    "Izuku",
                    "izuku@midoriya.es",
                    LocalDate.of(2006, JULY, 15),
                    "1A"
            );

            Student hitoshi = new Student(
                    "Hitoshi",
                    "hitoshi@shinso.es",
                    LocalDate.of(2006, JULY, 1),
                    "1C"
            );

            Student momo = new Student(
                    "Momo",
                    "momo@yaoyorozu.es",
                    LocalDate.of(2006, SEPTEMBER, 23),
                    "1A"
            );

            Student mei = new Student(
                    "Mei",
                    "mei@hatsume.es",
                    LocalDate.of(2006, APRIL, 18),
                    "1H"
            );

            Student mirio = new Student(
                    "Mirio",
                    "mirio@togata.es",
                    LocalDate.of(2004, JULY, 15),
                    "3B"
            );

            Student tetsutetsu = new Student(
                    "Tetsutetsu",
                    "tetsutetsu@tetsutetsu.es",
                    LocalDate.of(2006, OCTOBER, 16),
                    "1B"
            );

            Student yuga = new Student(
                    "Yuga",
                    "yuga@aoyama.es",
                    LocalDate.of(2006, MAY, 30),
                    "1A"
            );

            Student tamaki = new Student(
                    "Tamaki",
                    "tamaki@amajiki.es",
                    LocalDate.of(2005, MARCH, 4),
                    "3A"
            );

            repository.saveAll(
                    List.of(shoto, izuku, hitoshi, mei, momo, mirio, tetsutetsu, yuga, tamaki)
            );
        };
    }
}
