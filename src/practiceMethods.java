class mobile{
    public void playmusic(){
        System.out.println("Music Playing");
    }

    public String installApp(int cost){
        if(cost==100){
            return "app installed";
        }else{
            return "denied";
        }
    }
}

public class practiceMethods {
    public static void main(String args[]){
        mobile mob=new mobile();
        mob.playmusic();
        String res= mob.installApp(200);
        System.out.println(res);
    }
}
