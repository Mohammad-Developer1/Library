package ir.library;

import static ir.library.util.EntityManagerProvider.*;
import jakarta.persistence.EntityManager;

public class Main {
    public static void main(String[] args) {

        EntityManager en= getEntityManager();
    }
}
