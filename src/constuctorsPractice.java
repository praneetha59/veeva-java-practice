//constuctorsPractice {
class Students {
    int age;
    String name;

    // Default (No-argument) constructor
    Students() {
        age = 20;
        name = "Teddy";
    }

    // Parameterized constructor
    Students(int a, String n) {
        age = a;
        name = n;
    }

    void display() {
        System.out.println(name + " " + age);
    }
}

public class constuctorsPractice  {
    public static void main(String[] args) {

        Students s1 = new Students();
        Students s2 = new Students(21, "Praneetha");

        s1.display();
        s2.display();
    }
}
//A constructor is a special member of a class that is automatically called whenever an object is created.
// It is mainly used to initialize objects.



//1. Constructor name: A constructor must have exactly the same name as its class.
//2. No return type: A constructor does not have any return type, not even void.
//3. Access modifiers: A constructor can use access modifiers such as public, private or protected.
//4. No explicit method call required: We don't need to call a constructor separately. It is automatically invoked when an object is created using the new keyword.
//5. Object creation: Every time a new object is created, its constructor is called.
//6. Purpose: It is mainly used to initialize instance variables.