package org.test.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.test.entity.Article;
import org.test.entity.User;
import org.test.service.ArticleService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ArticleCtrl {
    @Autowired
    private ArticleService mArticleService;

    @RequestMapping("/queryArticlelist.do")
    public ModelAndView reqArticlePage(){
        Map<String,Object> model= new HashMap<>();
        List<Article> articles =mArticleService.getArtciles();
        model.put("articleList",articles);
        return new ModelAndView("/admin/articleList",model);
    }

    /**
     * @apiNote 删除文章的方法实现
     */
    @RequestMapping("/articleDelete.do")
    public ModelAndView deleteArticle(String id) {
        boolean ok = mArticleService.delete(id);
        Map<String, Object> model = new HashMap<String, Object>();
        List<Article> articles = mArticleService.getArtciles();
        model.put("articleList", articles);
        return new ModelAndView("/admin/editorList", model);
    }
    /**
     * @apiNote 实现跳转到增加信息录入员页面
     */
    @RequestMapping("/articleAddView.do")
    public String reqArticleAddPage() {
        return "/admin/articleAdd";
    }

    /**
     * @apiNote 增加文章的方法实现
     */
    @RequestMapping("/articleAdd.do")
    public ModelAndView reqAddArticle(String name, String content) {
        Article article=new Article();
        article.setName(name);
        article.setContent(content);
        boolean ok = mArticleService.addArticle(article);
        Map<String, Object> model = new HashMap<String, Object>();
        if (ok) {
            List<Article> articles = mArticleService.getArtciles();
            model.put("articleList", articles);
            return new ModelAndView("admin/articleList", model);
        } else {
            model.put("info", "添加失败");
            return new ModelAndView("admin/articleAdd", model);
        }
    }


}
