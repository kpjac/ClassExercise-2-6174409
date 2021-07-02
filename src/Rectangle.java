public class Rectangle extends Shape {

    private double width;
    private double length;

    // default constructor
    public Rectangle() {
        super();
        width = 1.0;
        length = 1.0;
    }

    // parameterized constructor - rectangle dimensions only
    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    // parameterized constructor
    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    public String toString() {
        return super.toString() + "\nA Rectangle with width " + width + " and length " + length;
    }
}
