package ir.library.service.impl;

import ir.library.Repository.base.BaseRepository;
import ir.library.service.BookService;

public class BookServiceImpl implements BookService {

    private final BaseRepository br;

    public BookServiceImpl(BaseRepository br) {
        this.br = br;
    }
}
