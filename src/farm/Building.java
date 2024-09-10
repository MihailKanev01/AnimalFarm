package farm;

public class Building implements Volume{
    private Dimensions dimension;

    public Building(double width, double length, double height) {
        this.dimension = new Dimensions(width, length, height);
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

    @Override
    public double calculate() {
        return getHeight()*getWidth()*getLength();
    }
}
