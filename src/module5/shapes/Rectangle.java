package module5.shapes;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle (double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    @Override
    public double area(){
        return width * length;
    }

    @Override
    public String toString() {
        return super.toString() + "of Width" + width + "and Length" + length;
    }

}
