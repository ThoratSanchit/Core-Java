package CollectionFramwork.SetInterface.LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("C++");

        System.out.println(set); // [Java, Python, C++]
    }
}
