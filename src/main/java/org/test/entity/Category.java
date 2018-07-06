package org.test.entity;

/**
 * @tips null  数据库对应的列段对应的实体类是引用类型来对应 Interger
 * 如果实体类使用 int  对应的null  应该是跟0判断
 */
public class Category {

    private int id;
    private String name;
    private Integer parentId;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

}
