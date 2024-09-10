package farm;

public class Goat extends Milking {
    public Goat(double width, double length, double height, double maxPower, double maxQuantity) {
        super(width, length, height, maxPower, maxQuantity);
    }

    @Override
    public void eat() {

    }

    public String bleat(){
        return "Блеене";
    }
}
