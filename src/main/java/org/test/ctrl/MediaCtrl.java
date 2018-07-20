package org.test.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.test.entity.Media;
import org.test.service.MediaService;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class MediaCtrl {

    @Autowired
    MediaService mediaService;

    @RequestMapping("/queryMediaList.do")
    public ModelAndView reqMediaPage() {
        Map<String, Object> model = new HashMap<String, Object>();
        List<Media> media = mediaService.getMedia();
        model.put("mediaFiles", media);
        return new ModelAndView("/admin/mediaList", model);
    }

    /**
     * @apiNote 跳转到更新界面的操作
     * @ RequestParam("id") ---> 从前台页面获取的 id=${editor.id}
     */
    @RequestMapping("/mediaUpdateView.do")
    public ModelAndView reqMediaUpdatePage(@RequestParam("id") int id) {
        Media media = mediaService.QueryById(id);
        HashMap<String, Object> model = new HashMap<>();
        model.put("mediaFiles", media);
        return new ModelAndView("admin/mediaUpdate", model);
    }

    /**
     * @apiNote 媒体库更新功能
     */
    @RequestMapping("/mediaUpdate.do")
    public ModelAndView updateMediaView(Media media) {
        boolean ok = mediaService.updateMedia(media);
        Map<String, Object> model = new HashMap<String, Object>();
        List<Media> me = mediaService.getMedia();
        model.put("mediaFiles", me);
        return new ModelAndView("admin/mediaList", model);
    }


    /**
     * @apiNote 删除媒体库的方法实现
     */
    @RequestMapping("/mediaDelete.do")
    public ModelAndView deleteMedia(String id) {
        boolean ok = mediaService.delete(id);
        Map<String, Object> model = new HashMap<String, Object>();
        List<Media> m = mediaService.getMedia();
        model.put("mediaFiles", m);
        return new ModelAndView("/admin/mediaList", model);
    }

    /**
     * @apiNote 实现跳转到增加媒体库页面
     */
    @RequestMapping("/mediaAddView.do")
    public String reqMediaAddPage() {
        return "/admin/mediaAdd";
    }

    /**
     * @apiNote 增加媒体库的方法实现
     */
    @RequestMapping("/mediaAdd.do")
    public ModelAndView reqAddMedia(@RequestParam(value = "name") String name,
                                    @RequestParam(value = "type") String type,
                                    @RequestParam(value = "multipartFile") MultipartFile file,
                                    HttpServletRequest request){
        Media media = new Media();
        media.setName(name);
        media.setType(type);

        ServletContext application = request.getServletContext();
        int index = file.getOriginalFilename().lastIndexOf(".");
        String suffix = file.getOriginalFilename().substring(index + 1);
        String fileName = "/Users/apple/Desktop/media" + File.separator + name + "." + suffix;
        try {

            file.transferTo(new File(fileName));
        } catch (Exception e) {
            e.printStackTrace();
        }
        media.setPath(fileName);

        boolean ok = mediaService.addMedia(media);
        Map<String, Object> model = new HashMap<String, Object>();
        if (ok) {
            List<Media> medi = mediaService.getMedia();
            model.put("mediaFiles", medi);
            return new ModelAndView("admin/mediaList", model);
        } else {
            model.put("info", "添加失败");
            return new ModelAndView("admin/mediaAdd", model);
        }
    }

    /**
     * 显示媒体库资源文件
     */
    @RequestMapping("/mediaFile.do")
    public void mediaFile(int id, String Path, HttpServletRequest request, HttpServletResponse response) {
        // 找到文件
        ServletContext application = request.getServletContext();
        // String realPath = application.getRealPath("/Users/apple/Desktop/photo");
        String fileName = "/Users/apple/Desktop/media" + File.separator + id + "." + Path;
        File file = new File(fileName);
        if (file.exists()) {
            byte[] buffer = new byte[1024];
            FileInputStream fis = null;
            BufferedInputStream bis = null;
            try {
                fis = new FileInputStream(file);
                bis = new BufferedInputStream(fis);
                OutputStream os = response.getOutputStream();
                int i = bis.read(buffer);
                while (i != -1) {
                    os.write(buffer, 0, i);
                    i = bis.read(buffer);
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (bis != null)
                    try {
                        bis.close();
                    } catch (Exception e) {
                    }
                if (fis != null)
                    try {
                        fis.close();
                    } catch (Exception e) {
                    }
            }
        }
    }

}
