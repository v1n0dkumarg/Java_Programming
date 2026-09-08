class Calculator{
    public int add(int a, int b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
    public String add(String a){
        return a;
    }

}
class Method_Overloading{
    public static void main(String[] args){
        Calculator obj=new Calculator();
        int r1=obj.add(3,5);
        int r2=obj.add(4,2,1);
        String r3=obj.add("Hello");
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }
}