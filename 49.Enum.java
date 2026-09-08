enum Status{
    Running, Stopped, Waiting, Completed;
}
public class Enum{
    public static void main(String[] args){
        // Enum is a special data type that enables for a variable to be a set of predefined constants. The variable must be equal to one of the values that have been predefined for it. Common examples include compass directions (values of NORTH, SOUTH, EAST, and WEST) and the days of the week.
        // Enum is a special class that represents a group of constants (unchangeable variables, like final variables).
        // Enum can have constructors, methods and instance variables.
        // Enum can implement interfaces but cannot extend classes.
        // Enum can be used in switch statement.
        // Enum can be used in for-each loop.
        // Enum can be used in collections.
        // Enum can be used in serialization and deserialization.
        // Enum can be used in reflection.
        // Enum can be used in annotations.
        // Enum can be used in generics.
        // Enum can be used in streams.
        // Enum can be used in lambda expressions.
        // Enum can be used in functional interfaces.
        // Enum can be used in method references.
        int i=5;
        //Status s= Status.Running;
        Status[] ss=Status.values();
        System.out.println("Enum values are: " + ss);
        for(Status s:ss){
            System.out.println(s);
            System.out.println(s+ " : " + s.ordinal()); //ordinal() method returns the position of the enum constant in the enum declaration, where the initial constant is assigned an ordinal of zero.
        }
    }
}