package com.quinbay12.dependancy.injection1.repository;

import com.quinbay12.dependancy.injection1.dto.Department;
import com.quinbay12.dependancy.injection1.dto.Student;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;



@Component
public class Departmentdb {
    List<Department> list=new ArrayList();

    public List<Department> getdepartmentlist()
    {
        if(list.size()== 0) {

            Department D1 = new Department("ECE","1","Virat");
            Department D2 = new Department("IT", "2", "kohli");
            Department D3 = new Department("CSE", "3", "dhoni");
            list.add(D1);
            list.add(D2);
            list.add(D3);

        }
        return (list);
    }






}





