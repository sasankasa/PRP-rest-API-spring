package com.example.prp.project2.subject;

import com.example.prp.project2.teacher.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/subject")
public class SubjectController {

    private final SubjectService subjectService;

    @Autowired

    public SubjectController(SubjectService subjectService) {
        this.subjectService = subjectService;
    }

    @GetMapping
    public List<Subject> getSubjects(){
        return subjectService.getSubjects();
    }

    @PostMapping
    public void registerNewSubject(@RequestBody Subject subject){
        subjectService.addNewSubject(subject);
    }

    @DeleteMapping(path="{subjectId}")
    public void deleteTeacher(
            @PathVariable("subjectId") String subjectId){
        subjectService.deleteSubject(subjectId);
    }
}
