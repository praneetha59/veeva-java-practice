class Human{
    private int age;
    private String name;
    public void setAge(int n){
        age=n;
    }
    public void setName(String s){
        name=s;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
}


public class encapsulationpractice {
    public static void main(String[] args) {
        Human hum=new Human();
        //hum.age=11;
        //hum.name="Teddy";
        //System.out.println(hum.age+" "+hum.name);
        hum.setAge(21);
        hum.setName("Praneetha");
        System.out.println(hum.getName()+" "+hum.getAge());
    }
}
// private:
// Used to restrict direct access to variables from outside the class.
// They can only be accessed directly within the same class.

// We cannot access hum.age or hum.name directly
// because they are private.
// Instead, we use setters and getters to access them.

// This process of protecting data using private variables
// and providing access through public methods is called ENCAPSULATION.

// setAge() and setName():
// Public setter methods used to modify private variables.

// getAge() and getName():
// Public getter methods used to retrieve private variables.