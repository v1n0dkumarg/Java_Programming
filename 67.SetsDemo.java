import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
public class SetsDemo{
    public static void main(String[] args){
        //Set is a collection that contains no duplicate elements. It models the mathematical set abstraction. The Set interface contains only methods inherited from Collection and adds the restriction that duplicate elements are prohibited.
        //HashSet is a class that implements the Set interface. It is backed by a hash table (actually a HashMap instance). It makes no guarantees as to the iteration order of the set; in particular, it does not guarantee that the order will remain constant over time. This class permits the null element.
        //Set<Integer> nums=new HashSet<Integer>();
        //TreeSet is a class that implements the Set interface. It is backed by a TreeMap instance. It makes no guarantees as to the iteration order of the set; in particular, it does not guarantee that the order will remain constant over time. This class does not permit the null element.
        //Set<Integer> nums=new TreeSet<Integer>();

        Collection<Integer> nums=new TreeSet<Integer>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(50);

        Iterator<Integer> values=nums.iterator();
        while(values.hasNext()){
            System.out.println(values.next());
        }

    }
}