package com.example.demo.collaborator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/collaborator")
public class CollaboratorController {

    private final CollaboratorService collaboratorService;

@Autowired
    public CollaboratorController(CollaboratorService collaboratorService) {
        this.collaboratorService =   collaboratorService;
    }

    @GetMapping
    public List<Collaborator> getCollaborators(){

        return collaboratorService.getCollaborators();


    }


    @PostMapping
    public void registerNewCollaborator(@RequestBody Collaborator collaborator){
    collaboratorService.addNewCollaborator(collaborator);
    }



}
