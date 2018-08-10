package org.test.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.test.entity.Article;
import org.test.service.ArticleService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ArticleCtrl {
    @Autowired
    private ArticleService mArticleService;

    @RequestMapping("/articleList.do")
    public ModelAndView reqArticlePage(){
        Map<String,Object> model= new HashMap<>();
        List<Article> articles =mArticleService.getArticles();
        model.put("articles",articles);
        return new ModelAndView("/admin/article",model);
    }

    /**
     * @apiNote 实现跳转到增加文章页面
     */
    @RequestMapping("/articleAddView.do")
    public String reqArticleAddPage() {
        return "/admin/articleAdd";
    }

    /**
     * @apiNote 增加文章的方法实现
     * @ResponseBody  //使用此注解不走视图解析器，可以直接返回字符串，或者添加相应json配置后返回json数据到网页
     */
    @ResponseBody
    @RequestMapping("/articleAdd.do")
    public String addArticle(Article article, Model model){
//         System.out.println(article.getName());
//         System.out.println(article.getContent());
//         System.out.println(article.getEditTime());
        try {
            long id = mArticleService.addArticle(article);
            return  String.valueOf(id);
        }catch (Exception e){
            e.printStackTrace();
        }
        return  null;
    }
    //查询文章信息
    @RequestMapping("/article_info.do")
    public String Article_info(@RequestParam int id, Model model) {
        Article article=mArticleService.SelectById(id);
        System.out.println("查询到当前文章的ID值："+article.getId());
            model.addAttribute("article", article);
            return "/admin/article_info";
        }



//点击某个具体的id 根据id跳转到具体的文章界面进行修改
@RequestMapping("/articleUpdateView.do")
    public  ModelAndView  reqArticleUpdatePage(@RequestParam("id") int id){

        Article article=mArticleService.SelectById(id);
        System.out.println("查询到当前文章的ID值："+article.getId());

         HashMap<String, Object> model = new HashMap<>();
         model.put("article", article);
        return new ModelAndView("/admin/articleUpdate", model);
    }

//修改文章的功能  图片显示？
@RequestMapping("/articleUpdate.do")
public ModelAndView updateArticle(Article article) {
    boolean ok = mArticleService.updateArticle(article);
    Map<String, Object> model = new HashMap<String, Object>();
    model.put("article", article);
    return new ModelAndView("admin/article_info", model);
    }

    /**
     * @apiNote 删除文章的方法实现
     */
    @RequestMapping("/articleDelete.do")
    public ModelAndView deleteArticle(String id) {
        boolean ok = mArticleService.delete(id);
        Map<String, Object> model = new HashMap<String, Object>();
        List<Article> articles = mArticleService.getArticles();
        model.put("articles", articles);
        return new ModelAndView("/admin/editorList", model);
    }

}