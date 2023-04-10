package com.example.prp.project2.teacher;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class TeacherService {

    private final TeacherRepository teacherRepository;

    @Autowired
    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public List<Teacher> getTeachers(){
        return teacherRepository.findAll();
    }

    public void addNewTeacher(Teacher teacher) {
        Optional<Teacher> teacherOptional = teacherRepository
                .findTeacherByEmail(teacher.getEmail());
        if (teacherOptional.isPresent()){
            try {
                throw new IllegalAccessException("email taken");
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
        teacherRepository.save(teacher);
    }

    public void deleteTeacher(Long teacherId) {
        boolean exist = teacherRepository.existsById(teacherId);
        if (!exist){
            try {
                throw new IllegalAccessException("teacher with id " + teacherId + " does not exist");
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
        teacherRepository.deleteById(teacherId);
    }

    @Transactional
    public void updateTeacher(Long teacherId,
                              String name,
                              String email,
                              String subject) {
        Teacher teacher = teacherRepository.findById(teacherId)
                .orElseThrow(() -> new IllegalArgumentException(
                        "teacher with id " + teacherId + " does not exist"));

        if (name != null &&
                name.length() > 0 &&
                !Objects.equals(teacher.getFullname(), name)){
            teacher.setFullname(name);
        }

        if (email != null &&
                email.length() > 0 &&
                !Objects.equals(teacher.getEmail(), email)){
            Optional<Teacher> teacherOptional = teacherRepository.findTeacherByEmail(email);
            if (teacherOptional.isPresent()){
                throw new IllegalStateException("email taken");
            }
            teacher.setEmail(email);
        }

        if (subject != null &&
                subject.length() > 0 &&
                !Objects.equals(teacher.getSubjectId(), subject)){
            teacher.setSubjectId(subject);
        }
    }

}
