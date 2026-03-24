import java.util.Vector;
import java.util.List;

public class VectorExample {
    public static void main(String[] args) {
        List<String> list = new Vector<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");

        System.out.println(list); // [Java, Python, C++]
    }
}