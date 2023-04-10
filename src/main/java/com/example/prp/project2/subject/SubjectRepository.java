package com.example.prp.project2.subject;

import com.example.prp.project2.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SubjectRepository
        extends JpaRepository<Subject, String> {

    Optional<Subject> findSubjectById(String Id);
}
