package CollectionFramwork.SetInterface.HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("Java"); // Duplicate, won't be added

        System.out.println(set); // [Java, Python, C++]
    }
}