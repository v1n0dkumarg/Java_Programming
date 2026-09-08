class A{
    public void show(){
        System.out.println("A's show() method");
    }
}
class B extends A{
    public void show1(){
        System.out.println("B's show() method");
    }
}
public class Upcasting_Downcasting{
    public static void main(String[] args){
//        Child -> Parent  = Upcasting   ✅ Automatic
//        Parent -> Child  = Downcasting ✅ Explicit cast required
        // Upcasting
//        Animal a = new Dog(); // Upcasting
//        a.eat(); // Dog's eat() method will be called

        // Downcasting
//        Dog d = (Dog) a; // Downcasting
//        d.bark(); // Dog's bark() method will be called
//        double d=4.5;
//        int i=(int)d;
//        System.out.println(i);
//
//        A obj=new A();
//        A obj=(A) new B(); // Upcasting
//        obj.show(); // B's show() method will be called

        A obj=new B();
        obj.show();

        B obj1=(B) obj;
        obj1.show1();
    }
}