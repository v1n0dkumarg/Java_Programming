class Human{
    private int age;
    private String name;
    public void SetAge(int a){
        age=a;
    }
    public void SetName(String s){
        name=s;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
}
public class Encapsulation{
    public static void main(String[] args){
        Human h1=new Human();
        h1.SetAge(25);
        h1.SetName("John");

        System.out.println("Name: "+ h1.getName() + " Age: "+ h1.getAge());
    }
}