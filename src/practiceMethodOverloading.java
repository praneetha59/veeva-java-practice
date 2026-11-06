class Calci{
    public int addition(int n1,int n2){
        return n1+n2;
    }
    public int addition (int n1,int n2,int n3){
        return n1+n2+n3;
    }
    public double addition(int n1,double n2){
        return n1+n2;
    }
}


public class practiceMethodOverloading {
    public static void main(String[] args) {
        Calci obj=new Calci();
        obj.addition(1,2);
        obj.addition(4,2.3);
        obj.addition(1,5,4);
    }
}
