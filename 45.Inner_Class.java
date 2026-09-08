//use of inner class is that it allows us to logically group classes that are only used in one place, which increases encapsulation. It also allows us to access the members of the outer class, even if they are private. This can be useful for creating helper classes that are only relevant to the outer class.
class A{
    int age;
    public void show(){
        System.out.println("This is A class");
    }
    static class B{
        public void config(){
            System.out.println("This is B class");
        }
    }
}

public class Inner_Class {
    public static void main(String[] args){
        A obj=new A();
        obj.show();

        A.B obj1=new A.B(); // Inner class object creation
        obj1.config();
    }
}