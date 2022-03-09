package com.quinbay12.dependancy.injection1.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class Student implements Serializable {
    @NotNull

    private Long id;
    @NotBlank(message="Student name cannot be empty")
    private String Firstname;
    private  String Lastname;
    private String branch;
    String Deptid;

    public Long getId() {

        return id;
    }

    public void setId(long id) {


        this.id = id;
    }

    public String getFirstname() {

        return Firstname;
    }

    public void setFirstname(String firstname) {

        Firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname)
    {
        Lastname = lastname;
    }

    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }



    public Student(Long id, String firstname, String lastname, String branch) {
        this.id = id;
        Firstname = firstname;
      Lastname = lastname;
        this.branch = branch;
    }

    public Student() {
    }
}
