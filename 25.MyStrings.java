public class MyStrings{
    public static void main(String[] args){
        String name=new String("John");
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.charAt(0));
        System.out.println(name.indexOf("o"));
        System.out.println(name.substring(1,4));
        System.out.println(name.hashCode());
    }
}