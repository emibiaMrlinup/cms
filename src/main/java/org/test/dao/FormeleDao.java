package org.test.dao;

import org.test.entity.Form;
import org.test.entity.Formele;

import java.util.List;

public interface FormeleDao {
    List<Formele> geteles();
    public void addEle(Formele formele);
    public int delete(String id);

}
