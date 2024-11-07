package tn.esprit.gestionzoo.entities;

public  non-sealed  class Aquatic extends Animal implements Carnivore<Food> {
    //if we need to add swim() we need abstract after non-sealed

    protected String habitat;

    public Aquatic() {
    }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }


    //public abstract void  swim();


    @Override
    public String toString() {
        return super.toString() + ", habitat:" + habitat;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (this == obj)
            return true;
        if (obj instanceof Aquatic a)
            return getName().equals(a.getName())&& habitat.equals(a.habitat)&&getAge()==a.getAge();
        return false;
    }
    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT) {
            System.out.println("Aquatic animal is eating meat.");
        } else {
            System.out.println("Aquatic animal cannot eat this food.");
        }
    }
}
