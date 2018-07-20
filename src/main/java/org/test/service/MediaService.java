package org.test.service;

import org.test.entity.Media;
import org.test.entity.User;

import java.util.List;

/**
 * @author marshmello
 * @apiNote 媒体库管理针对接口编程 调用mapper
 */
public interface MediaService {
    List<Media> getMedia();

    public Media QueryById(int id);

    public boolean updateMedia(Media media);

    public boolean addMedia(Media media);

    public boolean delete(String id);

}
