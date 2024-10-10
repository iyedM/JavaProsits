package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {
    public static void main(String[] args) {
        Animal animal= new Animal();
        Zoo zoo= new Zoo();
        animal.name="max";
        animal.setAge(-5);
        animal.family="chien";
        animal.isMammal=true;
        System.out.println(animal);
        zoo.setName("belvedere");
        zoo.city="tunis";
        zoo.animals=new Animal[25];
        System.out.println(zoo);
        Animal tiger = new Animal( "tiger","felin",10,true);
        Animal eagle = new Animal( "eagle","felin",10,true);
        Animal lion = new Animal( "lion","felin",10,true);

        Zoo zoo1 = new Zoo("belfidere","tunis");
        zoo1.addAnimal(tiger);
        zoo1.addAnimal(eagle);
        zoo1.addAnimal(lion);
        zoo1.displayAnimals();
        zoo1.removeAnimal(tiger);
        zoo1.displayAnimals();
        //System.out.println(zoo1);
        System.out.println(zoo1.toString());
        System.out.println(zoo1.isZooFull());
    }

}
