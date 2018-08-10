package org.test.service;

import org.test.entity.Question;

import java.util.List;

public interface QuestionService {
    List<Question> getQuestions();
    boolean addQuestion(Question question);
    boolean deleteQuestion(String id);
}
