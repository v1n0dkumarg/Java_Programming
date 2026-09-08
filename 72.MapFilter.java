import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;
public class MapFilter{
    public static void main(String[] args){
        List<Integer> nums=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        //parallelStream() is used to process the stream in parallel, which can improve performance for large datasets.
        Stream<Integer> sortedValues=nums.parallelStream()
                .filter(n->n%2==0)
               // .map(n->n*n)
                .sorted();
        sortedValues.forEach(n->System.out.println(n));
    }
}