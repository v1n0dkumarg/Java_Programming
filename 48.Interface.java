////interface is a collection of abstract methods. A class implements an interface, thereby inheriting the abstract methods of the interface.
//abstract class Computer{
//    public abstract void code();
//}
//
//class Laptop extends Computer{
//    public void code(){
//        System.out.println("Coding on Laptop");
//    }
//}
//class Desktop extends Computer {
//    public void code() {
//        System.out.println("Coding on Desktop");
//    }
//}
//
//class Developer{
//    public void devApp(Computer lap){
//        lap.code();
//    }
//}
//public class Interface {
//    public static void main(String[] args){
//        // Interface cannot be instantiated
//        // Interface can have abstract and non-abstract methods
//        // Interface can have static methods
//        // Interface can have final methods
//        // Interface can have final variables
//        // Interface can have static variables
//        // Interface can have instance variables
//        // Interface can have instance methods
//        // Interface can have static blocks
//        // Interface can have instance blocks
//        // Interface can have inner classes
//        // Interface can have inner interfaces
//        // Interface can have inner enums
//        // Interface can have inner annotations
////        Laptop lap = new Laptop();
////        Desktop desk=new Desktop();
//        Computer lap= new Laptop();
//        Computer desk=new Desktop();
//        Developer dev=new Developer();
//        dev.devApp(lap);
//
//    }
//}

//interface Computer{
//    void code();
//}
//class laptop implements Computer{
//    public void code(){
//        System.out.println("Coding on Laptop");
//    }
//}
//class Desktop implements Computer{
//    public void code(){
//        System.out.println("Coding on Desktop");
//    }
//}
//class Developer{
//    public void devApp(Computer lap){
//        lap.code();
//    }
//}
//public class Interface{
//    public static void main(String[] args){
//        Computer lap=new laptop();
//        Computer desk=new Desktop();
//        Developer dev=new Developer();
//        dev.devApp(lap);
//    }
//}
interface A{
    int age =44; //final and static by default
    String area="Mumbai"; //final and static by default
    void show(); //abstract by default
    void config(); //abstract by default
}
class B implements A{
    public void show(){
        System.out.println("This is B class");
    }
    public void config(){
        System.out.println("This is B class config");
    }
}
public class Interface{
    public static void main(String[] args){
        A obj;
        obj=new B();
        obj.show();
        obj.config();

        System.out.println(A.area);
    }
}