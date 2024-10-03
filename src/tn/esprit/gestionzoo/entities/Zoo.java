public class Zoo {
    Animal [] animals;
    private String name;
    String city;
    final int NBRCAGES=25;
    int nbrAnimals;
    public Zoo(String name, String city) {
        animals = new Animal[NBRCAGES];
        this.name = name;
        this.city = city;
    }
    public Zoo(){};
    public  void dispalyZoo(){
        System.out.println("name"+this.name + "nbrCages"+this.NBRCAGES);
    }
    @Override
    public String toString(){
        return "{ name : " + name + " , city: " + city + " , nbCage:  " + NBRCAGES +"}";
    }

    public boolean addAnimal(Animal animal){
        if(isZooFull()==true)
            return false;
        else{
            animals[nbrAnimals] = animal;
            nbrAnimals++;
        }
        return true;


    }
    public int searchAnimal(Animal animal){
        int index=-1;
        for(int i=0;i<nbrAnimals;i++){
            if (animals[i].name==animal.name){
                return i;

            }

        }
        return index;
    }
    public void displayAnimals(){
        for(int i=0;i<nbrAnimals;i++){
            System.out.println(animals[i]);
        }
    }
    public boolean removeAnimal(Animal animal){
        int index=searchAnimal(animal);
        if(index==-1)
            return false;
        for(int i=index;i<nbrAnimals;i++){
            animals[i]=animals[i+1];
            animals[nbrAnimals]=null;
        }
        nbrAnimals--;
        return true;
    }

    public boolean isZooFull() {
        if (nbrAnimals==NBRCAGES) {
            System.out.println("Zoo is full");
            return true;
        }else if (nbrAnimals >= NBRCAGES) {
            return false;
        }
        else {
            System.out.println("Zoo is not full yet");
            return false;
        }
    }
    public Zoo compareZoo(Zoo z1, Zoo z2){
        if(z1.nbrAnimals >z2.nbrAnimals){
            return z1;
        } else if (z1.nbrAnimals <z2.nbrAnimals) {
            return z2;
        }else {
            return z1;
        }
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        if (name.isEmpty()){
            System.out.println("Invalid Name");
        }else
            this.name = name;
    }

}
