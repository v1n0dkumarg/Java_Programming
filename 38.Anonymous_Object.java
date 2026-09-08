//Anonymous object = an object created without assigning it to a reference variable, usually when it is needed only once.
class A{
    public A(){
        System.out.println("Constructor of class A is called, Object is created");
    }
    public void show(){
        System.out.println("show() method of class A is called");
    }
}
public class Anonymous_Object {
    public static void main(String[] args){
        int marks;
        marks=99;

        //new A(); //Anonymous object of class A is created
        new A().show(); //Anonymous object of class A is created and show() method is called


    }
}