class Calculator{
    int num=5;
    public int add(int n1, int n2){
        System.out.println(num);
        return n1+n2;
    }
}
public class Stack_Heap{
    public static void main(String[] args){
        int n=10; // Stack memory
        Calculator obj=new Calculator();
        Calculator obj2=new Calculator();
        int r1=obj.add(3,5); // Heap memory
        obj.num=8;
        System.out.println("obj.num: " + obj.num);
        System.out.println("obj2.num: " + obj2.num);
    }
}