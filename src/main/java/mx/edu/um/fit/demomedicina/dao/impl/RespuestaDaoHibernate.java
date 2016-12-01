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
import mx.edu.um.fit.demomedicina.dao.RespuestaDao;
import mx.edu.um.fit.demomedicina.model.Respuesta;
import org.hibernate.NonUniqueObjectException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Priscila
 */
@Repository
@Transactional
public class RespuestaDaoHibernate extends BaseDao implements RespuestaDao{

    @Override
    public List<Respuesta> getRespuestas(Respuesta respuesta) {
        CriteriaBuilder criteriaBuilder = currentSession().getCriteriaBuilder();
        CriteriaQuery<Respuesta> criteriaQuery = criteriaBuilder.createQuery(Respuesta.class);
        Root<Respuesta> respuestaRoot = criteriaQuery.from(Respuesta.class);
        criteriaQuery.select(respuestaRoot);
        //no se !! predicate
        TypedQuery<Respuesta> typedQuery = currentSession().createQuery(criteriaQuery);
        List<Respuesta> respuestasList = typedQuery.getResultList();
        return respuestasList;
    }

    @Override
    public Respuesta get(Long id) {
        Respuesta respuesta= currentSession().get(Respuesta.class, id);
        return respuesta;
    }

    @Override
    public Respuesta save(Respuesta respuesta) {
        currentSession().save(respuesta);
        return respuesta;
    }

    @Override
    public Respuesta update(Respuesta respuesta) {
        try{
            currentSession().update(respuesta);
        }catch(NonUniqueObjectException nuoe){
            log.warn("Answer with the same Id in session already exists, trying to merge");
            currentSession().merge(respuesta);
            currentSession().flush();
        }
        return respuesta;
        
    }
    

    @Override
    public String delete(Long id) {
        Respuesta respuesta = get(id);
        String respuestaTexto = respuesta.getText();
                
        currentSession().delete(respuesta);
        currentSession().flush();
        
        return respuestaTexto;
    }
    
    
}
