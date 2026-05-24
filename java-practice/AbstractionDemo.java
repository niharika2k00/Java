/*
 * ══════════════════════════════════════════════════════════════════
 *                    ABSTRACTION — Complete Revision
 * ══════════════════════════════════════════════════════════════════
 *
 *  Abstract Class  → restricted, cannot create object directly
 *  Abstract Method → no body, must be overridden in child
 *  Non-Abstract    → has body, inherited as-is
 *  Constructor     → abstract class CAN have constructor
 *  super()         → calls parent constructor / method
 *  @Override       → child provides body for abstract method
 *
 *  📌⚠️ Rule:
 *  ParentClass obj = new ChildClass()
 *  → obj can only call methods defined in ParentClass, OR overridden methods run from ChildClass
 * ══════════════════════════════════════════════════════════════════
 */

public class AbstractionDemo {
    public static void main(String[] args) {

        // ── 1. Basic Abstract Class (Bike → Honda) ───────────────
        System.out.println("── 1. Bike → Honda ──");
        Bike bike = new Honda(); // ParentClass obj = new ChildClass
        bike.run();
        bike.changeGear();
        System.out.println(bike.display());
        // bike.age() ❌ — age() not in Bike, can't access via Bike ref

        // ── 2. Abstract Class with Constructor (Shape) ───────────
        System.out.println("\n── 2. Shape → Circle ──");
        Shape circle = new Circle("Red", 2.2);
        System.out.println(circle); // calls toString()
        System.out.println("Color: " + circle.getColor() + " and Area: " + circle.calcArea());

        // ── 3. Polymorphism via abstract reference ────────────────
        System.out.println("\n── 4. Polymorphism — Shape array ──");
        Shape[] shapes = {
                new Circle("Blue", 5),
                new Rectangle("Green", 3, 6),
                new Circle("Pink", 1.5)
        };

        for (Shape s : shapes) {
            System.out.println(s); // each calls their own toString()
        }
    }
}

// ════════════════════════════════════════════════════════════════
// CONCEPT 1 — Abstract class with abstract + non-abstract methods
// ════════════════════════════════════════════════════════════════

abstract class Bike {
    Bike() { // ✅ abstract class CAN have constructor
        System.out.println("Bike constructor called");
    }

    abstract void run(); // abstract methods — no body, child MUST override

    abstract String display();

    void changeGear() { // non-abstract — has body, child inherits as-is
        System.out.println("Gear changed");
    }
}

class Honda extends Bike {
    Honda() { // super() called implicitly → Bike()
        System.out.println("Honda constructor called");
    }

    @Override
    void run() {
        System.out.println("Honda running safely");
    }

    @Override
    String display() {
        System.out.println("Inside Honda display()");
        super.changeGear(); // calling parent non-abstract method
        return "Response 200 — All good!\n";
    }

    // extra method — only accessible via Honda reference, not Bike
    void age() {
        System.out.println("Honda age : 10 years");
    }
}

// ════════════════════════════════════════════════════════════════
// CONCEPT 2 — Abstract class with constructor + super() + calcArea
// ════════════════════════════════════════════════════════════════

abstract class Shape {
    String color;

    // abstract class constructor — called via super() from child
    public Shape(String color) {
        System.out.println("Shape constructor called");
        this.color = color;
    }

    // abstract methods — child must provide body
    abstract double calcArea();

    @Override
    public abstract String toString();

    // non-abstract — usable directly
    public String getColor() {
        return color;
    }
}

class Circle extends Shape {
    double radius;

    public Circle(String color, double radius) {
        super(color); // calls Shape(color)
        System.out.println("Circle constructor called");
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return Math.round((Math.PI * Math.pow(radius, 2)) * 100) / 100.0; // π r²
    }

    @Override
    public String toString() {
        return "Circle  | color : " + getColor() + " | area : " + calcArea();
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(String color, double length, double width) {
        super(color); // calls Shape(color)
        System.out.println("Rectangle constructor called");
        this.length = length;
        this.width = width;
    }

    @Override
    public double calcArea() { // ✅ must be public, not private
        return length * width;
    }

    @Override
    public String toString() {
        return "Rectangle | color : " + getColor() + " | area : " + calcArea();
    }
}
