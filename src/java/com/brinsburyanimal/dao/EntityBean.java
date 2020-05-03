package com.brinsburyanimal.dao;


import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Liz
 */
public class EntityBean {
    protected EntityManagerFactory emf;

    /*
     * Lazily acquire the EntityManagerFactory and cache it.
     */
     public EntityManagerFactory getEMF (){
        if (emf == null){
            emf = Persistence.createEntityManagerFactory("default", new java.util.HashMap());
        }
        return emf;
    }
    
}
