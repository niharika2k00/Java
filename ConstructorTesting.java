
class Car {

    String name;
    int millage;

    Car() {
        System.out.println("Unparameterized Constructor called");
    }



    Car(String name, int millage) {
        this.name = name;
        this.millage = millage;
    }

}

public class ConstructorTesting {

    public static void main(String[] args) {

        //  Non - Parameterized constructor
        // Car objA = new Car();

        //  Parameterized constructor
        Car objA = new Car("Pulsar", 34);
        System.out.println(" Name =  " + objA.name + " \nMillage = " + objA.millage);

    }

}
