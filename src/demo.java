class Caluclators{
    int n1;
    int n2;
    public int adds(int n1, int n2){
        int r=n1+n2;
        return r;
    }
}

public class demo {
    public static void main(String args[]){
        int num1=4;
        int num2=4;
        Caluclators cals=new Caluclators();
        int result = cals.adds(num1,num2);
        System.out.println(result);
    }
}
