package org.test.dao;

import org.springframework.stereotype.Repository;
import org.test.entity.Article;
import org.test.entity.Category;
import org.test.entity.User;

import java.util.List;

/**
 * @author marshmello
 * @apiNote CategoryDao
 * @tips @Repository将DAO类声明为Bean
 */
@Repository
public interface ArticleDao {

    List<Article> getArticles();

    int addArticle(Article article);

    public int delete(String id);

    public Article findById(long id);
    //根据随机点击的文章id 进行查询文章
    public Article queryById(long id);

    public int updateArticle(Article article);


}
