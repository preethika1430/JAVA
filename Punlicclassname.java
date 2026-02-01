
class Parent {
    int x = 10;

    Parent() {
        System.out.println("Parent class constructor");
    }

    void display() {
        System.out.println("Parent class display method");
    }
}


class Child extends Parent {
    int x = 20;

    Child() {
        
        super();
        System.out.println("Child class constructor");
    }

    void show() {
        int x = 30;

        
        System.out.println("Local x = " + x);
        System.out.println("Child class x using this = " + this.x);

        
        System.out.println("Parent class x using super = " + super.x);

   
        super.display();
    }
}


public class Main {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
    }
}
