
class A {
    //     Private :  Can't possible to access from the Main fn., as its scope is RESTRICTED within the Class                     

    protected void log() {
        System.out.println("Log of Class-A");
    }
}

public class Access_Modifier {

    public static void main(String[] args) {
        A obj = new A();
        obj.log();
    }

}
