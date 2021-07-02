public class TestShapes {
    public static void main(String[] args) {

        // test constructors
        Circle c0 = new Circle();
        Circle c1 = new Circle(3.5);
        Circle c2 = new Circle(5.75, "blue", false);
        Rectangle r0 = new Rectangle();
        Rectangle r1 = new Rectangle(10, 15);
        Rectangle r2 = new Rectangle("orange", true, 8 ,9);
        Square s0 = new Square();
        Square s1 = new Square(6);
        Square s2 = new Square("pink", true, 7);

        // create array of different shapes and test toString methods
        Shape[] shapes = {c0, c1, c2, r0, r1, r2, s0, s1, s2};
        for (Shape s : shapes) {
            System.out.println(s);
        }

        // test area and perimeter methods on all classes
        System.out.println(c1.getArea());
        System.out.println(r1.getArea());
        System.out.println(s1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(r1.getPerimeter());
        System.out.println(s1.getPerimeter());
    }
}
