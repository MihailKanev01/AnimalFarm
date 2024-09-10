package farm;

public class Sheep extends Milking{
    public Sheep(double width, double length, double height, double maxPower, double maxQuantity) {
        super(width, length, height, maxPower, maxQuantity);
    }

    @Override
    public void eat() {

    }

    public String bleat(){
        return "Блеене";
    }
}
