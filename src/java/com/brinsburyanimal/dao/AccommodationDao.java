/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brinsburyanimal.dao;

import com.brinsburyanimal.beans.Accommodation;
import com.brinsburyanimal.util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;


/**
 *
 * @author Liz
 */
public class AccommodationDao {
    
    
    
    public List<Accommodation> getAllAccommodations() {
        List<Accommodation> accommodations = new ArrayList<Accommodation>();
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            accommodations = session.createQuery("from Accommodation").list();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return accommodations; 
    }
    
    public List<Integer> getAllNumbers() {
        List<Integer> numbers = new ArrayList<Integer>();
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            numbers = session.createQuery("SELECT number from Accommodation").list();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return numbers; 
    }
    
    
    
}
