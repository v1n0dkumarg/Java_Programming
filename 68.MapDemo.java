import java.util.Hashtable;
import java.util.Map;
public class MapDemo{
    public static void main(String[] args){
        Map<String, Integer> students=new Hashtable<>();
        students.put("John", 20);
        students.put("Alice", 22);
        students.put("Bob", 19);
        System.out.println("Students: "+students);
        System.out.println(students.keySet());
        System.out.println(students.values());

        for(String key: students.keySet()){
            System.out.println(key +" is "+ students.get(key));
        }
    }
}