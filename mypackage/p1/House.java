
package p1;

public class House {
    // private Room nonPublicRoomClass; // Private Instance Variable of a Non-public class usable within the same package
    public String location, color;
    public int builtin = 1899, totalRooms;

    public House(int totalRooms, String location, String color) {
        // nonPublicRoomClass = new Room(totalRooms, location, color);
        this.totalRooms = totalRooms;
        this.location = location;
        this.color = color;
    }

    public void getLocation() {
        System.out.println("House situated at " + location);
    }
}
