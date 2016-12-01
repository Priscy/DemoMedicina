/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.um.fit.demomedicina.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

/**
 *
 * @author Priscila
 */
@Entity
@Table(name="pregunta")
public class Pregunta implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Version
    private Integer version;
    @Column
    private String text;
    @OneToMany
    private List<Respuesta> respuestas = new ArrayList<Respuesta>();

   
    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }
    
    public Integer getVersion() {
        return version;
    }

  
    public void setVersion(Integer version) {
        this.version = version;
    }
 
    public String getText() {
        return text;
    }

   
    public void setText(String text) {
        this.text = text;
    }

   
    public List getRespuestas() {
        return respuestas;
    }

    
    public void setRespuestas(List respuestas) {
        this.respuestas = respuestas;
    }
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hash(this.Id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        final Pregunta other = (Pregunta) obj;
        return Objects.equals(this.Id, other.Id);
    }

    @Override
    public String toString() {
        return "{Pregunta{Id:" + this.Id + ", text:" + this.text + ", respuestas:" + this.respuestas + "}}";
    }
    
}
