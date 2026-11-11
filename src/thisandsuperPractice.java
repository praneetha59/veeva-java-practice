class A{
    public  A(){
        super();
        System.out.println("in a");
    }
    public A(int y){
        System.out.println("int a");
    }
}
class B extends A{
    public B(){

        System.out.println("in b");
    }
    public B(int x){
        this();
        System.out.println("int b");
    }
}

public class thisandsuperPractice {
    public static void main(String[] args) {
        B obj=new B(4);

    }
}

//this() → Calls another constructor in the same class.
//super() → Calls a constructor in the parent class.
