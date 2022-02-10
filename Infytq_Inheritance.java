
//  Parent Class / Super Class
class EarPlug {
    public String color;
    private String brand;

    EarPlug(String color, String brand) {
        this.color = "Grey";
        this.brand = brand;
    }

    public void display() {
        System.out.println(this.brand + " " + this.color);
    }
}

//  Child Class  inherits from the Parent EarPlug. 
class WirelessEarPlug extends EarPlug {
    private int version;

    WirelessEarPlug(String color, String brand) {
        super(color, brand);
        this.version = 4;
    }

    public void displayWireless() {
        this.display(); // accessing the Parent Method
        System.out.println(this.version);
    }
}

public class Infytq_Inheritance {
    public static void main(String[] args) {
        EarPlug obj1 = new WirelessEarPlug("Black", "Noise");
        obj1.display();

        WirelessEarPlug obj2 = new WirelessEarPlug("Black", "Boat");
        obj2.color = "White";
        obj2.displayWireless();
    }
}
