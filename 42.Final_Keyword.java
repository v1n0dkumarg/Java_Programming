//final = variable, method, class
// final variable = constant value
// final method = cannot be overridden
// final class = cannot be inherited
class Calc{
    public final void show(){
        System.out.println("This is Calc class");
    }
    public int add(int a, int b){
        System.out.println("This is add method of Calc class" + a+b);
    }
}
class Advanced extends Calc{
    public void show(){
        System.out.println("This is Advanced class");
    }
}
class Final_Keyword{
    public static void main(String[] args){
        Advanced a = new Advanced();
        a.show();
        a.add(10, 20);
    }
}