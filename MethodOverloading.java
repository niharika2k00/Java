
public class MethodOverloading {
    public static void main(String[] args) {

        A objA = new A();
        objA.Laptop("1 TB", 256);
        objA.Laptop(4, 180);
    }
}

class A {
    public void Laptop(int ram, int ssd) {
        System.out.println("Laptop Congfig =>   RAM : " + ram + " ,  SSD : " + ssd);
    }

    public void Laptop(String hdd, int ssd) {
        System.out.println("Laptop Congfig =>   HDD : " + hdd + " ,  SSD : " + ssd);
    }
}

/* 
      Method Overloading  OR  Compile Time Polymorphism 
                   --  Function/Method with SAME NAME but different parameters and data types
*/