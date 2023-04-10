package com.example.prp.project2.subject;

import com.example.prp.project2.teacher.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubjectService {

    private final SubjectRepository subjectRepository;

    @Autowired
    public SubjectService(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

    public List<Subject> getSubjects() {
        return subjectRepository.findAll();
    }

    public void addNewSubject(Subject subject) {
        Optional<Subject> subjectOptional = subjectRepository
                .findSubjectById(subject.getId());
        if (subjectOptional.isPresent()){
            try {
                throw new IllegalAccessException("ID taken");
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
        subjectRepository.save(subject);
    }

    public void deleteSubject(String subjectId) {
        boolean exist = subjectRepository.existsById(subjectId);
        if (!exist){
            try {
                throw new IllegalAccessException("subject with id " + subjectId + " does not exist");
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
        subjectRepository.deleteById(subjectId);
    }

}
