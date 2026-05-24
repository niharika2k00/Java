public class InheritanceDemo {
  public static void main(String[] args) {

    // 1. Default Constructor Chain
    System.out.println("── 1. Default Constructor Chain ──");
    Car car = new Car();

    // 2. Parameterized Constructor + super()
    System.out.println("\n── 2. Parameterized Constructor ──");
    Car sportsCar = new Car("Ferrari", 300);

    // 3. Method Overriding
    System.out.println("\n── 3. Method Overriding ──");
    sportsCar.describe();

    // 4. Protected Variable Access
    System.out.println("\n── 4. Protected Variable ──");
    sportsCar.showFuelType();

    // 5. Inherited Method
    System.out.println("\n── 5. joinString() ──");
    int len = sportsCar.joinString("Ferrari ", "is Fast!");
    System.out.println("Label Length : " + len);

    // 6. Multilevel Inheritance Chain A → B → C
    System.out.println("\n── 6. Multilevel Inheritance ──");
    ElectricCar tesla = new ElectricCar("Tesla", 250, 400);
    tesla.start();

    // 7. Grandchild accessing everything
    System.out.println("\n── 7. Grandchild Access ──");
    tesla.describe();
    tesla.showFuelType();
    tesla.showBatteryRange();
  }
}

// ── Level 1 : Parent ───────────────────────────────────────────
class Vehicle {
  protected String brand;
  protected String fuelType = "Petrol";

  public Vehicle() {
    System.out.println("Vehicle created");
  }

  public Vehicle(String brand) {
    this.brand = brand;
    System.out.println("Vehicle brand set : " + brand);
  }

  public int joinString(String s1, String s2) {
    System.out.println("Label : " + s1.concat(s2));
    return s1.length() + s2.length();
  }

  public void describe() {
    System.out.println("I am a Vehicle");
  }

  public void start() {
    System.out.println("Vehicle  → engine starts");
  }
}

// ── Level 2 : Child ────────────────────────────────────────────
class Car extends Vehicle {
  protected int topSpeed;

  public Car() {
    System.out.println("Car created");
  }

  public Car(String brand, int topSpeed) {
    super(brand); // calls Vehicle(brand)
    this.topSpeed = topSpeed;
    System.out.println("Car : " + brand + " | Top Speed : " + topSpeed);
  }

  @Override
  public void describe() {
    System.out.println("I am a Car  | Brand : " + brand + " | Speed : " + topSpeed + " km/h");
  }

  public void showFuelType() {
    System.out.println("Fuel Type : " + fuelType); // protected from Vehicle
  }

  @Override
  public void start() {
    super.start(); // Vehicle.start()
    System.out.println("Car      → gear engaged");
  }
}

// ── Level 3 : Grandchild ───────────────────────────────────────
class ElectricCar extends Car {
  private int batteryRange;

  public ElectricCar(String brand, int topSpeed, int batteryRange) {
    super(brand, topSpeed); // calls Car(brand, topSpeed)
    this.batteryRange = batteryRange;
    this.fuelType = "Electric";
    System.out.println("ElectricCar : range = " + batteryRange + " km");
  }

  @Override
  public void describe() {
    System.out.println("I am an ElectricCar | Brand : " + brand
        + " | Speed : " + topSpeed
        + " | Range : " + batteryRange + " km");
  }

  public void showBatteryRange() {
    System.out.println("Battery Range : " + batteryRange + " km");
  }

  @Override
  public void start() {
    super.start(); // Car.start() → Vehicle.start()
    System.out.println("ElectricCar → silent motor on");
  }
}

/*
⚠️🚨 Note:
    -- when we are create & call the obj of SubClass  ==>  then it calls the (SuperClass  +  SubClass) Default Constructor
    -- use Super(parameter); to call the parameterized constructor for Super Class
*/

// https://www.javatpoint.com/inheritance-in-java
