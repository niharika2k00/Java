
package p1;

public class Room extends House {
    // public int roomNo;
    // public int area;
    public static int area, roomNo;

    public Room(int roomNo, String location, String color) {
        super(roomNo, location, color);
        // roomNo = Math.random() * ( roomNo - 0 )
        this.roomNo = totalRooms;
        this.color = color;
    }

    public static void setRoomArea(int areaValue) {
        System.out.println("value received = " + areaValue);
        area = (areaValue + (int) (Math.random() * (roomNo - 1 + 1)) + 1);
    }

    public int getRoomArea() {
        return area;
    }

    public void describeRoom() {
        System.out.println("Room with area " + area + " and color " + color);
    }
}