class Mobile{
    String brand;
    int price;
    static String name = "smartphone";

    void show(){
        System.out.println("Brand: "+brand + ", Price: "+price + ", Name: "+name);
    }
}
public class Static_Variable{
    public static void main(String[] args){
        Mobile mb1=new Mobile();
        mb1.brand="Apple";
        mb1.price=1000;
        //mb1.name="iPhone 13";
        //Mobile.name="iPhone 13";
        mb1.show();

        Mobile mb2=new Mobile();
        mb2.brand="Samsung";
        mb2.price=800;
        //mb2.name="Galaxy S21";
       // Mobile.name="Galaxy S21";
        mb2.show();
    }
}