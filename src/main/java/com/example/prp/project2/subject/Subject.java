package com.example.prp.project2.subject;

import com.example.prp.project2.teacher.Teacher;
import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table
public class Subject {

    @Id
    private String id;
    private String subject;

    public Subject() {
    }

    public Subject(String id, String subject) {
        this.id = id;
        this.subject = subject;
    }

    public Subject(String subject) {
        this.subject = subject;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id='" + id + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
