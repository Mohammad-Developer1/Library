package ir.library.Repository.impl;

import ir.library.Repository.BookRepository;
import ir.library.Repository.base.baseimpl.BaseRepositoryImpl;
import ir.library.model.Book;
import jakarta.persistence.EntityManager;

import static ir.library.util.EntityManagerProvider.*;
public class BookRepositoryImpl extends BaseRepositoryImpl<Book,Integer> implements BookRepository {
    @Override
    public Class<Book> getEntityClass() {
        return Book.class;
    }



    @Override
    public Book update(Book book) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            Book findId =findID(book.getId());
            findId.setTitle(book.getTitle());
            findId.setAuthor(book.getAuthor());
            findId.setPrice(book.getPrice());
            findId.setNumberOfPages(book.getNumberOfPages());
            em.getTransaction().commit();
        }catch(Exception e) {
            em.getTransaction().rollback();
        }
        return book;
    }
}
