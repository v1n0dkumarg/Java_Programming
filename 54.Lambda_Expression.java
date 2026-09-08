@FunctionalInterface
interface A{
    void show(int i);
}
public class Lambda_Expression {
    public static void main(String[] args) {
        // Lambda expression is a feature of Java 8 that allows us to write anonymous methods. It is used to provide the implementation of a functional interface. A functional interface is an interface that has only one abstract method.
        // Syntax: (parameters) -> expression
        // Example: (int a, int b) -> a + b
        // Example: () -> System.out.println("Hello World")
        // Example: (int a) -> { return a * a; }
        // Example: (int a, int b) -> { return a + b; }
        // Example: (String s) -> { System.out.println(s); }
        // Example: () -> { System.out.println("Hello World"); }
        // Example: (int a, int b) -> { return a > b ? a : b; }
        // Example: (int a, int b) -> { return a < b ? a : b; }
        // Example: (int a, int b) -> { return a == b ? true : false; }
        // Example: (int a, int b) -> { return a != b ? true : false; }
        // Example: (int a, int b) -> { return a >= b ? true : false; }
        // Example: (int a, int b) -> { return a <= b ? true : false; }
//        A obj=new A(){
//        public void show(int i) {
//            System.out.println("This is B class" + i);
//        }
//        };
//        obj.show(10);
        A obj=(int i) -> System.out.println("This is B class" + i);
        obj.show(10);
    }
}