// Anonymous inner class is a class that is defined without a name and is used to instantiate an object of that class. It is used to override the method of a class or interface. It is defined inside a method, constructor, or block.
class A{
    public void show(){
        System.out.println("This is A class");
    }
}
//class B extends A{
//    public void show(){
//        System.out.println("This is B class");
//    }
//}
public class Anonymous_Inner_class {
    public static void main(String[] args){
        A obj=new A(){
            public void show(){
                System.out.println("This is B class");
            }
        };
        obj.show();
    }
}