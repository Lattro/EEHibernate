package dao;

import org.hibernate.query.Query;
import pets.PetEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactory;

import java.util.ArrayList;
import java.util.List;


public class PetDao
{
    public PetEntity findById(int id)
    {
        return HibernateSessionFactory.getSessionFactory().openSession().get(PetEntity.class,id);
    }
    public List<PetEntity> getAllPets()
    {
        List<PetEntity> petEntities;
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        Query query = session.createQuery("from pets.PetEntity");
        petEntities= (List<PetEntity>) query.list();
        tx1.commit();
        session.close();
        return petEntities;
    }

    public void save(PetEntity pet)
    {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(pet);
        tx1.commit();
        session.close();
    }
    public void update(PetEntity pet)
    {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(pet);
        tx1.commit();
        session.close();
    }
    public void delete(PetEntity pet)
    {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(pet);
        tx1.commit();
        session.close();
    }

}
