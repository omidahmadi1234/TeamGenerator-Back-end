package com.example.demo.collaborator;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;


@Entity
@Table
public class Collaborator {
    @Id
    @SequenceGenerator(
            name = "collaborator_sequence",
            sequenceName = "collaborator_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "collaborator_sequence"
    )
    private long id;
    private String name;
    private String lastName;
    private String gender;
    private LocalDate birthday;
    @Transient
    private  int age;



    public Collaborator() {
    }

    public Collaborator(long id,
                        String name,
                        String lastName,
                        String gender,
                        LocalDate birthday)
    {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.birthday = birthday;
    }

    public Collaborator(String name,
                        String lastName,
                        String gender,
                        LocalDate birthday
    ) {

        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.birthday = birthday;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }




    public Integer getAge() {
        return Period.between(this.birthday,LocalDate.now()).getYears(); }
    public void setAge(Integer age ){ this.age = age; }





    @Override
    public String toString() {
        return "Collaborator{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
