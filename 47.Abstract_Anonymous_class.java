abstract class A{
    public abstract void show();
    public abstract void config();
}
public class Abstract_Anonymous_class {
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

A obj=new A(){
public void show(){
System.out.println("This is B class");
}
public void config(){
System.out.println("This is B class config");
}
};
    obj.show();
    obj.config();
    }
}