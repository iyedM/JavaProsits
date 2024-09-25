import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //prosit1
//        int nbrCages0 = 20;
//        String zooName="my zoo";
//        System.out.println(zooName+ " comporte "+ nbrCages0+ " cages");
//        Scanner scan = new Scanner(System.in);
//        System.out.println("enter zoo name: ");
//        zooName = scan.next();
//        System.out.println("enter the number of cages: ");
//        nbrCages0 = scan.nextInt();
//        System.out.println(zooName+ " comporte "+ nbrCages0+ " cages");
        //end prosit1


        //Instruction5
//        Animal lion1 = new Animal();
//        lion1.family = "Cats"; lion1.name = "Lion"; lion1.age = 15; lion1.isMammal = true;
//        Zoo zoo = new Zoo();
//        zoo.city="borj cedriya";
//        zoo.nbrCages = 25;
//        Animal[] animals = new Animal[25];
        Animal lion = new Animal("cats", "Lion", 15, true);
        Zoo zoo = new Zoo("myZoo","ariana", 5 );
        System.out.println(lion.name);
        System.out.println(zoo.name);
        zoo.displayZoo();
        System.out.println(zoo);
        System.out.println(zoo.toString());
        //ces deux sout affichent les adresses memoires de l'objet zoo
        System.out.println(lion.toString());
//        zoo.animals[0] = lion;
        System.out.println(zoo);
        Animal tiger = new Animal("tiger", "Tiger", 15, true);
        Animal eagle = new Animal("eagle", "Eagle", 15, true);
        Animal wolf = new Animal("wolf", "Wolf", 15, true);
        System.out.println(zoo.addAnimal(lion));
        System.out.println(zoo.addAnimal(eagle));
        System.out.println(zoo.addAnimal(wolf));

        System.out.println(zoo);
        zoo.displayAnimals();
        zoo.addAnimal(lion);
        System.out.println(zoo.searchAnimal(wolf));
        Animal wolf1 = new Animal("wolf", "Wolf", 15, true);
        zoo.addAnimal(wolf1);
        zoo.displayAnimals();
        System.out.println(zoo.searchAnimal(wolf1));
        //il affiche la meme indice que wolf
        System.out.println(zoo.removeAnimal(lion));
        zoo.displayAnimals();
        zoo.isZooFull();
        Zoo zoo2 = new Zoo("myZoo2","ariana", 5);
        zoo.comparerZoo(zoo, zoo2);
    }
    }

        /* ZooManagement zoo = new ZooManagement();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter zoo name: ");
        zoo.zooName = sc.nextLine();
        boolean test  = false;
        while (!test) {
            System.out.println("Enter the number of Cages: ");
            if (sc.hasNextInt()) {
                zoo.nbrCages = sc.nextInt();
                test = true;
            } else {
                System.out.println("retype a valid number");
                sc.next();
            }
        }

        System.out.println(zoo.zooName+ " comporte "+ zoo.nbrCages+ " cages");

    }
}


Instruction1

public class ZooManagement {
    int nbrCages = 20;
    String zooName= "my zoo";
    public static void main (String[] args) {
        ZooManagement zoo = new ZooManagement();

        System.out.println(zoo.zooName+ " comporte "+ zoo.nbrCages+ " cages");

    }
}

*/