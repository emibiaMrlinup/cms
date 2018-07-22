package org.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.test.dao.ArticleDao;
import org.test.entity.Article;
import org.test.service.ArticleService;
import java.util.List;

@Service
public class ArticleServiceImp implements ArticleService {
    @Autowired
    ArticleDao mArtcileDao;
    @Override
    public List<Article> getArtciles() {
        return mArtcileDao.getArticles();
    }

    @Override
    public boolean addArticle(Article article) {

       mArtcileDao.addArticle(article);

        return true;
    }


    @Override
    public boolean delete(String id) {
        return mArtcileDao.delete(id) > 0;
    }

}
