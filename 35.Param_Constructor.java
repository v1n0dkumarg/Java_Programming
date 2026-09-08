//parameterized constructor
class Human{
    private int age;
    private String name;
    public Human(){
        age=0;
        name="Unknown";
    }
    public Human(String name){
        this.name=name;
    }
    public Human(int age,String name){
        this.age=age;
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
}
class Param_Constructor{
    public static void main(String[] args){
        Human obj=new Human();
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }
}