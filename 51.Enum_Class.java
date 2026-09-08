enum Laptop{
    DELL(50000), HP(60000), LENOVO(55000), ACER(45000);
    private int price;
private Laptop(){// this constructor is private and can only be accessed within the enum class
    price=500;
}
    private Laptop(int price){
        this.price=price;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price=price;
        System.out.println("in Laptop"+ this.name());
    }
}

public class Enum_Class {
    public static void main(String[] args){
        for(Laptop lap: Laptop.values()){
            System.out.println(lap + " " + lap.getPrice());
        }
    }
}