import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Zoo {

    Animal[] animals;
    String name;
    String city;
    int nbrCages;

    //constructor
    public Zoo(String name, String city, int nbrCages) {
        if(nbrCages >25) {
            System.out.println("Error: nbrCages >25");
            this.nbrCages = 25;
        }else {
            this.nbrCages=nbrCages;
        }

        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
    }

    public void displayZoo() {
        System.out.println("Name: " + name);
        System.out.println("Number of cages: " + nbrCages);
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "animals=" + Arrays.toString(animals) +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                '}';
    }

    public Boolean addAnimal(Animal animal) {
        boolean test=false;
        for (int i = 0; i < nbrCages; i++) {
            if (animals[i] == animal){
                test=false;
            }
        }
        for (int i=0 ; i<nbrCages; i++){
          if (animals[i] == null ) {
                animals[i] = animal;
                test= true;
                break;
            }else{
                test = false;
            }
        }
        return true;
    }

    public void displayAnimals() {
        for (int i=0 ; i<nbrCages; i++){
            if (animals[i] != null) {
                System.out.println(animals[i].toString());
            }
        }
    }

    public int searchAnimal(Animal animal) {

        for(int i=0; i<nbrCages; i++) {
            if(animals[i] != null && animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
    }

public boolean removeAnimal(Animal animal) {
        boolean test=false;
        for (int i=0 ; i<nbrCages; i++) {
            if (animals[i] == animal) {
                animals[i] = null;
                test=true;
                break;
            }
        }
        return test;
}
public boolean isZooFull() {
        int nbrAnimals=0;
        for (Animal animal : animals) {
            if (animal != null) {
                nbrAnimals++;
            }
        }
        if(nbrAnimals >= nbrCages) {
            System.out.println(" Zoo is Full");
            return true;
        }else {
            System.out.println("Zoo is not Full");
            return false;
        }
}

public Zoo comparerZoo(Zoo z1, Zoo z2) {
        int nbrZ1=0;
        int nbrZ2=0;
        for(int i=0; i<25;i++){
            if(i< z1.animals.length  &&z1.animals[i] !=null) {
                nbrZ1++;
            }
            if(i< z2.animals.length && z2.animals[i] !=null) {
                nbrZ2++;
            }
        }
        if (nbrZ1>nbrZ2) {
            System.out.println(z1.name+" has more animals");
            return z1;
        } else if (nbrZ2>nbrZ1) {
            System.out.println(z2.name+" has more animals");
            return z2;
        } else {
            System.out.println(z1.name+" and "+z2.name+" are equal");
            return null;
        }

}


}
/*
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Zoo {

    Animal[] animals;
    String name;
    String city;
    int nbrCages;

    //constructor
    public Zoo(String name, String city, int nbrCages) {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }

    public void displayZoo() {
        System.out.println("Name: " + name);
        System.out.println("Number of cages: " + nbrCages);
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "animals=" + Arrays.toString(animals) +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                '}';
    }

    public Boolean addAnimal(Animal animal) {
        boolean test=false;
        for (int i = 0; i < nbrCages; i++) {
            if (animals[i] == animal){
                test=false;
            }
        }
        for (int i=0 ; i<nbrCages; i++){
            if (animals[i] == null ) {
                animals[i] = animal;
                test= true;
                break;
            }else{
                test = false;
            }
        }
        return true;
    }

    public void displayAnimals() {
        for (int i=0 ; i<nbrCages; i++){
            if (animals[i] != null) {
                System.out.println(animals[i].toString());
            }
        }
    }

    public int searchAnimal(Animal animal) {

        for(int i=0; i<nbrCages; i++) {
            if(animals[i] != null && animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        boolean test=false;
        for (int i=0 ; i<nbrCages; i++) {
            if (animals[i] == animal) {
                animals[i] = null;
                test=true;
                break;
            }
        }
        return test;
    }


}
/*  prosit 2
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Zoo {

    Animal[] animals;
    String name;
    String city;
    int nbrCages;

    //constructor
    public Zoo(String name, String city, int nbrCages) {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }

    public void displayZoo() {
        System.out.println("Name: " + name);
        System.out.println("Number of cages: " + nbrCages);
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "animals=" + Arrays.toString(animals) +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                '}';
    }

    public Boolean addAnimal(Animal animal) {
        boolean test=false;
        for (int i = 0; i < nbrCages; i++) {
            if (animals[i] == animal){
                test=false;
            }
        }
        for (int i=0 ; i<nbrCages; i++){
          if (animals[i] == null ) {
                animals[i] = animal;
                test= true;
                break;
            }else{
                test = false;
            }
        }
        return true;
    }

    public void displayAnimals() {
        for (int i=0 ; i<nbrCages; i++){
            if (animals[i] != null) {
                System.out.println(animals[i].toString());
            }
        }
    }

    public int searchAnimal(Animal animal) {

        for(int i=0; i<nbrCages; i++) {
            if(animals[i] != null && animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
    }

public boolean removeAnimal(Animal animal) {
        boolean test=false;
        for (int i=0 ; i<nbrCages; i++) {
            if (animals[i] == animal) {
                animals[i] = null;
                test=true;
                break;
            }
        }
        return test;
}


}

   */