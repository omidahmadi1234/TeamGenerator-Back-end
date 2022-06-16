package com.example.demo.collaborator;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Optional;

@Repository
public interface CollaboratorRepository
        extends JpaRepository<Collaborator,Long> {


    // SELECT * FROM Collaborator WHERE age = ?


    @Query("SELECT s FROM Collaborator  s  WHERE s.lastName=?1 ")
    Optional<Collaborator>findCollaboratorByLastName(String lastName);


}
