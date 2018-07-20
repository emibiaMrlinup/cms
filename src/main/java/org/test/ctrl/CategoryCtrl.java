package org.test.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.test.entity.Category;
import org.test.entity.CategoryVO;
import org.test.service.CategoryService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class CategoryCtrl {
    @Autowired
    CategoryService mCategoryService;

    @RequestMapping("/queryCategorylist.do")
    public ModelAndView reqCategoryPage() {
        Map<String, Object> model = new HashMap<String, Object>();
        List<CategoryVO> categories = mCategoryService.getCategorys();
        model.put("categories", categories);
        return new ModelAndView("/admin/categoryList", model);
    }
/**
 * @apiNote 前台获取到data  在前台做逻辑判断处理数据
 * */
    @RequestMapping("/queryCategorylists.do")
    public ModelAndView reqCategoryPage1() {
        Map<String, Object> model = new HashMap<String, Object>();
        List<Category> categories = mCategoryService.getCategory();
        model.put("category", categories);
        return new ModelAndView("/admin/categoryList1", model);
    }
    @RequestMapping("/Categorymanage.do")
    public ModelAndView reqCategoryPage() {
        Map<String,Object> model=new HashMap<String,Object>();
        List<Category> categories=mCategoryService.getCategory();
        model.put("category",categories);
        return new ModelAndView("/admin/categoryManage",model);
    }
    @RequestMapping("/categoryUpdate.do")
    public ModelAndView UpdateCategory(Category category){
        boolean b = mCategoryService.updateCategorys(category);
        Map<String,Object> model =new HashMap<String,Object>();
        List<Category> categorys=mCategoryService.getCategory();
        model.put("category",categorys);
        return new ModelAndView("/admin/categoryList1",model);
    }

    @RequestMapping("/CategoryUpdateView.do")
    public ModelAndView GetToUpdatepage(@RequestParam("id") int id){
        Category category = mCategoryService.QueryById(id);
        Map<String,Object> model = new HashMap<String,Object>();
        model.put("category",category);
        return  new ModelAndView("/admin/categoryUpdate",model);

    }

}
