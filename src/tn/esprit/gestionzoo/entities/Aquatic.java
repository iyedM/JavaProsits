package tn.esprit.gestionzoo.entities;

public  non-sealed abstract class Aquatic extends Animal {

    protected String habitat;

    public Aquatic() {
    }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }


    public abstract void  swim();


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
}
