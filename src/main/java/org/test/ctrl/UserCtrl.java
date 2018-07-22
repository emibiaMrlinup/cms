package org.test.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.test.entity.User;
import org.test.service.UserService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author marshmello
 * @apiNote UserCtrl用户模块管理的控制器
 */
@Controller
public class UserCtrl{

    private UserService mUserService;

    @Autowired
    public UserCtrl(UserService userService) {
        this.mUserService = userService;
    }

    @RequestMapping("/")
    public String reqAdminPage() {
        return "/admin/index";
    }

    /**
     * @apiNote 查询显示信息录入员列表
     */
    @RequestMapping("/queryEditorList.do")
    public ModelAndView reqEditorPage() {
        Map<String, Object> model = new HashMap<String, Object>();
        List<User> editors = mUserService.getEditors();
        model.put("editors", editors);
        return new ModelAndView("/admin/editorList", model);
    }

    /**
     * @apiNote 实现跳转到增加信息录入员页面
     */
    @RequestMapping("/editorAddView.do")
    public String reqEditorAddPage() {
        return "/admin/editorAdd";
    }

    /**
     * @apiNote 增加信息录入员的方法实现
     */
    @RequestMapping("/editorAdd.do")
    public ModelAndView reqAddEditor(String username, String password, String sex) {
        User editor = new User();
        editor.setUsername(username);
        editor.setPassword(new BCryptPasswordEncoder().encode(password));
        editor.setSex(sex);

        boolean ok = mUserService.addEditor(editor);
        Map<String, Object> model = new HashMap<String, Object>();
        if (ok) {
            List<User> editors = mUserService.getEditors();
            model.put("editors", editors);
            return new ModelAndView("admin/editorList", model);
        } else {
            model.put("info", "添加失败");
            return new ModelAndView("admin/editorAdd", model);
        }
    }

    /**
     * @apiNote 删除信息录入员的方法实现
     */
    @RequestMapping("/editorDelete.do")
    public ModelAndView deleteEditor(String id) {
        boolean ok = mUserService.delete(id);
        Map<String, Object> model = new HashMap<String, Object>();
        List<User> editors = mUserService.getEditors();
        model.put("editors", editors);
        return new ModelAndView("/admin/editorList", model);
    }

    /**
     * @apiNote 更新功能
     */
    @RequestMapping("/editorUpdate.do")
    public ModelAndView updateEditorView(User user) {
        boolean ok = mUserService.updateEditor(user);
        Map<String, Object> model = new HashMap<String, Object>();
        List<User> editors = mUserService.getEditors();
        model.put("editors", editors);
        return new ModelAndView("admin/editorList", model);
    }

    /**
     * @apiNote 跳转到更新界面的操作
     * @ RequestParam("id") ---> 从前台页面获取的 id=${editor.id}
     */
    @RequestMapping("/editorUpdateView.do")
    public ModelAndView reqEditorUpdatePage(@RequestParam("id") int id) {
        User editor = mUserService.QueryById(id);
        HashMap<String, Object> model = new HashMap<>();
        model.put("editor", editor);
        return new ModelAndView("admin/editorUpdate", model);
    }


}
