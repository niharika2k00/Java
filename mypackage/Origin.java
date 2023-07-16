import p1.*;

public class Origin {
    public static void main(String[] args) {
        System.out.println("helo");

        House house1 = new House(1968, "Kolkata", "Light Yellow");
        house1.getLocation();

        Room room1 = new Room(20, "Kolkata", "Pink");
        Room.setRoomArea(8);
        System.out.println("Get room area => " + room1.getRoomArea());
        room1.getLocation();

        System.out.println("Child Class can access Parent Class properties directly :" + Room.area);
    }
}

// Only Public Class can be accessed outside the package
