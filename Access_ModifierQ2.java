
class A {
    public A() {}

    private void display() {
        System.out.println("In display of A");
    }
}

class B extends A {

    public B() {}

    public void display() {
        System.out.println("In display of B");
    }
}

public class Access_ModifierQ2 {
    public static void main(String[] args) {

        B b = new B();
        b.display();
    }
}
