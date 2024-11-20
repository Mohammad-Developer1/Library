package ir.library.Repository.base.baseimpl;

import ir.library.Repository.base.BaseRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import static ir.library.util.EntityManagerProvider.*;
public abstract class BaseRepositoryImpl<T extends Serializable,ID extends Number> implements BaseRepository<T,ID> {


    @Override
    public T save(T t) {
       EntityManager em = getEntityManager();
       try {
           em.getTransaction().begin();
           em.persist(t);
           em.getTransaction().commit();
       }catch (Exception e) {
           em.getTransaction().rollback();
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
        CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();
        CriteriaQuery<T> cq = cb.createQuery(getEntityClass());
        Root<T> root = cq.from(getEntityClass());
        cq.select(root);
        return getEntityManager().createQuery(cq).getResultList();
    }

    public abstract Class<T> getEntityClass();


}
