package org.test.dao;

import org.test.entity.Form;

import java.util.List;

public interface FormDao {
    List<Form> getForms();
    public int updateForm(Form from);
    public int deleteForm(String id);
    public void addForm(Form form);
    Form findById(int id);
}
