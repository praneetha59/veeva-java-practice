class Mobile{
    static String name;
    String brand;
    String price;

    public void  show(){
        System.out.println(brand+name+price);
    }
    static{
        name="Smartphone";
        System.out.println("in static block");
    }
    public Mobile(){
        brand="samsung";
        price="90k";
        System.out.println("in constructor");
    }
}

public class practicestaticvariable {
    public static void main(String args[]){
        Mobile mob1 = new Mobile();
        Mobile mob2=new Mobile();
        //Mobile.name= "iphone";
        //Mobile.name="Samsung";
        mob1.price="1lak";
        mob2.price="70k";
        //Mobile.name="phonee";
        mob1.show();
        mob2.show();

    }
}
//static is used when one copy shared by all variables
//to access static we need to use the className not the object name
//A static block executes when the class is initialized.
//Every object creation invokes the constructor.
//Constructors initialize an object's state when it is created.
// so when you use the static class directly then everything you used will get shared to throughout the object but you can aslo later chnage that