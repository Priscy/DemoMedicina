/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.um.fit.demomedicina.service;

import java.util.List;
import mx.edu.um.fit.demomedicina.model.Pregunta;

/**
 *
 * @author Priscila
 */
public interface PreguntaService {
    public List<Pregunta> getAll();
    public Pregunta getById(Long id);
    public Pregunta save (Pregunta pregunta);
    /*
    public Pregunta setWorkingStatus(Pregunta pregunta);
    public Pregunta setAvailableStatus(Pregunta pregunta);
    */
    public Pregunta update (Pregunta pregunta);
    public String delete (Long id);
    
    
}
