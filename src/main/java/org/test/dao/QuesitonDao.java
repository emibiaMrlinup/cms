package org.test.dao;

import org.springframework.stereotype.Repository;
import org.test.entity.Question;

import java.util.List;

@Repository
public interface QuesitonDao {
    List<Question> getQuestions();
    int addQuestion(Question question);
    int deleteQuestion(String id);

}
