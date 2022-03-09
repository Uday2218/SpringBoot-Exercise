package com.quinbay12.dependancy.injection1.repository;

import com.quinbay12.dependancy.injection1.entity.StudentEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository  extends CrudRepository<StudentEntity,Long> {
}
