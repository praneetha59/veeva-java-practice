
class Humans {
    private int age;
    private String name;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println(this.name + " " + this.age);
    }
}

public class thisKeywordPractice{
    public static void main(String[] args) {

        Humans h = new Humans();

        h.setAge(21);
        h.setName("Praneetha");

        h.display();
    }
}
// To differentiate instance variables from local variables
// when both have the same name.

// this keyword:
// Refers to the current object.
