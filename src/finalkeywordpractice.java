// final class cannot be inherited
class Praneetha {
    // final variable: value cannot be changed
    final int age = 21;
    // final method: cannot be overridden
    final void showAge() {
        System.out.println("Age: " + age);
    }
    void display() {
        System.out.println("Hello Praneetha");
    }
}
// Normal child class
class Stud extends Praneetha {
    // Cannot override showAge() because it is final
    void study() {
        System.out.println("Student is studying");
    }
}
public class finalkeywordpractice {
    public static void main(String[] args) {
        Stud obj = new Stud();
        // Accessing final variable
        System.out.println(obj.age);
        // Calling final method
        obj.showAge();
        // Calling normal inherited method
        obj.display();
        // Calling child class method
        obj.study();
        // obj.age = 22;  // ERROR: final variable cannot be changed
    }
}