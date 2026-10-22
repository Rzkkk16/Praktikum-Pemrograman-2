package module5.shapes;

public class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder (double radius, double height) {
        super("Cyclinder");
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double area()
    {
        return Math.PI * radius * radius * height;
    }

    @Override
    public String toString() {
        return super.toString() + "of Radius" + radius + "and Height" + height;
    }
}
