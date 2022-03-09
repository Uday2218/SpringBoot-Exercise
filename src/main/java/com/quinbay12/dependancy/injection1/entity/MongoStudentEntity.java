package com.quinbay12.dependancy.injection1.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Document(collection = "student")
public class MongoStudentEntity {
    @Id
    private Long id;
    private  String firstname;
    private String lastname;
    private String branch;

    public Long getId() {
        return id;
    }

    public MongoStudentEntity(Long id, String firstname, String lastname, String branch) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.branch = branch;
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

    public MongoStudentEntity() {
    }
}
