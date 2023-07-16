
// filename Main.java
class Grandparent {
    public void Print() {
        System.out.println("Grandparent's Print()");
    }
}

class Parent extends Grandparent {
    public void Print() {
        super.Print();
        System.out.println("Parent's Print()");
    }
}

class Child extends Parent {
    public void Print() {
        super.Print(); // calls its parent class
        System.out.println("Child's Print()");
    }
}

public class Inheritance_Chaining {
    public static void main(String[] args) {
        Child c = new Child();
        c.Print();
    }
}
