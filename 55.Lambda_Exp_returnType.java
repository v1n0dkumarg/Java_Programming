@FunctionalInterface
interface A{
    int add(int i, int j);
}
public class Lambda_Exp_returnType {
    public static void main(String[] args){
        A obj=(int i, int j) -> i+j;
        System.out.println(obj.add(10,20));
    }
}