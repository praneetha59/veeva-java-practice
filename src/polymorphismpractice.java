class Calculator {

     // Compile-time polymorphism (Method Overloading)

     int add(int a, int b) {
         return a + b;
     }

     int add(int a, int b, int c) {
         return a + b + c;
     }
 }

 class Animal {

     void sound() {
         System.out.println("Animal makes sound");
     }
 }

// Runtime polymorphism (Method Overriding)

 class Dog extends Animal {

     @Override
     void sound() {
         System.out.println("Dog barks");
     }
 }

 class Cat extends Animal {

     @Override
     void sound() {
         System.out.println("Cat meows");
     }
 }

 public class polymorphismpractice  {

     public static void main(String[] args) {

         // Method Overloading
         Calculator c = new Calculator();

         System.out.println(c.add(10, 20));
         System.out.println(c.add(10, 20, 30));

         // Method Overriding
         Animal a;

         a = new Dog();
         a.sound();

         a = new Cat();
         a.sound();
     }
 }


// POLYMORPHISM:
// One thing having many forms.

// 1. Compile-time polymorphism:
// Achieved through method overloading.
// Same method name with different parameters.

// 2. Runtime polymorphism:
// Achieved through method overriding.
// Child class provides its own implementation
// of the parent class method.


//Parent class reference: Animal a
//Child class objects: new Dog() and new Cat().
//Both child classes have their own implementation of sound().
//Java decides which overridden method to execute at runtime based on the actual object.