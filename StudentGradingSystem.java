// Custom Exception
class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}

// Student Class
class Student {
    String name;
    int marks;

    // Constructor
    public Student(String name, int marks) throws InvalidMarksException {
        this.name = name;

        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Marks must be between 0 and 100.");
        }

        this.marks = marks;
    }

    // Method to assign grade
    public String assignGrade() {
        if (marks >= 90)
            return "A";
        else if (marks >= 75)
            return "B";
        else if (marks >= 60)
            return "C";
        else if (marks >= 40)
            return "D";
        else
            return "Fail";
    }
}

// Main Class
public class StudentGradingSystem {
    public static void main(String[] args) {
        try {
            Student s1 = new Student("Preethika", 85);
            System.out.println("Grade: " + s1.assignGrade());

            Student s2 = new Student("Rahul", 120);  // Invalid
            System.out.println("Grade: " + s2.assignGrade());

        } catch (InvalidMarksException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}


