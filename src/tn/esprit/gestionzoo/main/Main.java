public class Main {

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
        Zoo zoo1 = new Zoo("belfidere","tunis");

        //System.out.println(zoo1);
        System.out.println(zoo1.toString());
        System.out.println(zoo1.isZooFull());
    }

}