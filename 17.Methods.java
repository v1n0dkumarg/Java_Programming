class Computer{
    public void playMusic(){
        System.out.println("Playing music...");
    }
    public String getMePen(int price){
        if(price>10){
            return "Pen is too expensive";
        }
        else{
            return "Enjoy your pen";
        }
    }
}
public class Methods{
    public static void main(String[] args){
        Computer obj=new Computer();
        obj.playMusic();
        String src=obj.getMePen(10);
        System.out.println(src);
    }
}