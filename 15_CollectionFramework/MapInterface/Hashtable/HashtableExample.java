package CollectionFramwork.MapInterface.Hashtable;

import java.util.Hashtable;
import java.util.Map;

public class HashtableExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new Hashtable<>();
        map.put("Java", 1);
        map.put("Python", 2);
        map.put("C++", 3);

        System.out.println(map); // {Java=1, Python=2, C++=3}
    }
}
