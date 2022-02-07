
public class MethodOverridding {
    public static void main(String[] args) {
        B objA = new B();
        objA.Laptop("1 TB", 256);
    }
}


class A {
    public void Laptop(String hdd, int ssd) {
        System.out.println("Laptop Congfig in ClassA =>   HDD : " + hdd + " ,  SSD : " + ssd);
    }
}


class B extends A {
    public void Laptop(String hdd, int ssd) {
        System.out.println("Laptop Congfig in ClassB =>   HDD : " + hdd + " ,  SSD : " + ssd);
    }
}
/* 
      Method Overriding  OR  RunTime Time Polymorphism 
                   --  Subclass (child class) has the same method as declared in the parent class
*/