/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brinsburyanimal.dao;

import com.brinsburyanimal.beans.Accommodation;
import com.brinsburyanimal.beans.BirdMammalRecord;
import com.brinsburyanimal.beans.Fed;
import com.brinsburyanimal.util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Liz
 */
public class BirdMammalRecordDao {
    
    public void addRecord(BirdMammalRecord bmRecord) {
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            session.saveOrUpdate(bmRecord);
            session.getTransaction().commit();
        } catch (RuntimeException e) {
            if (trns != null) {
                trns.rollback();
            }
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
    }
    
    public List<BirdMammalRecord> getAllRecords(){
        List<BirdMammalRecord> records = new ArrayList<>();
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            records = session.createQuery("from BirdMammalRecord").list();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return records;
    }
    
    public List<BirdMammalRecord> getAllRecordsForAccommodation(Accommodation accommodation){
        List<BirdMammalRecord> records = new ArrayList<>();
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            records = session.createCriteria(BirdMammalRecord.class)
                      .add(Restrictions.eq("accommodation", accommodation))
                      .list();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return records;
    }
    
}
