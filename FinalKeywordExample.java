
final class FinalClassDemo {

    
    final int MAX = 100;

    final void display() {
        System.out.println("Final variable value: " + MAX);
        System.out.println("This is a final method");
    }
}

public class FinalKeywordExample {
    public static void main(String[] args) {

        
        FinalClassDemo obj = new FinalClassDemo();

        
        obj.display();
    }
}

