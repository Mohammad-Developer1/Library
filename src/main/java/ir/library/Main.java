package ir.library;

import static ir.library.util.EntityManagerProvider.*;

import ir.library.Repository.SubjectRepository;
import ir.library.Repository.impl.SubjectRepositoryImpl;
import ir.library.model.Subject;
import jakarta.persistence.EntityManager;

public class Main {
    public static void main(String[] args) {



        Subject subject =Subject.builder().title("اموزش زبان انگلیسی").build();
        Subject subject1 =Subject.builder().title("اموزش زبان ممد").id(3).build();
        SubjectRepository sr=new SubjectRepositoryImpl();
        sr.delete(2);
    }
}
