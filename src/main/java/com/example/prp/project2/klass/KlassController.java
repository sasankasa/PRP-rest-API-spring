package com.example.prp.project2.klass;

import jakarta.persistence.Access;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/class")
public class KlassController {

    private final KlassService klassService;

    @Autowired
    public KlassController(KlassService klassService) {
        this.klassService = klassService;
    }

    @GetMapping
    public List<Klass> getKlasses() { return klassService.getKlasses();}
}
