class Calculator{
    int add(int a, int b){
        return a+b;
    }
}
class Class_and_Object{
    public static void main(String[] args){
        int num1=8;
        int num2=6;
        Calculator cal=new Calculator();
        int result=cal.add(num1, num2);
        System.out.println(result);
    }
}