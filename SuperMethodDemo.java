class Parent {
    void show() {
        System.out.println("This method is from Parent class");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("This method is from Child class");
    }

    void display() {
        super.show();   // calling Parent class method
    }
}

public class SuperMethodDemo {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}









