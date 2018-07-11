package org.test.service;

import org.test.entity.Category;
import org.test.entity.CategoryVO;

import java.util.List;

public interface CategoryService {
    List<CategoryVO> getCategorys();

    List<Category> getCategory();
    public boolean addCategorys(Category categorys);
    public boolean deleteCategorys(String id);
    public boolean updateCategorys(Category categorys);
    public Category QueryById(int id);
}
