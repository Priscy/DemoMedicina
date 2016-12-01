/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.um.fit.demomedicina.dao.impl;

import java.util.List;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import mx.edu.um.fit.demomedicina.dao.BaseDao;
import mx.edu.um.fit.demomedicina.dao.PreguntaDao;
import mx.edu.um.fit.demomedicina.model.Pregunta;
import org.hibernate.NonUniqueObjectException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Priscila
 */
@Repository
@Transactional
public class PreguntaDaoHibernate extends BaseDao implements PreguntaDao{
    
    //query consulta con base de datos ..obtner,modivicar,borrar CRUD
    //The Criteria API is used to define queries for entities
    @Override
    public List<Pregunta> getPreguntas(Pregunta pregunta) {
        CriteriaBuilder criteriaBuilder = currentSession().getCriteriaBuilder();
        CriteriaQuery<Pregunta> criteriaQuery = criteriaBuilder.createQuery(Pregunta.class);
        Root<Pregunta> preguntaRoot = criteriaQuery.from(Pregunta.class);
        criteriaQuery.select(preguntaRoot);
        //no se !! predicate
        TypedQuery<Pregunta> typedQuery = currentSession().createQuery(criteriaQuery);
        List<Pregunta> preguntasList = typedQuery.getResultList();
        return preguntasList;

    }

    @Override
    public Pregunta get(Long id) {
        Pregunta pregunta= currentSession().get(Pregunta.class, id);
        return pregunta;
        
    }

    @Override
    public Pregunta save(Pregunta pregunta) {
        currentSession().save(pregunta);
        return(pregunta);
    }

    @Override
    public Pregunta update(Pregunta pregunta) {
        try{
            currentSession().update(pregunta);
        } catch(NonUniqueObjectException nuoe){
            log.warn("Question with the same Id in session already exists, trying to merge");
            currentSession().merge(pregunta);
            currentSession().flush();
        }
        return pregunta;
    }

    @Override
    public String delete(Long id) {
        Pregunta pregunta = get(id);
        String preguntaTexto = pregunta.getText();
                
        currentSession().delete(pregunta);
        currentSession().flush();
        
        return preguntaTexto;
    }
    
}
