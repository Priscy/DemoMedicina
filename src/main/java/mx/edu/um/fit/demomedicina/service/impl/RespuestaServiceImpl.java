/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.um.fit.demomedicina.service.impl;

import java.util.List;
import mx.edu.um.fit.demomedicina.dao.RespuestaDao;
import mx.edu.um.fit.demomedicina.model.Respuesta;
import mx.edu.um.fit.demomedicina.service.BaseService;
import mx.edu.um.fit.demomedicina.service.RespuestaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author Priscila
 */
@Service
public class RespuestaServiceImpl extends BaseService implements RespuestaService{

    @Autowired
    private RespuestaDao respuestaDao;
    
    @Override
    public List<Respuesta> getAll() {
        return respuestaDao.getRespuestas(new Respuesta());
    }

    @Override
    public Respuesta getById(Long id) {
        return respuestaDao.get(id);
    }

    @Override
    public Respuesta save(Respuesta respuesta) {
        return respuestaDao.save(respuesta);
    }

    @Override
    public Respuesta update(Respuesta respuesta) {
        return respuestaDao.update(respuesta);
    }

    @Override
    public String delete(Long id) {
        return respuestaDao.delete(id);
    }
    
  

    
}
