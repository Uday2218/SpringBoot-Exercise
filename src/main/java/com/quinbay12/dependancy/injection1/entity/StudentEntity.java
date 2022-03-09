package com.quinbay12.dependancy.injection1.entity;


//import nonapi.io.github.classgraph.json.Id;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="studententity")
public class StudentEntity {

    @Id
    //final int number = 1;
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id",nullable = false)
    private Long id;

    @NotBlank(message="Student Name cannot be empty")
    private String firstname;
    private String lastname;
    private String branch;

    public StudentEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public StudentEntity(Long id, @NotBlank(message = "Student Name cannot be empty") String firstname, String lastname, String branch) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.branch = branch;
    }
}
