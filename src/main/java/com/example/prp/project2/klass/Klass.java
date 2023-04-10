package com.example.prp.project2.klass;

import jakarta.persistence.*;

@Entity
@Table
public class Klass {

    @Id
    @SequenceGenerator(
            name = "klass_sequence",
            sequenceName = "klass_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "klass_sequence"
    )
    private Long id;
    private String klass;

    public Klass() {
    }

    public Klass(Long id, String klass) {
        this.id = id;
        this.klass = klass;
    }

    public Klass(String klass) {
        this.klass = klass;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKlass() {
        return klass;
    }

    public void setKlass(String klass) {
        this.klass = klass;
    }

    @Override
    public String toString() {
        return "Klass{" +
                "id=" + id +
                ", klass='" + klass + '\'' +
                '}';
    }
}
