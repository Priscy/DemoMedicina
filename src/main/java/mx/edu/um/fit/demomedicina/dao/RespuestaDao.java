/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.um.fit.demomedicina.dao;

import java.util.List;
import mx.edu.um.fit.demomedicina.model.Respuesta;


/**
 *
 * @author Priscila
 */
public interface RespuestaDao {
    public List<Respuesta> getRespuestas(Respuesta respuesta);
    public Respuesta get(Long id);
    public Respuesta save(Respuesta respuesta);
    public Respuesta update(Respuesta respuesta);
    public String delete(Long id);    
}
