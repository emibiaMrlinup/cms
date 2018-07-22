package org.test.service;

import org.test.entity.Formele;

import java.util.List;

public interface EleService {
    List<Formele> getEles();
    public boolean addEle(Formele formele);
    public boolean delete(String id);
}
