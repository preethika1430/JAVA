class Student3 {

    static String collegeName = "ABC Engineering College";

    String name;
    int rollNo;

    
    Student3(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void display() {
        System.out.println("Student Name  : " + name);
        System.out.println("Roll Number   : " + rollNo);
        System.out.println("College Name  : " + collegeName);
    }

    
    public static void main(String[] args) {
        Student3 s1 = new Student3("Preethika", 143);
        s1.display();
    }
}
