
public class Method {

    public static void main(String[] args) {

        // Static Method in java --> Access static method() and fields using Class Name
        Foreign.Country(" New Zealand ");
        System.out.println(" Coming from the Static Method  ==>  " + Foreign.place);

        Foreign obj = new Foreign();
        int res = obj.totalPopulation(210, 300);
        System.out.println(" \nTotal Population   ==>   " + res);
    }

}

class Foreign {

    public static String place = "";

    public static void Country(String name) {
        place = name;
    }

    public int totalPopulation(int p1, int p2) {
        return p1 + p2;
    }
}
