package org.test.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.test.dao.CategoryDao;
import org.test.entity.Category;
import org.test.entity.CategoryVO;
import org.test.service.CategoryService;
import java.util.ArrayList;
import java.util.List;


@Service
@Transactional// @Transactional表示该类被Spring作为管理事务的类
public class CategoryServiceImp implements CategoryService {
    Logger logger = Logger.getLogger(CategoryServiceImp.class);

    @Autowired
    CategoryDao mCategoryDao;

    @Override
    public List<CategoryVO> getCategorys() {
        List<Category> categories = mCategoryDao.getCategorys();
        List<CategoryVO> categoryVOs = new ArrayList<CategoryVO>();

        for (Category c : categories) {
            if (c.getParentId() == null) {
                CategoryVO cvo = new CategoryVO();
                cvo.setCategory(c);
                cvo.setSubCategories(new ArrayList<Category>());
                categoryVOs.add(cvo);
            }
        }

        for (Category c : categories) {
            if (c.getParentId() != null) {
                CategoryVO cvo = getCategoryVOById(categoryVOs, c.getParentId());

                if (cvo == null) {
                    break;
                }

                cvo.getSubCategories().add(c);
            }
        }

        return categoryVOs;
    }

    @Override
    public List<Category> getCategory() {
        return mCategoryDao.getCategorys();
    }

    private CategoryVO getCategoryVOById(List<CategoryVO> categoryVOs, Integer id) {
        for (CategoryVO c : categoryVOs) {
            if (c.getCategory().getId() == id) {
                return c;
            }
        }
        return null;
    }

    public boolean updateCategorys(Category categorys) {
        mCategoryDao.updateCategorys(categorys);
        return true;
    }
    @Override
    public boolean addCategorys(Category categorys) {
        return false;
    }


    @Override
    public boolean deleteCategorys(String id) {
        return mCategoryDao.deleteCategorys(id)>0;
}

    @Override
    public boolean deleteChildCategorys(String id) {
        //System.out.println(id);
        //System.out.println(mCategoryDao.deleteChildCategory(id));

        int rowCount = mCategoryDao.deleteChildCategorys(id);
        if (rowCount>0) {
            return true;
        }
        return false;
    }


    @Override
    public Category QueryById(int id) {
        return mCategoryDao.findById(id);

    }
}
