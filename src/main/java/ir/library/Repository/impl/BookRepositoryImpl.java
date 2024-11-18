package ir.library.Repository.impl;

import ir.library.Repository.BookRepository;
import ir.library.Repository.base.baseimpl.BaseRepositoryImpl;
import ir.library.model.Book;

public class BookRepositoryImpl extends BaseRepositoryImpl<Book,Integer> implements BookRepository {
    @Override
    public Class<Book> getEntityClass() {
        return Book.class;
    }

    @Override
    public String getFindQuery() {
        return "select b from Book b";
    }
}
