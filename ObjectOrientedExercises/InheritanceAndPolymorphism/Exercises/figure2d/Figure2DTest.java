package figura2d;

/**
 *
 * @author vimago
 */
public class Figure2DTest {
    public static void main(String[] args) {
        // Test Rectangle
        Figure2D rectangle = new Rectangle(5, 10);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());

        // Test Square
        Figure2D square = new Square(7);
        System.out.println("Square Area: " + square.calculateArea());
        System.out.println("Square Perimeter: " + square.calculatePerimeter());

        // Test Circle
        Figure2D circle = new Circle(4);
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());
    }
}
