
/* 
          CONSTRUCTOR OVERLOADING 
       _____________________________

    - Same Name as Class Name    
    -  Different Parameters  
*/

class ConstructorOverloading {

    ConstructorOverloading() {
        System.out.println("This is a Self - Constructor");
    }

    public static void main(String[] args) {
        System.out.println("\nHello Im the Main Function");

        // Constructor
        ConstructorOverloading Object0 = new ConstructorOverloading(); // Default Self Constructor
        House Object1 = new House(10);
        House Object2 = new House(8, "Crimson");

        System.out.println(Object1);

        House ObjAppend = new House(); // Calls the default constructor
        String ans = ObjAppend.Join("Java ", " is an OOP Languages. ");
        System.out.println(ans);
    }
}

class House {
    House() {
        System.out.println("\nI'm the DEFAULT CONSTRUCTOR of Class House.\n");
    }

    // Parameterized Constructor
    public House(int x) {
        System.out.println("Received " + x + " as props.");
    }

    House(int x, String color) {
        System.out.println(x + " " + color + " Curtains");
    }

    public String Join(String a, String b) {
        return a.concat(b);
    }
}
