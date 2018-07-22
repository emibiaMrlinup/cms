package org.test.service;

import org.test.entity.Form;

import java.util.List;

public interface FormService {
List<Form> getForms();
public boolean updateForm(Form form);
public boolean deleteForm(String id);
public boolean addForm(Form form);
public Form QueryById(int id);
}
