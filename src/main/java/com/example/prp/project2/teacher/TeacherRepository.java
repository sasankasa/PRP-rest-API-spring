package com.example.prp.project2.teacher;

import com.example.prp.project2.teacher.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TeacherRepository
        extends JpaRepository<Teacher, Long> {

    Optional<Teacher> findTeacherByEmail(String email);
}
