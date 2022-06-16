package com.example.demo.collaborator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CollaboratorService {

    private final CollaboratorRepository collaboratorRepository;

    @Autowired
    public CollaboratorService(CollaboratorRepository collaboratorRepository) {
        this.collaboratorRepository = collaboratorRepository;
    }

    public List<Collaborator> getCollaborators(){
        return collaboratorRepository.findAll();

    }

    public void addNewCollaborator(Collaborator collaborator) {
        Optional<Collaborator> collaboratorOptional = collaboratorRepository
                .findCollaboratorByLastName(collaborator.getLastName());

        if(collaboratorOptional.isPresent()){
            throw new IllegalStateException("lastName taken");

        }

        collaboratorRepository.save(collaborator);
    }

}
