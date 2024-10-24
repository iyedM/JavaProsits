package tn.esprit.gestionzoo.entities;

public class Zoo {

    public static final int NUMBER_OF_CAGES = 3;
    private Animal[] animals;
    private String name, city;
    private int nbrAnimals;
    Aquatic[] aquaticAnimals;
    private int nbrAquaticAnimals;
    public Zoo() {
    }

    public Zoo(String name, String city) {
        animals = new Animal[NUMBER_OF_CAGES];
        this.name = name;
        this.city = city;
        aquaticAnimals= new Aquatic[10];
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals)
            return z1;
        return z2;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank())
            System.out.println("The Zoo name cannot be empty");
        else
            this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public void setNbrAnimals(int nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }

    public void displayZoo() {
        System.out.println("Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + nbrAnimals);
    }

    public void addAnimal(Animal animal) throws ZooFullException, InvalidAgeException{
//        if (searchAnimal(animal) != -1)
//            return false;
        if (isZooFull())
            throw new ZooFullException("Zoo est Full");
        if(animal.getAge()<0)
            throw new InvalidAgeException("Invalid Age");
        try {
            animals[nbrAnimals] = animal;
            nbrAnimals++;

        }finally {
            System.out.println("nombre d'animals: "+ nbrAnimals);

        }
        //return true;
    }

    public boolean removeAnimal(Animal animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1)
            return false;
        for (int i = indexAnimal; i < nbrAnimals; i++) {
            animals[i] = animals[i + 1];
        }
        animals[nbrAnimals] = null;
        this.nbrAnimals--;
        return true;
    }

    public void displayAnimals() {
        System.out.println("List of animals of " + name + ":");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < nbrAnimals; i++) {
            if (animal.getName() == animals[i].getName())
                return i;
        }
        return index;
    }

    public boolean isZooFull() {
        return nbrAnimals == NUMBER_OF_CAGES;
    }

    @Override
    public String toString() {
        return "Zoo{ Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + nbrAnimals + "}";
    }

    public void addAquaticAnimal(Aquatic aquatic){
        aquaticAnimals[nbrAquaticAnimals] = aquatic;
        nbrAquaticAnimals++;
        System.out.println("Aquatic added successfully");
    }


    public int getNbrAquaticAnimals() {
        return nbrAquaticAnimals;
    }
    public void setNbrAquaticAnimals(int nbrAquaticAnimals) {
        this.nbrAquaticAnimals = nbrAquaticAnimals;
    }
    public Aquatic[] getAquaticAnimals() {
        return aquaticAnimals;
    }
    public void setAquaticAnimals(Aquatic[] aquaticAnimals) {
        this.aquaticAnimals = aquaticAnimals;
    }

    public float maxPenguinSwimmingDepth(){
        float max=0f;
        for(int i=0;i<nbrAquaticAnimals;i++){
            if (aquaticAnimals[i] instanceof Penguin p){
                //Penguin p = (Penguin)aquaticAnimals[i];
                if( p.getSwimmingDepth() > max){
                    max =p.getSwimmingDepth();
                }
            }
        }
        return max;
    }

    public void displayNumberOfAquaticsByType(){
        int nbrDolphin=0;
        int nbrPenguin=0;
        for(Aquatic i : aquaticAnimals){
            if(i instanceof Penguin)
                nbrPenguin++;
            if (i instanceof Dolphin)
                nbrDolphin++;
        }
        System.out.println("Nombre des penguins: "+nbrPenguin);
        System.out.println("Nombre des dolphins: "+nbrDolphin);
    }


}
