/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.divudi.facade;

import com.divudi.entity.AppEmail;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Buddhika
 */
@Stateless
public class EmailFacade extends AbstractFacade<AppEmail> {
    @PersistenceContext(unitName = "pu")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        if(em == null){}return em;
    }

    public EmailFacade() {
        super(AppEmail.class);
    }
    
}
