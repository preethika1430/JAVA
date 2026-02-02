class Parent1 {
    final void display() {
        System.out.println("Final method in parent class");
    }
}

class Child extends Parent1 {
}

public class FinalMethodExample {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}

