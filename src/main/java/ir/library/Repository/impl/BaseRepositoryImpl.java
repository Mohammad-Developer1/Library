package ir.library.Repository.impl;

import ir.library.Repository.BaseRepository;
import jakarta.persistence.EntityManager;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import static ir.library.util.EntityManagerProvider.*;
public abstract class BaseRepositoryImpl<T extends Serializable,ID extends Number> implements BaseRepository<T,ID> {
    @Override
    public T upsert(T t) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(t);
            em.getTransaction().commit();
        }catch (Exception e) {
            em.getTransaction().rollback();
        }finally {
            em.close();
        }
        return t;
    }

    @Override
    public Boolean delete(ID id) {
       EntityManager em = getEntityManager();
       try {
           em.getTransaction().begin();
            T t=findID(id);
           em.remove(t);
           em.getTransaction().commit();
       }catch (Exception e) {
           em.getTransaction().rollback();
           return false;
       }finally {
           em.close();
       }
       return true;
    }

    @Override
    public T findID(ID id) {
        return (T) getEntityManager().find(getEntityClass(),id);
    }

    @Override
    public List<T> findAll() {
        EntityManager em = getEntityManager();
        List<T> t = new ArrayList<>();
        t = em.createQuery(getFindQuery(),getEntityClass()).getResultList();
        return t ;
    }


    public abstract Class<T> getEntityClass();
    public abstract String getFindQuery();
}
