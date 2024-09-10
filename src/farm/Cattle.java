package farm;

public class Cattle extends  Milking implements Freight{
    public Cattle(double width, double length, double height, double maxPower, double maxQuantity) {
        super(width, length, height, maxPower, maxQuantity);
    }

    @Override
    public void eat() {

    }

    @Override
    public void work() {

    }

    public String moo(){
        return "Мучене";
    }
}
