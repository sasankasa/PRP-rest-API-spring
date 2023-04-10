package com.example.prp.project2.klass;

import com.example.prp.project2.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KlassService {

    private final KlassRepository klassRepository;

    @Autowired
    public KlassService(KlassRepository klassRepository) {
        this.klassRepository = klassRepository;
    }

    public List<Klass> getKlasses() { return klassRepository.findAll();}
}
