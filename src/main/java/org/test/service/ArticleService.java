package org.test.service;

import org.test.entity.Article;
import org.test.entity.User;

import java.util.List;

public interface ArticleService {
    List<Article> getArtciles();

    public boolean addArticle(Article article);

    public boolean delete(String id);
}
