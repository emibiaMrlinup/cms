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
    public List<Article> getArticles() {
        return mArtcileDao.getArticles();
    }

    @Override
    public long addArticle(Article article) {
        mArtcileDao.addArticle(article);
        return article.getId();
    }


    @Override
    public boolean delete(String id) {
        return mArtcileDao.delete(id) > 0;
    }

    @Override
    public Article SelectById(int id) {
        return mArtcileDao.findById(id);
    }

    @Override
    public boolean updateArticle(Article article) {

        return mArtcileDao.updateArticle(article) > 0;
    }


}
