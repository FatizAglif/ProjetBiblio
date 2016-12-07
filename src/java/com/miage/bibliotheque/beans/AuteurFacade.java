/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miage.bibliotheque.beans;

import com.miage.bibliotheque.Auteur;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author fatiz
 */
@Stateless
public class AuteurFacade extends AbstractFacade<Auteur> {
    @PersistenceContext(unitName = "BiblioPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AuteurFacade() {
        super(Auteur.class);
    }
    
}
