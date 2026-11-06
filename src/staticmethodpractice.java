class Student {

    // Static variable
    static String college = "Aditya University";

    // Non-static variables
    String name;
    int age;

    // Static method
    static void collegeDetails() {
        System.out.println(college);

        // System.out.println(name); // ERROR
        // System.out.println(age);  // ERROR
    }

    // Non-static method
    void studentDetails() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(college);
    }
}

public class staticmethodpractice {
    public static void main(String args[]) {

        // Calling static method using class name
        Student.collegeDetails();

        // Creating objects
        Student s1 = new Student();
        Student s2 = new Student();

        // Assigning non-static variables
        s1.name = "Praneetha";
        s1.age = 20;

        s2.name = "Sadhvi";
        s2.age = 21;

        // Calling non-static methods using objects
        s1.studentDetails();
        s2.studentDetails();
    }
}
//for static method no object required and for non static its vice versa