/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.um.fit.demomedicina.service.impl;

import java.util.List;
import mx.edu.um.fit.demomedicina.dao.PreguntaDao;
import mx.edu.um.fit.demomedicina.model.Pregunta;
import mx.edu.um.fit.demomedicina.service.BaseService;
import mx.edu.um.fit.demomedicina.service.PreguntaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author Priscila
 */
@Service
public class PreguntaServiceImpl extends BaseService implements PreguntaService{
    
    @Autowired
    private PreguntaDao preguntaDao;
    
    @Override
    public List<Pregunta> getAll() {
        return preguntaDao.getPreguntas(new Pregunta());
    }

    @Override
    public Pregunta getById(Long id) {
        return preguntaDao.get(id);
    }

    @Override
    public Pregunta save(Pregunta pregunta) {
        return preguntaDao.save(pregunta);
    }
    
    @Override
    public Pregunta update(Pregunta pregunta) {
        return preguntaDao.update(pregunta);
    }

    @Override
    public String delete(Long id) {
        return preguntaDao.delete(id);
    }
    
}
