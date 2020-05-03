/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brinsburyanimal.dao;

import com.brinsburyanimal.beans.Animal;
import com.brinsburyanimal.beans.AnimalId;
import com.brinsburyanimal.util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Liz
 */
public class AnimalDao {

    public List<Animal> getAllAnimals() {
        List<Animal> animals = new ArrayList<Animal>();
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            animals = session.createQuery("from Animal").list();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return animals;
    }

    public Animal getAnimalByLatinName(String latinName) {
        Animal animal = new Animal();
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            Query query = session.createQuery("from Animal where latinName: latinName");
            query.setParameter("latinName", latinName);
            animal = (Animal) query.uniqueResult();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return animal;
    }

    public AnimalId addAnimalId(AnimalId animalId) {
        Transaction trns = null;
        AnimalId newAnimalId = new AnimalId();
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            newAnimalId = (AnimalId) session.save(animalId);
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
        return newAnimalId;
    }

    public void addAnimal(Animal animal) {
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            session.saveOrUpdate(animal);
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

    public Animal getAnimalByName(String animalName) {
        Animal chosenAnimal = new Animal();
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            Query query = session.createQuery("from Animal WHERE id.animalName: animalName");
            query.setParameter("id.animalName", animalName);
            chosenAnimal = (Animal) query.uniqueResult();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return chosenAnimal;
    }

}
