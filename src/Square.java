public class Square extends Rectangle {

    // default constructor
    public Square() {
        super();
    }

    // parameterized constructor - square dimensions only
    // use same instance variables as Rectangle but only allow identical length and width
    public Square(double side) {
        super(side, side);
    }

    // parameterized constructor
    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return super.getWidth();
    }

    // Square-specific setter, applies side length to both length and width
    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    // override Rectangle setters to always maintain square geometry
    public void setLength(double length) {
        setSide(length);
    }

    public void setWidth(double width) {
        setSide(width);
    }

    public String toString() {
        return super.toString() + "\nA Square with side " + this.getWidth();
    }
}
