package org.test.entity;

public class Question {

    private int id;
    private String username;
    private String old;
    private String selects;
    private String sex;
    private String page;
    private String comments;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getOld() {
        return old;
    }

    public void setOld(String old) {
        this.old = old;
    }



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSelects() {
        return selects;
    }

    public void setSelects(String selects) {
        this.selects = selects;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

}
