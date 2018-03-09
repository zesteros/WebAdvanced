/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.ShopCart;

/**
 *
 * @author Angelo
 */
@Stateless
public class ShopCartFacade extends AbstractFacade<ShopCart> {

    @PersistenceContext(unitName = "EjemploSessionBean-warPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ShopCartFacade() {
        super(ShopCart.class);
    }
    
}
