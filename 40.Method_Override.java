//method overriding is a feature that allows a subclass to provide a specific implementation of a method that is already defined in its superclass. The method in the subclass must have the same name, return type, and parameters as the method in the superclass. This allows the subclass to modify or extend the behavior of the method inherited from the superclass.
class Calculator{
    public int add(int n1, int n2){
        return n1+n2;
    }
}

class AdvCalculator extends Calculator{
    public int add(int n1, int n2){
        return n1+n2+10;
    }
}
public class Method_Override {
    public static void main(String[] args){
        AdvCalculator obj=new AdvCalculator();
        int r1=obj.add(3,5);
        System.out.println(r1);
    }
}