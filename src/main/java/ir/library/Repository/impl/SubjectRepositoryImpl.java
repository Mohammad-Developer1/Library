package ir.library.Repository.impl;

import ir.library.Repository.SubjectRepository;
import ir.library.Repository.base.baseimpl.BaseRepositoryImpl;
import ir.library.model.Subject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import static ir.library.util.EntityManagerProvider.*;
public class SubjectRepositoryImpl extends BaseRepositoryImpl<Subject,Integer> implements SubjectRepository {
    @Override
    public Class<Subject> getEntityClass() {
        return Subject.class;
    }


    @Override
    public Subject update(Subject subject) {
        EntityManager em=getEntityManager();
        try {
            em.getTransaction().begin();
            Subject findId =findID(subject.getId());
            findId.setTitle(subject.getTitle());
            em.getTransaction().commit();
        }catch (Exception e) {
            em.getTransaction().rollback();
        }
        return subject;
    }
}
