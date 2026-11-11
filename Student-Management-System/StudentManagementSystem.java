
abstract class OOPStudent {

    // ENCAPSULATION: Private variables
    private int id;
    private String name;
    private double marks;

    // STATIC variable
    static int studentCount = 0;

    // FINAL variable
    final String collegeName = "Veeva University";

    // CONSTRUCTOR
    OOPStudent(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        studentCount++;
    }

    // GETTERS
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    // SETTER
    public void setMarks(double marks) {
        this.marks = marks;
    }

    // METHOD OVERLOADING
    public void display() {
        System.out.println("Name: " + name);
    }

    public void display(boolean showMarks) {
        System.out.println("Name: " + name);

        if (showMarks) {
            System.out.println("Marks: " + marks);
        }
    }

    // ABSTRACT METHOD
    abstract void calculateGrade();
}

// INHERITANCE
class EngineeringOOPStudent extends OOPStudent {

    EngineeringOOPStudent(int id, String name, double marks) {
        super(id, name, marks);
    }

    // METHOD OVERRIDING
    @Override
    void calculateGrade() {
        if (getMarks() >= 90) {
            System.out.println("Grade: A");
        } else if (getMarks() >= 75) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: C");
        }
    }
}

// INHERITANCE
class ScienceOOPStudent extends OOPStudent {

    ScienceOOPStudent(int id, String name, double marks) {
        super(id, name, marks);
    }

    // METHOD OVERRIDING
    @Override
    void calculateGrade() {
        if (getMarks() >= 85) {
            System.out.println("Grade: A");
        } else if (getMarks() >= 70) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: C");
        }
    }
}

// MAIN CLASS
public class StudentManagementSystem {

    public static void main(String[] args) {

        // Creating child class objects
        EngineeringOOPStudent s1 =
                new EngineeringOOPStudent(101, "Praneetha", 95);

        ScienceOOPStudent s2 =
                new ScienceOOPStudent(102, "Meghana", 80);

        // RUNTIME POLYMORPHISM
        OOPStudent[] students = {s1, s2};

        System.out.println("===== STUDENT DETAILS =====");

        for (OOPStudent s : students) {

            System.out.println("\nID: " + s.getId());

            s.display(true);

            // Calling overridden method
            s.calculateGrade();
        }

        // STATIC VARIABLE
        System.out.println("\nTotal Students: "
                + OOPStudent.studentCount);

        // FINAL VARIABLE
        System.out.println("College: "
                + s1.collegeName);
    }
}
