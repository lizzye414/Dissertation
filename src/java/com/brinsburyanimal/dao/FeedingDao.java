/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brinsburyanimal.dao;

import com.brinsburyanimal.beans.Feeding;
import com.brinsburyanimal.util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Liz
 */
public class FeedingDao {
       
    public List<Feeding> getAllFeeding(){
        List<Feeding> feedings = new ArrayList<>(); 
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            feedings = session.createQuery("from Feeding").list();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return feedings;
    }
        
}
