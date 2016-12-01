/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.um.fit.demomedicina.dao;

import java.util.List;
import mx.edu.um.fit.demomedicina.model.Pregunta;

/**
 *
 * @author Priscila
 */
public interface PreguntaDao {
    public List<Pregunta> getPreguntas(Pregunta pregunta);
    public Pregunta get(Long id);
    public Pregunta save(Pregunta pregunta);
    public Pregunta update(Pregunta pregunta);
    public String delete(Long id); 
}
