package org.test.dao;

import org.springframework.stereotype.Repository;
import org.test.entity.Menu;

import java.util.List;

@Repository
public interface MenuDao {
    public List<Menu> queryMenuList();
}
