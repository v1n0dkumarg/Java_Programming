import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Demo {
    public static void main(String[] args){
 //Collection is an interface and ArrayList is a class that implements Collection interface
//    	Collection<Integer> nums= new ArrayList<Integer>();
//  	Collection nums=new ArrayList();
        //List is an interface and ArrayList is a class that implements List interface
        //ArrayList is a resizable array implementation of the List interface. It implements all optional list operations, and permits all elements, including null. In addition to implementing the List interface, this class provides methods to manipulate the size of the array that is used internally to store the list. (This class is roughly equivalent to Vector, except that it is unsynchronized.)
        //Interface is a collection of abstract methods and constants. It is a blueprint of a class. It is used to achieve abstraction and multiple inheritance in Java. It is a reference type, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types. Interfaces cannot contain instance fields. The only fields that can appear in an interface must be declared both static and final.
        //why used List for ArrayList is that List is an interface and ArrayList is a class that implements List interface. So, we can use List to refer to ArrayList object. It is a good practice to use interface type reference variable to refer to the object of the class that implements the interface. It is also known as programming to an interface. It allows us to change the implementation class without changing the code that uses the interface.
        List<Integer> nums=new ArrayList<Integer>();
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);
        //nums.add("5");

        System.out.println(nums.get(2));

        System.out.println(nums.indexOf(2));

//    	for(int n:nums)
//    	{
//    		System.out.println(nums);
//    	}
        for(Object n:nums)
        {
            int num=(Integer)n;
            System.out.println(num);
        }
    }
}

