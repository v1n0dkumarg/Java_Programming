//what is happening in this program is that we are creating an abstract class Car which has two abstract methods drive() and fly() and one non-abstract method playmusic(). Then we are creating an abstract class WagonR which extends the Car class and provides implementation for the drive() method. Finally, we are creating a concrete class UpdateWagonR which extends the WagonR class and provides implementation for the fly() method. In the main method, we are creating an object of UpdateWagonR class and calling the drive() and playmusic() methods.
//what is use of abstract class is that it allows us to create a blueprint for other classes to follow. It allows us to define methods that must be implemented by the subclasses, while also allowing us to provide some default behavior. This promotes code reusability and helps in achieving abstraction in object-oriented programming.
abstract class Car{
    public abstract void drive();
    public abstract void fly();

    public void playmusic(){
        System.out.println("Playing music");
    }
}
abstract class WagonR extends Car{
    public void drive(){
        System.out.println("WagonR is driving");
    }
}
class UpdateWagonR extends WagonR{
    public void fly(){
        System.out.println("WagonR is flying");
    }
}

public class Abstract_Keyword {
    public static void main(String[] args){

        // Abstract class cannot be instantiated
        // Abstract class can have abstract and non-abstract methods
        // Abstract class can have constructors
        // Abstract class can have static methods
        // Abstract class can have final methods
        // Abstract class can have final variables
        // Abstract class can have static variables
        // Abstract class can have instance variables
        // Abstract class can have instance methods
        // Abstract class can have static blocks
        // Abstract class can have instance blocks
        // Abstract class can have inner classes
        // Abstract class can have inner interfaces
        // Abstract class can have inner enums
        // Abstract class can have inner annotations
        Car obj=new UpdateWagonR();
        obj.drive();
        obj.playmusic();
    }
}