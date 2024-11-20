package ir.library.service.impl;

import ir.library.Repository.BookRepository;
import ir.library.Repository.base.BaseRepository;
import ir.library.model.Book;
import ir.library.service.BookService;

public class BookServiceImpl implements BookService {

    private final BookRepository br;

    public BookServiceImpl(BookRepository br) {
        this.br = br;
    }

    @Override
    public Book save(Book book) {
        if (book.getId() == null) {
            throw new NullPointerException("book is null");
        }
       return br.save(book);
    }

    @Override
    public Book update(Book book) {
        if (book.getId() == null) {
            throw new NullPointerException("book is null");
        }
        return br.update(book);
    }

    @Override
    public Boolean delete(Integer id) {
        if (id <= 0||id == null) {
            System.out.println("please enter the id");
        }
        return br.delete(id);
    }

    @Override
    public void printAll() {

    }
}
