
//  Abstract Class can contains everything abstruct method(MUST) , non-abstruct method ,  constructor , etc. 
/*
                         To access the abstract class, it must be inherited from another class.

       Abstract Class: is a RESTRICTED class object(Instances) cannot be created to access it, it must be INHERITED from another Class.
       Abstract Method: can only be used in an abstract class, and it DOES NOT have a body. The body is provided by the subclass (inherited from). 
 */
abstract class Bike {
    Bike() {
        System.out.println("==  Bike Created  ==");
    }

    abstract void run();

    void changeGear() {
        System.out.println("Gear changed");
    }
}

//Creating a Child class which inherits Abstract class  
class Honda extends Bike {

    Honda() {
        System.out.println("honda constructor called");
    }

    void run() {
        System.out.println("Running safely..");
    }
}

public class Abstraction {

    public static void main(String args[]) {
        Bike obj = new Honda(); // ParentClass obj = new ChildClass

        //  accessing the methods of the child class, if not present then access its Parent Class
        obj.run();
        obj.changeGear();
    }
}
