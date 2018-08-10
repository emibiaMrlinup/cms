package org.test.entity;


public class Article {

  private long id;
  private String name;
  private String type;
  private String content;
  private String author;
  private java.sql.Timestamp editTime;
  private long isTop;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }


  public java.sql.Timestamp getEditTime() {
    return editTime;
  }

  public void setEditTime(java.sql.Timestamp editTime) {
    this.editTime = editTime;
  }


  public long getIsTop() {
    return isTop;
  }

  public void setIsTop(long isTop) {
    this.isTop = isTop;
  }

}
