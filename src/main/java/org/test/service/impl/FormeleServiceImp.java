package org.test.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.test.dao.FormeleDao;
import org.test.entity.Formele;
import org.test.service.EleService;

import java.util.List;

@Service
@Transactional
public class FormeleServiceImp implements EleService {
    Logger logger = Logger.getLogger(FormServiceImp.class);
    @Autowired
    FormeleDao formeleDao;

    @Override
    public List<Formele> getEles() {
        return formeleDao.geteles();
    }

    @Override
    public boolean addEle(Formele formele) {
        formeleDao.addEle(formele);
        return true;
    }

    @Override
    public boolean delete(String id) {
        formeleDao.delete(id);
        return true;
    }
}
