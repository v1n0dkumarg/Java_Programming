import java.util.*;
import java.util.stream.*;
public class StreamAPI{
    public static void main(String[] args){
        List<Integer> nums=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        // Using Stream API to filter even numbers and print them
//Stream API is a new feature in Java 8 that allows us to process collections of objects in a functional style. It provides a way to perform operations on a sequence of elements, such as filtering, mapping, and reducing. The Stream API is designed to be used with lambda expressions and method references, making it easier to write concise and readable code.
        Stream<Integer> s1=nums.stream();
        Stream<Integer> s2=s1.filter(n->n%2==0);
        Stream<Integer> s3=s2.map(n->n*2);
        s3.forEach(n->System.out.println(n));

        int result=nums.stream()
                .filter(n->n%2==0)
                .map(n->n*2)
                //reduce method takes two parameters, the first is the initial value and the second is a BinaryOperator that takes two arguments and returns a single value. In this case, we are using a lambda expression to add the two arguments.
                .reduce(0,(c,e)->c+e);
        System.out.println("Sum of double of even numbers: "+result);
    }
}