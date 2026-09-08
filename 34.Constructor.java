class Human{
    private int age;
    private String name;
    //constructor is a special method that is called when an object is created. It has the same name as the class and does not have a return type.
    public Human(){ // default constructor
        age=90;
        name="Default Name";
        System.out.println("Constructor called");
    }
    public void SetAge(int age){
        this.age=age;
    }
    public int GetAge(){
        return age;
    }
    public void SetName(String name){
        this.name=name;
    }
    public String GetName(){
        return name;
    }
}
public class Constructor{
    public static void main(String[] args){
        Human obj=new Human();
        System.out.println("Name: "+obj.GetName());
        System.out.println("Age: "+obj.GetAge());
        obj.SetAge(25);
        obj.SetName("John");
        System.out.println("Name: "+obj.GetName());
        System.out.println("Age: "+obj.GetAge());
    }
}