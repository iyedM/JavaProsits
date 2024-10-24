package tn.esprit.gestionzoo.entities;

public class ZooFullException extends RuntimeException {
    public ZooFullException() {
        super();
    }
    public ZooFullException(String message) {
        System.out.println(message);
    }

}
