package org.test.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CmsCtrl {
    //跳转到后台主页
    @RequestMapping("/")
    public String reqAdminPage() {
        return "/admin/index";
    }
    //跳转到前台主页
    @RequestMapping("/front")
    public String reqFrontPage() {
        return "/front/home";
    }

}
