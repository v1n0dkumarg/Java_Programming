class A{
    void show(){
        System.out.println("In A");
    }
}
class B extends A{
    void show(){
        System.out.println("In B");
    }
}
class C extends B{
    void show(){
        System.out.println("In C");
    }
}
public class Dynamic_Method_Dispatch{
    public static void main(String[] args){
        A obj=new A();
        obj.show();

        obj=new B();
        obj.show();

        obj=new C();
        obj.show();
    }
}