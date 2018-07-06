package org.test.entity;

import java.util.List;

/**
 * View Obiect
 */
public class CategoryVO {
    private Category category;
    private List<Category> subCategories;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Category> getSubCategories() {
        return subCategories;
    }

    public void setSubCategories(List<Category> subCategories) {
        this.subCategories = subCategories;
    }
}
