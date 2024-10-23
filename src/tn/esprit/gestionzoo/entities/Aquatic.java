package tn.esprit.gestionzoo.entities;

public  non-sealed abstract class Aquatic extends Animal {

    protected String habitat;

    public Aquatic() {
    }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }


    public abstract void swim();


    @Override
    public String toString() {
        return super.toString() + ", habitat:" + habitat;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Si les objets sont identiques, ils sont égaux
        if (obj == null || getClass() != obj.getClass()) return false; // Si l'objet est null ou n'est pas de la même classe, ils ne sont pas égaux

        Aquatic aquatic = (Aquatic) obj; // Conversion de l'objet en type Aquatic

        // Comparaison des attributs name, age et habitat à l'aide des getters
        return this.getName().equals(aquatic.getName()) &&
                this.getAge() == aquatic.getAge() &&
                this.habitat.equals(aquatic.habitat);
    }


}
