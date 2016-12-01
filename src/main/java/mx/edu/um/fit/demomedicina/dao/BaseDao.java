/*
 * Aqui se guarda, se comnuica con la base de datos ne el service esta la logica del negocio
 * 
 */
package mx.edu.um.fit.demomedicina.dao;

import java.util.Locale;
import mx.edu.um.fit.demomedicina.config.Constants;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Priscila
 */
public abstract class BaseDao {
    protected final transient Logger log=LoggerFactory.getLogger(getClass());
    protected Locale local=new java.util.Locale(Constants.LOCALE_LANGUAGE,Constants.LOCALE_COUNTRY,Constants.LOCALE_VARIANT);
    
    @Autowired
    @Qualifier("sessionFactory")
    private SessionFactory sessionFactory;
    
    @Transactional
    protected Session currentSession(){
        return sessionFactory.getCurrentSession();
    }
    
    @Transactional
    protected Session getSession(){
        return sessionFactory.getCurrentSession();
    }
    
}
