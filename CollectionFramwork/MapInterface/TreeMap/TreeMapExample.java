package CollectionFramwork.MapInterface.TreeMap;

import java.util.TreeMap;
import java.util.Map;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        map.put("Java", 1);
        map.put("Python", 2);
        map.put("C++", 3);

        System.out.println(map); // {C++=3, Java=1, Python=2} (sorted order)
    }
}