package org.test.dao;


import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.test.entity.User;

import java.util.List;

/**
 * @author marshmello
 * @apiNote 首先使用 @Repository将DAO类声明为Bean  UserDao==UserMapper
 */

@Repository
public interface UserDao {
    /**
     * 根据用户名和密码查询用户是否存在
     *
     * @return User
     */
    User findByUserNameAndPassword(@Param("username") String username, @Param("password") String password);

    List<User> getEditors();

    public void addEditor(User editor);

    public int delete(String id);

    public int updateEditor(User editor);

    User findById(int id);
}
