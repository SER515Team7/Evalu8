package com.asu.project7.repository;

import com.asu.project7.model.Questions;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends CrudRepository<Questions,Integer> {
}
