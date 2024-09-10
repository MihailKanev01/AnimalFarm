package farm;

public abstract class Animal implements Volume {
    private Dimensions dimension;
    private double power;
    private double maxPower;

    public Animal(double width, double length, double height, double maxPower) {
        this.dimension = new Dimensions(width, length, height);
        this.maxPower = maxPower;
    }
    public abstract void eat();

    public boolean fed(){
        return maxPower>power;
    }

    public double getPower(){
        return this.power;
    }
    public double getMaxPower(){
        return this.maxPower;
    }

    public double getWidth() {
        return dimension.getWidth();
    }

    public double getLength() {
        return dimension.getLength();
    }

    public double getHeight() {
        return dimension.getHeight();
    }

    protected void setPower(double power){
        this.power=power;
    }
    @Override
    public double calculate() {
        return getHeight()*getWidth()*getLength();
    }
}
