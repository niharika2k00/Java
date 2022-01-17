
public class Method {

    public static void main(String[] args) {

        // Static Method in java --> Access static method() and fields using Class Name
        Bunglow.Country(" New Zealand ");
        System.out.println(" Coming from the Static Method  ==>  " + Bunglow.place);

        Bunglow objA = new Bunglow();
        int res = objA.totalPopulation(210, 300);
        System.out.println(" \nTotal Members   ==>   " + res);

        // Values Assign
        objA.balcony = 4;
        objA.room = 8;
        objA.color = "Crimson";
        objA.design();
    }

}

class Bunglow {

    // Instance Variables
    public static String place = "";
    int balcony;
    int room;
    String color;

    // Static Method
    public static void Country(String name) {
        place = name;
    }

    public int totalPopulation(int p1, int p2) {
        return p1 + p2;
    }

    public void design() {
        System.out.println("\n It contains " + balcony + " Balcony And " + room + " Rooms  of " + color + " color. ");
    }

}
