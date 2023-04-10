package com.example.prp.project2.klass;

import com.example.prp.project2.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface KlassRepository
        extends JpaRepository<Klass, Long> {

    Optional<Klass> findClassById(Long Id);
}
