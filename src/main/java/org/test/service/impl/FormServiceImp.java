package org.test.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.test.dao.FormDao;
import org.test.entity.Form;
import org.test.service.FormService;

import java.util.List;
@Service
@Transactional
public class FormServiceImp implements FormService {
    Logger logger = Logger.getLogger(FormServiceImp.class);
    @Autowired
    FormDao formDao;

    @Override
    public List<Form> getForms() {
        return formDao.getForms();
    }

    @Override
    public boolean updateForm(Form form) {
        return formDao.updateForm(form)>0;
    }

    @Override
    public boolean deleteForm(String id) {
        formDao.deleteForm(id);
        return true;
    }

    @Override
    public boolean addForm(Form form) {
        formDao.addForm(form);
        return true;
    }

    @Override
    public Form QueryById(int id) {

        return formDao.findById(id);
    }
}
