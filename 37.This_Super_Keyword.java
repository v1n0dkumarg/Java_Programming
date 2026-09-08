class A extends Object{
    int num=1;
}

class B extends A{
    int num=2; //instance variable
    public int getValue(){
        int num=3; // local variable
        //return this.num; //Get the num that belongs to the current object. which is 2 as instance variable of class B, if you just return num, it will return the local variable which is 3,do return num instead of this.num
        return super.num; // return the num that belongs to the parent class A, which is 1
    }
}
public class This_Super_Keyword {
    public static void main(String[] args){
        B obj=new B();
        System.out.println(obj.getValue());
    }
}