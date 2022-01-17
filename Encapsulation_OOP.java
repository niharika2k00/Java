
class Encap {
    // private variables declared these can only be accessed by PUBLIC METHODS  of class.
    private String geekName;
    private int geekRoll;
    private int geekAge;

    // get method for age to access
    // private variable geekAge
    public int getAge() {
        return geekAge;
    }

    // get method for name to access
    // private variable geekName
    public String getName() {
        return geekName;
    }

    // get method for roll to access
    // private variable geekRoll
    public int getRoll() {
        return geekRoll;
    }

    // set method for age to access
    // private variable geekage
    public void setAge(int newAge) {
        geekAge = newAge;
    }

    // set method for name to access
    // private variable geekName
    public void setName(String newName) {
        geekName = newName;
    }

    // set method for roll to access
    // private variable geekRoll
    public void setRoll(int newRoll) {
        geekRoll = newRoll;
    }
}

public class Encapsulation_OOP {

    public static void main(String[] args) {
        Encap obj = new Encap();

        // setting values of the variables
        obj.setName("Ms. Mathew");
        obj.setAge(69);
        obj.setRoll(12378562);

        // Displaying values of the variables
        System.out.println("Employee's name: " + obj.getName());
        System.out.println("Employee's age: " + obj.getAge());
        System.out.println("Employee's ID: " + obj.getRoll());
    }
}