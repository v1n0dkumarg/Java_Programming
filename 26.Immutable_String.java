public class Immutable_String{
    public static void main(String[] args){
        String name="John";
        name=name+" Doe";
        System.out.println(name);

        String s1="Hello";
        String s2="Hello";
        System.out.println(s1==s2); // true, because both refer to the same string literal

        String s3=new String("Hello");
        System.out.println(s1==s3); // false, because s3 is a new object in memory
        System.out.println(s1.equals(s3)); // true, because the content
    }
}