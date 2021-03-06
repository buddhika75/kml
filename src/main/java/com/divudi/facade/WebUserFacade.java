/*
 * Author
 * Dr. M H B Ariyaratne, MO(Health Information), email : buddhika.ari@gmail.com
 */
package com.divudi.facade;

import com.divudi.entity.WebUser;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Dr. M H B Ariyaratne <buddhika.ari at gmail.com>
 */
@Stateless
public class WebUserFacade extends AbstractFacade<WebUser> {
    @PersistenceContext(unitName = "pu")
    private EntityManager em;

    
    @Override
    protected EntityManager getEntityManager() {
        if(em == null){}return em;
    }

    public WebUserFacade() {
        super(WebUser.class);
    }
    
}
