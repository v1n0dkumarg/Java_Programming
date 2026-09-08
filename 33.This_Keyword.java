class Human{
    private int age;
    private String name;
    public void setAge(int age, Human obj){
        Human obj2=obj;
        obj2.age=age;
        //this. means here Human obj2=obj; obj2
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name=name;
}
    public String getName(){
        return name;
    }
}
public class This_Keyword{
    public static void main(String[] args){
        Human obj=new Human();
        obj.setName("John");
        obj.setAge(25, obj);

        System.out.println("Name: "+obj.getName());
        System.out.println("Age: "+obj.getAge());
    }
}