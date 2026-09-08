//Wrapper classes are used to convert primitive data types into objects. Each primitive data type has a corresponding wrapper class in Java. For example, the primitive data type int has a corresponding wrapper class Integer, and the primitive data type double has a corresponding wrapper class Double.
//Wrapper classes are useful when we need to work with objects instead of primitive data types. For example, we can use wrapper classes to store primitive data types in collections such as ArrayList, HashMap, etc. Wrapper classes also provide utility methods for converting between primitive data types and their corresponding wrapper classes. For example, we can use the Integer.parseInt() method to convert a String to an int, and we can use the Integer.toString() method to convert an int to a String.
//int -> Integer
//double -> Double
//char -> Character
//boolean -> Boolean
//byte -> Byte
//short -> Short
//long -> Long
//float -> Float
public class WrapperClass {
    public static void main(String[] args){
        int num=7;
        Integer num1=new Integer(num); //boxing
        Integer num2=num; //autoboxing
        System.out.println("num1: "+num1);
        System.out.println("num2: "+num2);

        int num3=num2.intValue(); //unboxing
        int num4=num2; //autounboxing
        System.out.println("num3: "+num3);
        System.out.println("num4: "+num4);

        String str="123";
        int num5=Integer.parseInt(str); //convert String to int
        System.out.println("num5: "+num5);
    }
}