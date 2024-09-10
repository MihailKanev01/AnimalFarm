package farm;

public abstract class Milking extends Animal implements Milky {
    private double quantity;
    private double maxQuantity;

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getMaxQuantity() {
        return maxQuantity;
    }

    @Override
    public boolean start() {
        return false;
    }

    @Override
    public boolean progress() {
        return false;
    }

    @Override
    public boolean stop() {
        return false;
    }

    public Milking(double width, double length, double height, double maxPower, double maxQuantity) {
        super(width, length, height, maxPower);
        this.maxQuantity= maxQuantity;
    }
}
