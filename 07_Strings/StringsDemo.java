public class StringsDemo {
    public static void main(String[] args) {

        String s = "Hello World";

        // Basic methods
        System.out.println(s.length());           // 11
        System.out.println(s.charAt(0));          // H
        System.out.println(s.indexOf("World"));   // 6
        System.out.println(s.substring(6));       // World
        System.out.println(s.substring(0, 5));    // Hello
        System.out.println(s.toUpperCase());      // HELLO WORLD
        System.out.println(s.toLowerCase());      // hello world
        System.out.println(s.replace("World", "Java")); // Hello Java
        System.out.println(s.contains("Hello")); // true
        System.out.println(s.startsWith("He"));  // true
        System.out.println(s.endsWith("ld"));    // true
        System.out.println("  hi  ".trim());     // "hi"

        // Comparison — always use .equals(), not ==
        String a = "Java";
        String b = "Java";
        String c = new String("Java");
        System.out.println(a == b);           // true  (same pool reference)
        System.out.println(a == c);           // false (different heap object)
        System.out.println(a.equals(c));      // true  (same content)

        // Split
        String csv = "apple,banana,mango";
        String[] fruits = csv.split(",");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // StringBuilder — efficient string building
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 5; i++) {
            sb.append(i).append(" ");
        }
        System.out.println(sb.toString()); // 1 2 3 4 5

        sb.reverse();
        System.out.println(sb.toString()); // 5 4 3 2 1

        sb.insert(0, ">> ");
        sb.delete(0, 3);
        System.out.println(sb.toString());

        // String formatting
        String name = "Alice";
        int age = 25;
        System.out.println(String.format("Name: %s, Age: %d", name, age));

        // Convert types to String
        System.out.println(String.valueOf(42));      // "42"
        System.out.println(String.valueOf(3.14));    // "3.14"
        System.out.println(String.valueOf(true));    // "true"

        // char array to String and back
        char[] chars = {'J', 'a', 'v', 'a'};
        String fromChars = new String(chars);
        System.out.println(fromChars);               // Java
        System.out.println(fromChars.toCharArray()); // [C@...
    }
}
