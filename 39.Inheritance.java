class Calc{
    public int add(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
}
class AdvCalc extends Calc{
    public int mul(int a, int b){
        return a*b;
    }
    public int div(int a, int b){
        return a/b;
    }
}

public class Inheritance{
    public static void main(String[] args){
        AdvCalc obj=new AdvCalc();
        int r1=obj.add(5,3);
        int r2=obj.sub(5,3);
        int r3=obj.mul(5,3);
        int r4=obj.div(5,3);
        System.out.println("Addition: " + r1);
        System.out.println("Subtraction: " + r2);
        System.out.println("Multiplication: " + r3);
        System.out.println("Division: " + r4);
    }
}