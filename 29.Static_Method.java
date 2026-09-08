class Mobile{
    String brand;
    int price;
    static String name="Smartphone";

    void show(){
        System.out.println("Brand: "+brand);
        System.out.println("Price: "+price);
        System.out.println("Name: "+name);
    }
    public static void display(Mobile obj){
        System.out.println("Brand: "+obj.brand);
        System.out.println("Price: "+obj.price);
        System.out.println("Name: "+name);
    }
}
public class Static_Method{
    public static void main(String[] args){
        Mobile obj1=new Mobile();
        obj1.brand="Samsung";
        obj1.price=20000;
        //Mobile.name="Galaxy";

        Mobile obj2=new Mobile();
        obj2.brand="Apple";
        obj2.price=50000;
        //Mobile.name="Iphone";

        //obj1.show();
        //obj2.show();
        Mobile.display(obj1);
    }
}