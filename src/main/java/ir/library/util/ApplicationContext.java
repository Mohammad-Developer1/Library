package ir.library.util;

import ir.library.Repository.BookRepository;
import ir.library.Repository.CategoryRepository;
import ir.library.Repository.SubjectRepository;
import ir.library.Repository.UserRepository;
import ir.library.Repository.impl.BookRepositoryImpl;
import ir.library.Repository.impl.CategoryRepositoryImpl;
import ir.library.Repository.impl.SubjectRepositoryImpl;
import ir.library.Repository.impl.UserRepositoryImpl;
import ir.library.service.BookService;
import ir.library.service.CategoryService;
import ir.library.service.SubjectService;
import ir.library.service.UserService;
import ir.library.service.impl.BookServiceImpl;
import ir.library.service.impl.CategoryServiceImpl;
import ir.library.service.impl.SubjectServiceImpl;
import ir.library.service.impl.UserServiceImpl;
import lombok.Getter;

public class ApplicationContext {

    private static final BookRepository bookRepository;
    @Getter
    private static final BookService bookService;

    private static final UserRepository userRepository;
    @Getter
    private static final UserService userService;

    private static final SubjectRepository subjectRepository;
    @Getter
    private static final SubjectService subjectService;

    private static final CategoryRepository categoryRepository;
    @Getter
    private static final CategoryService categoryService;

    static {
        bookRepository = new BookRepositoryImpl();
        bookService = new BookServiceImpl(bookRepository);
        userRepository = new UserRepositoryImpl();
        userService = new UserServiceImpl(userRepository);
        subjectRepository = new SubjectRepositoryImpl();
        subjectService = new SubjectServiceImpl(subjectRepository);
        categoryRepository = new CategoryRepositoryImpl();
        categoryService = new CategoryServiceImpl(categoryRepository);
    }

}
