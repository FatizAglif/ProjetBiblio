/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miage.bibliotheque;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Fatima/Mehmet
 */
@Entity
public class Auteur extends Personne implements Serializable {
    @OneToMany(mappedBy = "ecrit_par")
    private List<Livre> livres;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String aProposDe; 
    private String nationalite; 
    private TypeAuteur type; 
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Auteur)) {
            return false;
        }
        Auteur other = (Auteur) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Auteur[ id=" + id + " ]";
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public TypeAuteur getType() {
        return type;
    }

    public void setType(TypeAuteur type) {
        this.type = type;
    }

    public List<Livre> getLivres() {
        return livres;
    }

    public void setLivres(List<Livre> livres) {
        this.livres = livres;
    }

    public String getaProposDe() {
        return aProposDe;
    }

    public void setaProposDe(String aProposDe) {
        this.aProposDe = aProposDe;
    }


    
}
