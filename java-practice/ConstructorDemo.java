/*
 * ╔══════════════════════════════════════════════════╗
 * ║     CONSTRUCTOR OVERLOADING + CHAINING           ║
 * ║                                                  ║
 * ║  Overloading → same name, different parameters   ║
 * ║  Chaining    → this() calls another constructor  ║
 * ║  super()     → calls parent constructor          ║
 * ║  this()      → calls own constructor             ║
 * ╚══════════════════════════════════════════════════╝
 */

public class ConstructorDemo {
  public static void main(String[] args) {

    // ── 1. Constructor Overloading ───────────────────────────
    System.out.println("── 1. Constructor Overloading ──");

    House h1 = new House(); // default
    House h2 = new House(10); // 1 param
    House h3 = new House(8, "Crimson"); // 2 params
    House h4 = new House(5, "Blue", "Villa"); // 3 params

    System.out.println(h1.join("Java ", "is OOP!"));

    // ── 2. Constructor Chaining — this() ────────────────────
    System.out.println("\n── 2. Constructor Chaining (this) ──");
    new Calculator(); // triggers chain → 3 → 2 → 1

    // ── 3. super() — Parent → Child chain ───────────────────
    System.out.println("\n── 3. super() Constructor Chain ──");
    Villa v1 = new Villa();

    System.out.println();
    Villa v2 = new Villa("Beverly Hills", 5, "Olympic Pool");
  }
}

// ════════════════════════════════════════════════════════════════
// SECTION 1 — Constructor OVERLOADING
// same class, different parameter signatures
// ════════════════════════════════════════════════════════════════

class House {
  String color;
  int rooms;
  String type;

  // Default constructor
  House() {
    System.out.println("House() → default house created");
  }

  // paramaterized constructor 1 param
  House(int rooms) {
    this.rooms = rooms;
    System.out.println("House(int) → rooms : " + rooms);
  }

  // 2 params
  House(int rooms, String color) {
    this.rooms = rooms;
    this.color = color;
    System.out.println("House(int, String) → " + rooms + " rooms | color : " + color);
  }

  // 3 params
  House(int rooms, String color, String type) {
    this.rooms = rooms;
    this.color = color;
    this.type = type;
    System.out.println("House(int, String, String) → "
        + rooms + " rooms | " + color + " | " + type);
  }

  public String join(String a, String b) {
    return a.concat(b);
  }
}

// ════════════════════════════════════════════════════════════════
// SECTION 2 — Constructor CHAINING using this()
// one constructor calls another in the same class
// ════════════════════════════════════════════════════════════════

class Calculator {
  int x, y;

  // Constructor 1 — default, chains to (int)
  Calculator() {
    this(4); // → calls Calculator(int)
    System.out.println("Calculator() → default");
  }

  // Constructor 2 — chains to (int, int)
  Calculator(int x) {
    this(x, 5); // → calls Calculator(int, int)
    System.out.println("Calculator(int) → x = " + x);
  }

  // Constructor 3 — base, no chaining
  Calculator(int x, int y) {
    this.x = x;
    this.y = y;
    System.out.println("Calculator(int, int) → " + x + " x " + y + " = " + (x * y));
  }

  /*
   * Chain order when new Calculator() called:
   *   Calculator()
   *       └── this(4) → Calculator(4)
   *                         └── this(4,5) → Calculator(4,5)
   *                                              "4 x 5 = 20"
   *                              "Calculator(int) → x = 4"
   *          "Calculator() → default"
   */
}

// ════════════════════════════════════════════════════════════════
// SECTION 3 — super() chaining across Parent → Child → Grandchild
// ════════════════════════════════════════════════════════════════

// Parent
class Property {
  String location;

  Property() {
    System.out.println("Property() → base property created");
  }

  Property(String location) {
    this.location = location;
    System.out.println("Property(String) → location : " + location);
  }
}

// Child
class Bunglow extends Property {
  int rooms;

  Bunglow() {
    super(); // calls Property()
    System.out.println("Bunglow() → basic house");
  }

  Bunglow(String location, int rooms) {
    super(location); // calls Property(String)
    this.rooms = rooms;
    System.out.println("Bunglow(String, int) → rooms : " + rooms);
  }
}

// Grandchild
class Villa extends Bunglow {
  String amenity;

  Villa() {
    super(); // calls Bunglow()
    System.out.println("Villa() → basic villa");
  }

  Villa(String location, int rooms, String amenity) {
    super(location, rooms); // calls Bunglow(String, int)
    this.amenity = amenity;
    System.out.println("Villa(String,int,String) → amenity : " + amenity);
  }
}