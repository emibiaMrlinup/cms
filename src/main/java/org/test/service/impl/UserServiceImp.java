package org.test.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.test.dao.UserDao;
import org.test.entity.User;
import org.test.service.UserService;

import java.util.List;


/**
 * @author marshmello
 * @apiNote UserServiceImp类的继承UserService具体实现
 * @resoourse 注入mapper 调用mapper接口里声明的crud方法
 * @tips 1：配置文件 导入mybatis类库要与mybatis-spring版本匹配 2：@Transactional表示该类被Spring作为管理事务的类
 */

@Service
@Transactional// @Transactional表示该类被Spring作为管理事务的类
public class UserServiceImp implements UserService {
    //getLogger(class)的参数用途:追踪产生此日志的类.
    Logger logger = Logger.getLogger(UserServiceImp.class);

    @Autowired
    UserDao mUserDao;

    /**
     * @apiNote 登录 根据用户名和密码进行查询
     */
    @Override
    public User login(String mUsername, String mUserPassword) {

        return mUserDao.findByUserNameAndPassword(mUsername, mUserPassword);
    }

    @Override
    public List<User> getEditors() {
        return mUserDao.getEditors();
    }

    @Override
    public boolean addEditor(User editor) {
        mUserDao.addEditor(editor);
        return true;
    }

    @Override
    public boolean delete(String id) {
        return mUserDao.delete(id) > 0;
    }

    @Override
    public User QueryById(int id) {
        return mUserDao.findById(id);
    }

    @Override
    public boolean updateEditor(User editor) {
        return mUserDao.updateEditor(editor) > 0;
    }


}


