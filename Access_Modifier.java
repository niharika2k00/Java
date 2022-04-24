
class A {
    //     Private :  Can't possible to access from the Main fn., as its scope is RESTRICTED within the Class                     

    protected void log() {
        System.out.println("Log of Class-A");
    }
}

class Check {
    int a = 0, b = 0;
}

public class Access_Modifier {

    public static void main(String[] args) {
        // A obj = new A();
        // obj.log();

        Check c1 = new Check();
        Check c2 = new Check();

        c2 = c1;
        c1.a = 12;
        c2.b = 34;
        System.out.println(" c1.a = " + c1.a + " c1.b = " + c1.b + " c2.a = " + c2.a + " c2.b = " + c2.b);
    }
}
