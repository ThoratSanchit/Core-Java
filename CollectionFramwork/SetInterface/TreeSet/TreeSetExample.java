package CollectionFramwork.SetInterface.TreeSet;

import java.util.TreeSet;
import java.util.Set;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("Java");
        set.add("Python");
        set.add("C++");

        System.out.println(set); // [C++, Java, Python] (sorted order)
    }
}