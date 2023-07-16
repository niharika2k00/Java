public class Method_Overridding {
    public static void main(String[] args) {
        classB objfirst = new classB();
        objfirst.LaptopConfig("1 TB", 256);

        classA objsec = new classC();
    }
}

class classA {
    classA() {
        System.out.println("constructor of classA");
    }

    public void LaptopConfig(String hdd, int ssd) {
        System.out.println("LaptopConfig Congfig in ClassA =>   HDD : " + hdd + " ,  SSD : " + ssd);
    }
}

class classB extends classA {
    classB() {
        System.out.println("constructor of classB");
    }

    public void LaptopConfig(String hdd, int ssd) {
        System.out.println("LaptopConfig Congfig in ClassB =>   HDD : " + hdd + " ,  SSD : " + ssd);
    }
}

class classC extends classB {
    classC() {
        System.out.println("constructor of classC");
    }

    public void LaptopConfig(String hdd, int ssd) {
        System.out.println("LaptopConfig Congfig in classC =>   HDD : " + hdd + " ,  SSD : " + ssd);
    }
}