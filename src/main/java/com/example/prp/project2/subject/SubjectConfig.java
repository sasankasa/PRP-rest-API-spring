package com.example.prp.project2.subject;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SubjectConfig {

    @Bean
    CommandLineRunner commandLineRunner3(SubjectRepository repository){
        return args -> {
            Subject eng = new Subject(
                    "ENG",
                    "English"
            );
            Subject fhs = new Subject(
                    "FHS",
                    "Foundational Hero Studies"
            );
            Subject art = new Subject(
                    "ART",
                    "Modern Hero Art History"
            );
            Subject lit = new Subject(
                    "LIT",
                    "Modern Literature"
            );
            Subject hrm = new Subject(
                    "HRM",
                    "Homeroom"
            );
            Subject mat = new Subject(
                    "MAT",
                    "Mathematics"
            );
            Subject her = new Subject(
                    "HER",
                    "Heroics"
            );
            Subject ans = new Subject(
                    "ANS",
                    "Analysis"
            );

            repository.saveAll(
                    List.of(eng, fhs, art, lit, hrm, mat, her, ans)
            );
        };
    }
}
