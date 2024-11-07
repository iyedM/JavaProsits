package tn.esprit.gestionzoo.entities;

public final class Terrestrial extends Animal implements Omnivore<Food> {

    private int nbrLegs;

    public Terrestrial() {
    }

    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return super.toString() + ", nbrLegs:" + nbrLegs;
    }

    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT) {
            System.out.println("Terrestrial animal is eating meat.");
        } else {
            System.out.println("Terrestrial animal cannot eat this food.");
        }
    }

    @Override
    public void eatPlant(Food plant) {
        if (plant == Food.PLANT) {
            System.out.println("Terrestrial animal is eating plant.");
        } else {
            System.out.println("Terrestrial animal cannot eat this food.");
        }
    }

    @Override
    public void eatPlantAndMeat(Food food) {
        if (food == Food.BOTH) {
            System.out.println("Terrestrial animal is eating both plant and meat.");
        } else {
            System.out.println("Terrestrial animal cannot eat this food.");
        }
    }
}
