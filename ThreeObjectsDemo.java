class A {
    int x = 10;
}

class B {
    int y = 20;
}

public class ThreeObjectsDemo {

    int z = 30;

    public static void main(String[] args) {

        A obj1 = new A();
        B obj2 = new B();
        ThreeObjectsDemo obj3 = new ThreeObjectsDemo();

        System.out.println("x = " + obj1.x);
        System.out.println("y = " + obj2.y);
        System.out.println("z = " + obj3.z);
    }
}


