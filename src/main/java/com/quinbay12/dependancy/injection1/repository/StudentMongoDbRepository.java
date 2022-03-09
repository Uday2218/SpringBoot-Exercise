package com.quinbay12.dependancy.injection1.repository;

import com.quinbay12.dependancy.injection1.entity.MongoStudentEntity;
import com.quinbay12.dependancy.injection1.entity.StudentEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentMongoDbRepository  extends MongoRepository<MongoStudentEntity,Long> {
}
