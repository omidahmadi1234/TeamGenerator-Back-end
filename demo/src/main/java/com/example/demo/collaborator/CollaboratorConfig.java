package com.example.demo.collaborator;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class CollaboratorConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            CollaboratorRepository repository) {
        return args -> {
            Collaborator omid = new Collaborator(

                    "Omid",
                    "ahmqdi",
                    "male",
                    LocalDate.of(2000, 1, 5)
            );

            Collaborator cristiano = new Collaborator(

                    "Cristiano",
                    "Ronaldo",
                    "male",
                    LocalDate.of(2000, 1, 5)
            );


            Collaborator messi = new Collaborator(

                    "Leon",
                    "Messi",
                    "male",
                    LocalDate.of(2019, 1, 5)
            );



            Collaborator jahn = new Collaborator(

                    "Jhon",
                    "Frank",
                    "male",
                    LocalDate.of(2000, 1, 5)
            );

            repository.saveAll(
                    List.of(omid, cristiano, messi,jahn)
            );
        };
    }
}
