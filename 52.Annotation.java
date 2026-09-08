@Deprecated
class A{
    void show() {
        System.out.println("In class A");
    }
}
class B extends A{
    @Override // This annotation indicates that the method is intended to override a method in a superclass. It helps catch errors at compile time if the method does not actually override a method in the superclass.
    void show() {
        System.out.println("In class B");
    }
}
public class Annotation {
    public static void main(String[] args){
        B obj=new B();
        obj.show();
    }
}