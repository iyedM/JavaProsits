package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {

    public static void main(String[] args) {
//        Animal lion = new Animal();
//        lion.setName("Simba");
//        lion.setAge(8);
//        lion.setFamily("Cats");
//        lion.setMammal(true);

        Zoo myZoo = new Zoo("Wildlife Park", "Ariana");
//        Zoo notMyZoo = new Zoo("WaterPark", "Siliana");
//
          Animal dog = new Animal("Canine", "Snoopy", 2, true);
          Animal cat = new Animal("Cnaina","doopy", 3, true );
          Animal eagle = new Animal("Eagle", "Snopy", -2, true );
          Animal pig = new Animal("Pig", "Snop", 2, true );
        try{
          myZoo.addAnimal(dog);
          myZoo.addAnimal(cat);
          myZoo.addAnimal(eagle);
          myZoo.addAnimal(pig);
        }catch (ZooFullException e) {
            e.getMessage();
        }catch (InvalidAgeException e){
            e.getMessage();
        }
        //finally {
          //  myZoo.displayZoo();
            //myZoo.displayAnimals();
        //}
//
//
//        System.out.println(myZoo.addAnimal(lion));
//        System.out.println(myZoo.addAnimal(dog));
//
//        myZoo.displayAnimals();
//
//        System.out.println(myZoo.searchAnimal(dog));
//        Animal dog2 = new Animal("Canine", "lll", 2, true);
//        System.out.println(myZoo.searchAnimal(dog2));
//
////           System.out.println(myZoo.removeAnimal(dog));
//        myZoo.displayAnimals();
//
//
//        System.out.println(myZoo);
//
//        myZoo.addAnimal(lion);
//        myZoo.addAnimal(dog);
//        myZoo.addAnimal(dog2);
//        myZoo.displayAnimals();
//
//
//        myZoo.setName("Belvedere Park");
//        Zoo notMyZoo1 = Zoo.comparerZoo(myZoo, notMyZoo);
//        System.out.println(notMyZoo1);
//
//        System.out.println("-------------------------------------------------------");
//        Aquatic aquatic = new Fish("Fish", "Sardine", 2, true, "Sea"); //il y a un erreur ici car aquatic on ne peut pas l'initialiser car elle est abstract, alors on va faire une classe Fish pour ne l'effacer pas
//        Terrestrial terrestrial = new Terrestrial("Panda", "Narla", 4, true, 2);
//
//
//        System.out.println(aquatic);
//        System.out.println(terrestrial);
//        System.out.println(dolphin);
//        System.out.println(penguin);
//
//
//
//        aquatic.swim();
//        dolphin.swim();
//        penguin.swim();

//        myZoo.addAquaticAnimal(dolphin);
//        myZoo.addAquaticAnimal(penguin);
//        myZoo.addAquaticAnimal(aquatic);
//        System.out.println("Profondeur maximale de nage des pingouins: " + myZoo.maxPenguinSwimmingDepth());
//        myZoo.displayNumberOfAquaticsByType();
//
//        Dolphin dolphin = new Dolphin("Delphinidae", "Flipper", 5, true, "Ocean", 14.5f);
//        Penguin penguin = new Penguin("Spheniscidae", "Skipper", 3, true, "Ocean", 25.3f);
//        Penguin penguin2 = new Penguin("Spheniscidae", "Skipper", 3, true, "Ocean", 20f);
//
//        myZoo.addAquaticAnimal(dolphin);
//        myZoo.addAquaticAnimal(penguin);
//        myZoo.addAquaticAnimal(penguin2);
//
//        System.out.println(myZoo.maxPenguinSwimmingDepth());
//        myZoo.displayNumberOfAquaticsByType();
//        myZoo.displayZoo();
//        for(Aquatic aq: myZoo.getAquaticAnimals()){
//            aq.swim();
//        }


    }

}
