package org.test.dao;

import org.springframework.stereotype.Repository;
import org.test.entity.Media;
import org.test.entity.User;

import java.util.List;

@Repository
public interface MediaDao {
    List<Media> getMedia();

    public int updateMedia(Media media);

    Media findById(int id);

    public int addMedia(Media media);

    public int delete(String id);
}
