package com.quinbay12.dependancy.injection1.dto;

public class Department {
    String Deptname;
    String Deptid;
    String DeptProfName;

    public String getDeptname() {
        return Deptname;
    }

    public void setDeptname(String deptname) {
        Deptname = deptname;
    }

    public String getDeptid() {
        return Deptid;
    }

    public void setDeptid(String deptid) {
        Deptid = deptid;
    }

    public String getDeptProfName() {
        return DeptProfName;
    }

    public void setDeptProfName(String deptProfName) {
        DeptProfName = deptProfName;
    }

    public Department(String deptname, String deptid, String deptProfName) {
        Deptname = deptname;
        Deptid = deptid;
        DeptProfName = deptProfName;
    }
}
