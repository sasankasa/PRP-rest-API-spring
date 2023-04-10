package com.example.prp.project2.teacher;

import com.example.prp.project2.student.Student;
import com.example.prp.project2.subject.Subject;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZonedDateTime;
import java.util.Set;

@Entity
@Table
public class Teacher {
    @Id
    @SequenceGenerator(
            name = "teacher_sequence",
            sequenceName = "teacher_sequence",
            initialValue = 101,
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "teacher_sequence"
    )
    private Long id;
    private String fullname;
    private String email;
    private LocalDate dob;

    @Transient
    private Integer age;
    private String subjectId;

    //private Subject subject;

    @ManyToMany( fetch = FetchType.LAZY)
    @JoinTable(name = "TeacherStudents", joinColumns = {
            @JoinColumn(name = "teacher_id", referencedColumnName = "id")
    },
        inverseJoinColumns = {
            @JoinColumn(name = "student_id", referencedColumnName = "id")
        })
    private Set<Student> students;


    public Teacher() {
    }

    public Teacher(Long id,
                   String name,
                   String email,
                   LocalDate dob,
                   String subjectId) {
        this.id = id;
        this.fullname = name;
        this.email = email;
        this.dob = dob;
        this.subjectId = subjectId;
    }

    public Teacher(String name,
                   String email,
                   LocalDate dob,
                   String subjectId) {
        this.fullname = name;
        this.email = email;
        this.dob = dob;
        this.subjectId = subjectId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getAge() {
        return Period.between(this.dob, LocalDate.now()).getYears();
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullname='" + fullname + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                ", subjectId=" + subjectId +
                '}';
    }
}

