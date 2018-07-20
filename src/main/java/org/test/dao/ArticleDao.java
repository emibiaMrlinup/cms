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

    public void addArticle(Article article);

    public int delete(String id);

}
