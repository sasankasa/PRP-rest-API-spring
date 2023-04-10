package com.example.prp.project2.teacher;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class TeacherConfig {

    @Bean

    CommandLineRunner commandLineRunnerTeacher(TeacherRepository repository){
        return args -> {
            Teacher aizawa = new Teacher(
                    "Shota Aizawa",
                    "aizawa@ua.org",
                    LocalDate.of(1992, NOVEMBER, 8),
                    "HRM"
            );

            Teacher yamada = new Teacher(
                    "Hizashi Yamada",
                    "yamada@ua.org",
                    LocalDate.of(1992, JULY, 7),
                    "ENG"
            );

            Teacher kayama = new Teacher(
                    "Nemuri Kayama",
                    "kayama@ua.org",
                    LocalDate.of(1991, MARCH, 9),
                    "ART"
            );

            Teacher kan = new Teacher(
                    "Sekijiro Kan",
                    "kan@ua.org",
                    LocalDate.of(1992, NOVEMBER, 10),
                    "HRM"
            );

            Teacher nezu = new Teacher(
                    "Nezu",
                    "principal@ua.org",
                    LocalDate.of(1978, JANUARY, 1),
                    "ANS"
            );

            Teacher ishiyama = new Teacher(
                    "Ken Ishiyama",
                    "ishiyama@ua.org",
                    LocalDate.of(1994, MARCH, 22),
                    "LIT"
            );

            repository.saveAll(
                    List.of(aizawa, yamada, kayama, kan, nezu, ishiyama)
            );
        };
    }
}
