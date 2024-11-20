package ir.library;

import static ir.library.util.EntityManagerProvider.*;

import ir.library.Repository.SubjectRepository;
import ir.library.Repository.impl.SubjectRepositoryImpl;
import ir.library.model.Subject;
import ir.library.util.ApplicationContext;
import jakarta.persistence.EntityManager;

public class Main {
    public static void main(String[] args) {

//        Subject subject =Subject.builder().title("mamad").build();
//        ApplicationContext.getSubjectService().save(subject);

//        ApplicationContext.getSubjectService().delete(102);
//        Subject subject = Subject.builder().id(1).title("mamad").build();


//        ApplicationContext.getSubjectService().update(subject);

        ApplicationContext.getSubjectService().printAll();

    }
}
