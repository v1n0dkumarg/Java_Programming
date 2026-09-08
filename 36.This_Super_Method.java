class A{
    public A(){
        super();
        System.out.println("I am A's constructor");
    }
    public A(int x){
        super(); // calling Object class constructor
        System.out.println("I am A's parameterized constructor with value: "+x);
    }
}

class B extends A{
    public B(){
        super(); // Call the parent class constructor (A).
        System.out.println("I am B's constructor");
    }
    public B(int x){
        this(); // Call another constructor of the same class (B).
        System.out.println("I am B's parameterized constructor with value: ");
    }
}
public class This_Super_Method{
    public static void main(String[] args){
        B obj=new B(5);
    }
}