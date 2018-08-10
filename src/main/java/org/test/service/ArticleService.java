package org.test.service;

import org.test.entity.Article;


import java.util.List;

public interface ArticleService {

    List<Article> getArticles();

    long addArticle(Article article);

    public boolean delete(String id);

    //查询最新编辑的文章id
    public Article SelectById(int id);

    public boolean updateArticle(Article article);

}
