/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pa.patterns.observerimpl.model;

import com.pa.patterns.observerimpl.observer.Observer;

import java.util.Collection;



/**
 *
 * @author brunomnsilva
 */
public class ShoppingCartTotalCost  implements Observer {

 

    @Override
    public void update(Object arg) {
        if(arg instanceof ShoppingCart) {
            
            ShoppingCart cart = (ShoppingCart)arg;
            
            String name = cart.getName();
            Collection<Product> products = cart.getProducts();
            
            double total = 0;
            for (Product p : products) {
                total += p.getCost();
            }
            
            System.out.printf("(%s) total cost: %.2f \n", name,  total);
        }
    }
    
}
