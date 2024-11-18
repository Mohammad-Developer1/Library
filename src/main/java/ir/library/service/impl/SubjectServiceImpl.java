package ir.library.service.impl;

import ir.library.Repository.SubjectRepository;
import ir.library.model.Subject;
import ir.library.service.SubjectService;

import java.util.List;

public class SubjectServiceImpl implements SubjectService {

    private final SubjectRepository sr;

    public SubjectServiceImpl(SubjectRepository sr) {
        this.sr = sr;
    }

    @Override
    public Subject upsert(Subject subject) {
        if (subject == null){
            throw  new NullPointerException("subject is null");
        }
        return sr.upsert(subject);
    }

    @Override
    public Boolean delete(Integer id) {
        if (id<= 0 || id == null){
            System.out.println("please enter the id");
        }
        return sr.delete(id);
    }

    @Override
    public void printAll() {
        try {
            List<Subject> subject = sr.findAll();
            System.out.format("\033[1;35m"+"+------+-----------------+%n");
            System.out.format("\033[1;35m"+"|  ID  |      Title      |%n");
            System.out.format("\033[1;35m"+"+------+-----------------+%n");
            for (Subject subject1 : subject) {
                System.out.printf("\033[1;35m" + "|" + "\033[1;34m" + " %-15s" + "\033[1;35m" + " |" + "\033[1;34m" + " %-4s" + "\033[1;35m" + " |" + "\n",
                        subject1.getTitle(),
                        subject1.getId());

            }
            System.out.format("\033[1;35m"+"+------+-----------------+%n");

        } catch (Exception e) {
            System.out.println("there is problem with connecting to database");
        }
        System.out.println("\033[0m");
    }

    @Override
    public void printAllSubjectWithBooks() {
        try {
            List<Subject> subject = sr.findAll();
           subject= subject.stream().filter(subject1 -> !subject1.getBooks().isEmpty()).toList();
            System.out.format("\033[1;35m"+"+------+-----------------+%n");
            System.out.format("\033[1;35m"+"|  ID  |      Title      |%n");
            System.out.format("\033[1;35m"+"+------+-----------------+%n");
            for (Subject subject1 : subject) {
                System.out.printf("\033[1;35m" + "|" + "\033[1;34m" + " %-15s" + "\033[1;35m" + " |" + "\033[1;34m" + " %-4s" + "\033[1;35m" + " |" + "\n",
                        subject1.getTitle(),
                        subject1.getId());

            }
            System.out.format("\033[1;35m"+"+------+-----------------+%n");

        } catch (Exception e) {
            System.out.println("there is problem with connecting to database");
        }
        System.out.println("\033[0m");
    }


}
