package org.test.ctrl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.test.entity.Article;
import org.test.entity.Category;
import org.test.entity.Form;
import org.test.entity.Formele;
import org.test.service.ArticleService;
import org.test.service.CategoryService;
import org.test.service.EleService;
import org.test.service.FormService;

import javax.jws.WebParam;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class FormCtrl {
@Autowired
    FormService formService;
@Autowired
    CategoryService categoryService;
@Autowired
    EleService eleService;
@Autowired
    ArticleService articleService;

//表单列表
@RequestMapping("/formlist.do")
    public ModelAndView getFormList(){
    Map<String,Object> model = new HashMap<String,Object>();
    List<Form> forms = formService.getForms();
    model.put("forms",forms);
    return new ModelAndView("/admin/formList",model);
}

//表单添加
@RequestMapping("/addFormView.do")
public ModelAndView gotoAddView(){
    Map<String,Object> model = new HashMap<String,Object>();
    List<Category> cate = categoryService.getCategory();
    List<Article> article = articleService.getArtciles();
    model.put("cates",cate);
    model.put("articles",article);
    return new ModelAndView("/admin/formAdd",model);
}

@RequestMapping("/FormAdd.do")
    public ModelAndView addForm(String name,String publish,String categoris,String articles) {
    Form form = new Form();
    form.setName(name);
    form.setPublish(publish);
    form.setCategoris(categoris);
    form.setArticles(articles);
    boolean yes = formService.addForm(form);
    Map<String,Object> model = new HashMap<String,Object>();
    if(yes){
        List<Form> forms = formService.getForms();
       // List<Category> cates = categoryService.getCategory();
        model.put("forms",forms);
       // model.put("cates",cates);
        return  new ModelAndView( "/admin/formList",model);
    }else{
        return  new ModelAndView("/admin/formAdd",model);
    }
}

//表单元素列表页内添加表单元素
@RequestMapping("/eleAddView.do")
public ModelAndView ToEleAddVIew(){
    List<Form> form = formService.getForms();
    Map<String,Object> model  =new HashMap<String,Object>();
    model.put("forms",form);
    return new ModelAndView("/admin/formeleAdd",model);
}
@RequestMapping("/FormeleAdd.do")
public ModelAndView AddEle(String formname,String name){
    Formele formele = new Formele();
    formele.setFormname(formname);
    formele.setName(name);
    boolean yes = eleService.addEle(formele);
    Map<String,Object> model = new HashMap<String,Object>();
    List<Formele> ele= eleService.getEles();
    List<Form> form = formService.getForms();
    model.put("form",form);
    model.put("eles",ele);
    return new ModelAndView("/admin/formeleList",model);
}

//表单列表页内添加表单元素
@RequestMapping("/elementAddView.do")
public ModelAndView TopageAddElement(@RequestParam("id") int id){
    Form form = formService.QueryById(id);
    Map<String,Object> model =  new HashMap<String,Object>();
    model.put("forms",form);
    return new ModelAndView("/admin/eleAdd",model);
}
@RequestMapping("/eleAdd.do")
public ModelAndView InPageAddElement(String formname,String name){
    Formele formele = new Formele();
    formele.setName(name);
    formele.setFormname(formname);
    boolean yes = eleService.addEle(formele);
    Map<String,Object> model = new HashMap<String,Object>();
    List<Form> form = formService.getForms();
    model.put("forms",form);
    return new ModelAndView("/admin/formList",model);
}


//修改表单
@RequestMapping("/FormUpdateView.do")
    public ModelAndView gotoupdateView(@RequestParam("id") int id){
    Form form = formService.QueryById(id);
    Map<String,Object> model =  new HashMap<String,Object>();
    model.put("form",form);
    return new ModelAndView("/admin/formUpdate",model);
}
//删除表单
@RequestMapping("/FormDelete.do")
    public ModelAndView deleteForm(String id){
    boolean yes = formService.deleteForm(id);
    Map<String,Object> model = new HashMap<String,Object>();
    List<Form> form = formService.getForms();
    model.put("forms",form);
  return  new ModelAndView("/admin/formList",model);
}

//表单元素列表
@RequestMapping("/addFormeleView.do")
    public ModelAndView getformeleList(){
   List <Formele> ele = eleService.getEles();
   List<Form> form = formService.getForms();
    Map<String,Object> model =  new HashMap<String,Object>();
    model.put("form",form);
    model.put("eles",ele);
    return new ModelAndView("/admin/formeleList",model);
}

//删除表单元素
@RequestMapping("/FormeleDelete.do")
    public ModelAndView DeleteElement(String id){
    boolean yes = eleService.delete(id);
    Map<String,Object> model = new HashMap<String,Object>();
    List<Formele> ele = eleService.getEles();
    List<Form> form = formService.getForms();
    model.put("eles",ele);
    model.put("form",form);
    return new ModelAndView("/admin/formeleList",model);
}
//查看表单元素效果
 @RequestMapping("/FormView.do")
    public ModelAndView FormViewPage(@RequestParam("id") int id){
      Form form = formService.QueryById(id);
      List<Formele> ele = eleService.getEles();
      Map<String,Object> model = new HashMap<String,Object>();
      model.put("form",form);
      model.put("eles",ele);
    return new ModelAndView("/admin/formView",model);
 }

}
