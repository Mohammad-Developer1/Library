package ir.library.Repository;

import ir.library.Repository.base.BaseRepository;
import ir.library.model.Book;

import java.util.List;

public interface BookRepository extends BaseRepository<Book, Integer> {
    @Override
    Book save(Book book);

    @Override
    Book update(Book book);

    @Override
    Boolean delete(Integer integer);

    @Override
    Book findID(Integer integer);

    @Override
    List<Book> findAll();
}
