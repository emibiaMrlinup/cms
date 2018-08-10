package org.test.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.test.dao.QuesitonDao;
import org.test.entity.Question;
import org.test.service.QuestionService;

import java.util.List;


@Service
@Transactional// @Transactional表示该类被Spring作为管理事务的类
public class QuestionServiceImp implements QuestionService {
    Logger logger=Logger.getLogger(CategoryServiceImp.class);


    @Autowired
    QuesitonDao mQuestionDao;
    @Override
    public boolean addQuestion(Question question){
        if (mQuestionDao.addQuestion(question)>0){
            return true;
        }else{
            return false;
        }
    }
    @Override
    public List<Question> getQuestions(){
        return mQuestionDao.getQuestions();
    }

    @Override
    public boolean deleteQuestion(String id){
        if (mQuestionDao.deleteQuestion(id)>0){
            return true;
        }else {
            return false;
        }
    }
}
