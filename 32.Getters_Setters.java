class Human{
    private int age;
    private String name;
//here this is used to refer the current object of the class. It is used to differentiate between the instance variable and the local variable when they have the same name.
    public void setAge(int age){
        this.age=age;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
}
class Getters_Setters{
    public static void main(String[] args){
        Human h1= new Human();
        h1.setAge(25);
        h1.setName("Mahesh");
        System.out.println("Name: "+h1.getName() + " Age: " + h1.getAge());
    }
}