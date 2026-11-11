
abstract class Animals {
    abstract void sound();
}

class Dogs extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class abstractClassPractice {
    public static void main(String[] args) {
        Dogs d = new Dogs();
        d.sound();
    }
}