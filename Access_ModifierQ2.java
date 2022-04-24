
class A {
    public A() {}

    //  PRIVATE method CANNOT be accessible from other class. But PROTECTED , FINAL , PUBLIC can be accessible.
    private void display() {
        System.out.println("In display of A");
    }
}

class B extends A {

    public B() {}

    protected void display() {
        System.out.println("In display of B");
    }
}

public class Access_ModifierQ2 {
    public static void main(String[] args) {

        B b = new B();
        b.display();
    }
}
