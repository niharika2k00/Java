
/* public class test {

    test() {
        this(0); // calls the constructor with ONE PARAMETER.
        System.out.println("constructor without parameters");
    }

    test(int x) {
        this(0, 0);
        System.out.println("constructor with 1 parameter");
    }

    test(int x, int y) {
        System.out.println("constructor with 2 parameters");
    }

    public static void main(String[] args) {
        test obj = new test();
    }
} */

class ParentTest {
    public static void foo() {
        System.out.println("I am foo of the SUPER CLASS\n");
    }

    public void bar() {
        System.out.println("I am bar of the SUPER CLASS\n");
    }

}

class test extends ParentTest {

    public static void foo() {
        System.out.println("I am foo of the CHILD CLASS\n");
    }

    public void bar() {
        System.out.println("I am bar of the CHILD CLASS\n");
    }

    public static void main(String[] args) {

        ParentTest par = new test(); // obj par of the Parent Class
        test t = new test();

        par.foo();
        par.bar();

        t.foo();
        t.bar();
    }

}
