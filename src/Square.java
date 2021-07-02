public class Square extends Rectangle {
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return super.getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

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
