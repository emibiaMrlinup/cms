package org.test.service;

import org.test.entity.User;

import java.util.List;

/**
 * @author marshmello
 * @apiNote 针对接口编程 调用mapper
 */
public interface UserService {
    public User login(String username, String password);

    List<User> getEditors();

    public boolean addEditor(User editor);

    public boolean delete(String id);

    public User QueryById(int id);

    public boolean updateEditor(User editor);
}
