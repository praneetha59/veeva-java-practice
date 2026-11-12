   interface Animal {
       void sound();
   }

   class Dog implements Animal {
       public void sound() {
           System.out.println("Dog barks");
       }
   }

   public class InterfaceBasic {
       public static void main(String[] args) {
           Animal a = new Dog();   // interface reference, class object
           a.sound();
       }
   }
