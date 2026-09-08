import java.util.Arrays;
import java.util.List;
public class forEach_Method {
    public static void main(String[] args){
        List<Integer> nums=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        // Using Stream API to filter even numbers and print them
        nums.forEach(n-> System.out.println(n));
        int sum=0;
        for(int n:nums){
            if(n%2==0){
                sum+=n;
            }
        }
        System.out.println("Sum of even numbers: " + sum);
    }
}