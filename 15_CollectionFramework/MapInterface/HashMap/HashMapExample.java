import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Java", 1);
        map.put("Python", 2);
        map.put("C++", 3);
        map.put(null, 4); // Null key is allowed

        System.out.println(map); // {Java=1, Python=2, C++=3, null=4}
        System.out.println(map.get("Java")); // 1
    }
}