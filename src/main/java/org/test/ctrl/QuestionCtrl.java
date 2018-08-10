package org.test.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.test.entity.Question;
import org.test.service.QuestionService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
public class QuestionCtrl {
    @Autowired
    QuestionService questionService;

    @RequestMapping("/QuestionListView.do")
    public String reqQuestionListView(){ return ("/admin/QuestionList"); }

    @RequestMapping("/addQuestionView.do")
    public String reqAddQuestionView(){
        return ("/admin/addQuestionList");
    }

    @RequestMapping("/selectQuestion01.do")
    public ModelAndView reqQuestion01List(){
        Map<String, Object> model = new HashMap<String, Object>();
        List<Question> questions = questionService.getQuestions();
        model.put("questions",questions);
        return new ModelAndView("/admin/QuestionList01", model);
    }

    @RequestMapping("/addQuestion.do")
    public String reqAddQuestion(@RequestParam("username") String username,@RequestParam("old") String old,@RequestParam("selects") String selects,@RequestParam("sex") String sex,@RequestParam("page") String page,@RequestParam("comments") String comments){
        Question question = new Question();
        question.setUsername(username);
        question.setOld(old);
        question.setSelects(selects);
        question.setSex(sex);
        question.setPage(page);
        question.setComments(comments);

        boolean ok = questionService.addQuestion(question);
        Map<String, Object> model = new HashMap<String, Object>();

        if (ok){
            return ("/admin/success");
        }else {
            return ("/admin/error");
        }
    }
    @RequestMapping("/deleteQuestion.do")
    public ModelAndView deleteEditor(@RequestParam("id") String id) {
        boolean ok = questionService.deleteQuestion(id);
        Map<String, Object> model = new HashMap<String, Object>();
        if (ok) {
            List<Question> questions = questionService.getQuestions();
            model.put("questions", questions);
            return new ModelAndView("/admin/QuestionList01", model);
        } else {
            return null;
        }
    }
}
