@FunctionalInterface
interface A {
    void show();
}
public class Fun_Interface {
    public static void main(String[] args){
        // Functional interface is an interface that has only one abstract method
        // It can have multiple default and static methods
        // It can be used as a lambda expression
        // It can be used as a method reference
        // It can be used as a constructor reference
        // It can be used as a functional interface
        // It can be used as a functional interface in a stream
        // It can be used as a functional interface in a collection
        // It can be used as a functional interface in a map
        // It can be used as a functional interface in a set
        A obj=new A(){
        public void show(){
                System.out.println("This is B class");
            }
        };
    obj.show();
    }
}