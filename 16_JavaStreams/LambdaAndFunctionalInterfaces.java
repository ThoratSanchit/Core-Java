import java.util.*;
import java.util.function.*;

// Custom functional interface — any interface with exactly ONE abstract method
@FunctionalInterface
interface Greeting {
    String greet(String name);
}

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class LambdaAndFunctionalInterfaces {
    public static void main(String[] args) {

        // LAMBDA SYNTAX: (parameters) -> expression  OR  (parameters) -> { body }

        // 1. Custom functional interface with lambda
        Greeting hello = name -> "Hello, " + name + "!";
        Greeting shout = name -> name.toUpperCase() + "!!!";
        System.out.println(hello.greet("Alice"));  // Hello, Alice!
        System.out.println(shout.greet("bob"));    // BOB!!!

        MathOperation add = (a, b) -> a + b;
        MathOperation multiply = (a, b) -> a * b;
        System.out.println(add.operate(3, 4));      // 7
        System.out.println(multiply.operate(3, 4)); // 12

        // 2. Built-in Functional Interfaces (java.util.function)

        // Predicate<T> — takes T, returns boolean
        Predicate<Integer> isEven = n -> n % 2 == 0;
        Predicate<String> isLong = s -> s.length() > 5;
        System.out.println(isEven.test(4));       // true
        System.out.println(isEven.test(7));       // false
        System.out.println(isEven.and(n -> n > 0).test(4)); // true (even AND positive)
        System.out.println(isEven.negate().test(4));         // false

        // Function<T, R> — takes T, returns R
        Function<String, Integer> strLen = String::length;
        Function<Integer, String> intToStr = i -> "Number: " + i;
        System.out.println(strLen.apply("Hello"));   // 5
        System.out.println(intToStr.apply(42));      // Number: 42

        // Function chaining
        Function<String, String> trim = String::trim;
        Function<String, String> upper = String::toUpperCase;
        Function<String, String> trimThenUpper = trim.andThen(upper);
        System.out.println(trimThenUpper.apply("  hello  ")); // HELLO

        // Consumer<T> — takes T, returns nothing (side effect)
        Consumer<String> print = System.out::println;
        Consumer<String> printUpper = s -> System.out.println(s.toUpperCase());
        print.accept("hello");       // hello
        printUpper.accept("world");  // WORLD

        // Supplier<T> — takes nothing, returns T
        Supplier<String> greeting = () -> "Good morning!";
        Supplier<List<String>> listFactory = ArrayList::new;
        System.out.println(greeting.get());  // Good morning!

        // BiFunction<T, U, R> — takes two inputs, returns R
        BiFunction<String, Integer, String> repeat = (s, n) -> s.repeat(n);
        System.out.println(repeat.apply("ha", 3));  // hahaha

        // UnaryOperator<T> — Function<T,T> (same input and output type)
        UnaryOperator<String> exclaim = s -> s + "!";
        System.out.println(exclaim.apply("Wow"));  // Wow!

        // BinaryOperator<T> — BiFunction<T,T,T>
        BinaryOperator<Integer> max = (a, b) -> a > b ? a : b;
        System.out.println(max.apply(10, 20));  // 20

        // 3. METHOD REFERENCES — shorthand for lambdas that call existing methods
        List<String> names = Arrays.asList("Charlie", "Alice", "Bob");

        // Static method reference: ClassName::staticMethod
        names.stream().map(String::toUpperCase).forEach(System.out::println);

        // Instance method reference: instance::method
        String prefix = "Hello ";
        Function<String, String> addPrefix = prefix::concat;
        System.out.println(addPrefix.apply("World"));  // Hello World

        // Constructor reference: ClassName::new
        Supplier<ArrayList<String>> newList = ArrayList::new;
        ArrayList<String> list = newList.get();
        list.add("test");
        System.out.println(list);  // [test]
    }
}
