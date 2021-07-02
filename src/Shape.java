public abstract class Shape {

    private String color;
    boolean filled;

    // default constructor
    public Shape() {
        color = "red";
        filled = true;
    }

    // parameterized constructor
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        return "A Shape with color of " + color + " is " + (filled ? "filled" : "not filled");
    }

    // abstract methods to calculate area and perimeter - implemented in subclasses
    public abstract double getArea();

    public abstract double getPerimeter();

}
