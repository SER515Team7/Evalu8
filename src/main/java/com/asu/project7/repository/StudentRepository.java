package com.asu.project7.repository;

/*
 *@author Ashutosh Dey
 */
import com.asu.project7.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/*This interface is used for CRUD operation on a repository*/
@Repository
public interface StudentRepository extends CrudRepository<Student,Integer> {
}
