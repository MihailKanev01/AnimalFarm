package farm;

public class Horse extends Animal implements Freight{
    public Horse(double width, double length, double height, double maxPower) {
        super(width, length, height, maxPower);
    }

    @Override
    public void eat() {

    }

    public String neigh(){
        return "Цвилене";
    }

    @Override
    public void work() {

    }
}
