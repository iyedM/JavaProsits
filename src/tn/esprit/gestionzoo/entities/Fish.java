package tn.esprit.gestionzoo.entities;

public class Fish extends Aquatic {

    public Fish(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal, habitat);
    }

    @Override
    public void swim() {
        System.out.println(getName()+" is swimming");
    }
}
