package farm;

import java.util.HashSet;
import java.util.Set;

public class Barn extends Building{
    private Set<Cage> cages;

    public Barn(double width, double length, double height, int cageCount) {
        super(width, length, height);
        this.cages = new HashSet<>(cageCount);
    }
    public void addAnimal(Animal animal){

    }

    public void removeAnimal(Animal animal){

    }

    public Set<Cage> getCages() {
        return cages;
    }
    public Set<Animal> getAnimals() {
        return null;
    }

    public boolean removeAll(){
        return true;
    }
}
