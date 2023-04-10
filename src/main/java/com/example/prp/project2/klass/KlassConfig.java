package com.example.prp.project2.klass;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class KlassConfig {

    @Bean
    CommandLineRunner commandLineRunner4(KlassRepository repository){
        return args -> {
            Klass a = new Klass(
                    "1A"
            );

            Klass b = new Klass(
                    "1B"
            );

            Klass c = new Klass(
                    "1C"
            );

            Klass d = new Klass(
                    "1D"
            );

            Klass e = new Klass(
                    "1E"
            );

            Klass f = new Klass(
                    "1F"
            );

            Klass g = new Klass(
                    "1G"
            );

            Klass h = new Klass(
                    "1H"
            );

            Klass aa = new Klass(
                    "2A"
            );

            Klass bb = new Klass(
                    "2B"
            );

            Klass cc = new Klass(
                    "2C"
            );

            Klass dd = new Klass(
                    "2D"
            );

            Klass ee = new Klass(
                    "2E"
            );

            Klass ff = new Klass(
                    "2F"
            );

            Klass gg = new Klass(
                    "2G"
            );

            Klass hh = new Klass(
                    "2H"
            );

            Klass aaa = new Klass(
                    "3A"
            );

            Klass bbb = new Klass(
                    "3B"
            );

            Klass ccc = new Klass(
                    "3C"
            );

            Klass ddd = new Klass(
                    "3D"
            );

            Klass eee = new Klass(
                    "3E"
            );

            Klass fff = new Klass(
                    "3F"
            );

            Klass ggg = new Klass(
                    "3G"
            );

            Klass hhh = new Klass(
                    "3H"
            );

            repository.saveAll(
                    List.of(a,b,c,d,e,f,g,h,
                            aa,bb,cc,dd,ee,ff,gg,hh,
                            aaa,bbb,ccc,ddd,eee,fff,ggg,hhh)
            );
        };
    }
}
