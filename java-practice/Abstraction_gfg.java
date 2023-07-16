abstract class Shape {
    String color;

    // these are abstract methods
    abstract double calcArea();

    public abstract String toString();

    // abstract class can have the constructor
    public Shape(String color) {
        System.out.println("Shape constructor called");
        this.color = color;
    }

    // non-abstract so contains body
    public String getColor() {
        return color;
    }
}

class Circle extends Shape {
    double radius;

    public Circle(String color, double radius) {
        super(color); // calling Shape constructor
        System.out.println("Circle constructor called");
        this.radius = radius;
    }

    @Override
    double calcArea() {
        return Math.round((Math.PI * Math.pow(radius, 2)) * 100) / 100.0; //  pi r^2
    }

    @Override
    public String toString() {
        return "Circle color is " + super.getColor() + " and area is : " + calcArea();
    }
}

class Rectangle extends Shape {

    double length;
    double width;

    public Rectangle(String color, double length, double width) {
        // calling Shape constructor
        super(color);
        System.out.println("Rectangle constructor called");
        this.length = length;
        this.width = width;
    }

    @Override
    private double calcArea() {
        return length * width;
    }

    @Override
    public String toString() {
        return "Rectangle color is " + super.getColor() + " and area is : " + calcArea();
    }
}

public class Abstraction_gfg {
    public static void main(String[] args) {
        Shape s1 = new Circle("Red", 2.2);
        Shape s2 = new Rectangle("Yellow", 2, 4);

        System.out.println(s1.toString());
        // System.out.println(s2.toString());

        // PRIVATE method CANNOT be accessible from other class. But PROTECTED , FINAL , PUBLIC can be accessible.
        System.out.println("Area of the Rectangle : " + s2.calcArea());
    }
}
