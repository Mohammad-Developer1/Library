package ir.library.Repository.impl;

import ir.library.Repository.CategoryRepository;
import ir.library.Repository.base.baseimpl.BaseRepositoryImpl;
import ir.library.model.Category;
import jakarta.persistence.EntityManager;

import static ir.library.util.EntityManagerProvider.*;
public class CategoryRepositoryImpl extends BaseRepositoryImpl<Category,Integer> implements CategoryRepository {
    @Override
    public Class<Category> getEntityClass() {
        return Category.class;
    }



    @Override
    public Category update(Category category) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            Category findId =findID(category.getId());
            findId.setTitle(category.getTitle());
            em.getTransaction().commit();
        }catch (Exception e) {
            em.getTransaction().rollback();
        }
        return category;
    }
}
