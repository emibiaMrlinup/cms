package org.test.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.test.dao.MediaDao;
import org.test.entity.Media;
import org.test.service.MediaService;
import org.test.util.LogMessage;

import java.util.List;

/**
 * @author marshmello
 * @apiNote 媒体库业务逻辑管理针对接口编程 调用mapper
 */

@Service
@Transactional
public class MediaServiceImp implements MediaService {
    Logger logger = Logger.getLogger(MediaServiceImp.class);
    @Autowired
    MediaDao mediaDao;

    @Override
    public List<Media> getMedia() {
        return mediaDao.getMedia();
    }

    @Override
    public Media QueryById(int id) {
        return mediaDao.findById(id);
    }

    @Override
    public boolean updateMedia(Media media) {
        return mediaDao.updateMedia(media) > 0;
    }

    @Override
    public boolean addMedia(Media media) {
        logger.info(LogMessage.getMessage(LogMessage.ADD_MEDIA, media.getName(), media.getPath()));
        return mediaDao.addMedia(media) > 0;
    }

    @Override
    public boolean delete(String id) {
        return mediaDao.delete(id) > 0;
    }
}
