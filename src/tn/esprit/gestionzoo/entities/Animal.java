package tn.esprit.gestionzoo.entities;

public class Animal {
    public String family;
    public String name;
    private int age;
    public boolean isMammal;

    //constructor

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    @Override
    public String toString() {
        return "tn.esprit.gestionzoo.entities.Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }

    public Animal(){};

    public int getAge() {
        return age;
    }
    public void setAge(int age){
        if (age<=0){
            System.out.println("Invalid Age");
        }else
        this.age = age;
    }


}

