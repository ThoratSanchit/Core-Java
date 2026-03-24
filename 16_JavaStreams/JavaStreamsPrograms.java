import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Person {
    String name;
    int age;
    String city;

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", city='" + city + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(city, person.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, city);
    }
}

public class JavaStreamsPrograms {

    public static void main(String[] args) {
        System.out.println("--- Filtering Examples ---");
        filterEvenNumbers();
        filterStringsByLength();

        System.out.println("\n--- Mapping Examples ---");
        mapStringsToUppercase();
        mapObjectsToAttributes();

        System.out.println("\n--- Sorting Examples ---");
        sortStringsAlphabetically();
        sortNumbersReverse();
        sortObjectsByAttribute();

        System.out.println("\n--- Reducing Examples ---");
        reduceToSum();
        reduceToConcatenateStrings();
        reduceProductWithIdentity();

        System.out.println("\n--- Collecting Examples ---");
        collectToList();
        collectToSet();
        collectToMap();
        collectWithJoining();
        collectWithGroupingBy();
        collectWithPartitioningBy();

        System.out.println("\n--- Matching Examples ---");
        matchAnyElement();
        matchAllElements();
        matchNoneElement();

        System.out.println("\n--- Finding Examples ---");
        findFirstElement();
        findAnyElement();

        System.out.println("\n--- flatMap Examples ---");
        flatMapListOfLists();
        flatMapSentencesToWords();

        System.out.println("\n--- Primitive Streams Examples ---");
        primitiveIntStreamRange();
        primitiveIntStreamSum();

        System.out.println("\n--- Parallel Stream Example ---");
        parallelStreamExample();
    }

    // --- Filtering Examples ---
    public static void filterEvenNumbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Original numbers: " + numbers);
        System.out.println("Even numbers: " + evenNumbers); // Expected: [2, 4, 6, 8, 10]
    }

    public static void filterStringsByLength() {
        List<String> words = Arrays.asList("apple", "banana", "kiwi", "orange", "grape");
        int minLength = 5;
        List<String> longWords = words.stream()
                .filter(s -> s.length() >= minLength)
                .collect(Collectors.toList());
        System.out.println("Original words: " + words);
        System.out.println("Words with length >= " + minLength + ": " + longWords); // Expected: [apple, banana, orange, grape]
    }

    // --- Mapping Examples ---
    public static void mapStringsToUppercase() {
        List<String> words = Arrays.asList("hello", "world", "java", "streams");
        List<String> uppercaseWords = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Original words: " + words);
        System.out.println("Uppercase words: " + uppercaseWords); // Expected: [HELLO, WORLD, JAVA, STREAMS]
    }

    public static void mapObjectsToAttributes() {
        List<Person> people = Arrays.asList(
                new Person("Alice", 30, "New York"),
                new Person("Bob", 25, "London"),
                new Person("Charlie", 35, "Paris")
        );
        List<String> names = people.stream()
                .map(Person::getName)
                .collect(Collectors.toList());
        System.out.println("Original people: " + people);
        System.out.println("Names of people: " + names); // Expected: [Alice, Bob, Charlie]
    }

    // --- Sorting Examples ---
    public static void sortStringsAlphabetically() {
        List<String> words = Arrays.asList("banana", "apple", "kiwi", "orange", "grape");
        List<String> sortedWords = words.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Original words: " + words);
        System.out.println("Sorted words (alphabetically): " + sortedWords); // Expected: [apple, banana, grape, kiwi, orange]
    }

    public static void sortNumbersReverse() {
        List<Integer> numbers = Arrays.asList(5, 1, 8, 3, 9, 2, 7, 4, 6);
        List<Integer> reverseSortedNumbers = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("Original numbers: " + numbers);
        System.out.println("Reverse sorted numbers: " + reverseSortedNumbers); // Expected: [9, 8, 7, 6, 5, 4, 3, 2, 1]
    }

    public static void sortObjectsByAttribute() {
        List<Person> people = Arrays.asList(
                new Person("Alice", 30, "New York"),
                new Person("Bob", 25, "London"),
                new Person("Charlie", 35, "Paris"),
                new Person("David", 25, "Berlin")
        );
        // Sort by age, then by name if ages are equal
        List<Person> sortedPeople = people.stream()
                .sorted(Comparator.comparingInt(Person::getAge).thenComparing(Person::getName))
                .collect(Collectors.toList());
        System.out.println("Original people: " + people);
        System.out.println("People sorted by age (then name): " + sortedPeople);
        // Expected: [Person{name='Bob', age=25, city='London'}, Person{name='David', age=25, city='Berlin'}, Person{name='Alice', age=30, city='New York'}, Person{name='Charlie', age=35, city='Paris'}]
    }

    // --- Reducing Examples ---
    public static void reduceToSum() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> sumOptional = numbers.stream()
                .reduce((a, b) -> a + b);
        sumOptional.ifPresent(sum -> System.out.println("Sum of numbers " + numbers + ": " + sum)); // Expected: 15

        int sumWithIdentity = numbers.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println("Sum of numbers " + numbers + " with identity 0: " + sumWithIdentity); // Expected: 15
    }

    public static void reduceToConcatenateStrings() {
        List<String> words = Arrays.asList("Java", " ", "Streams", " ", "are", " ", "cool!");
        Optional<String> concatenated = words.stream()
                .reduce(String::concat);
        concatenated.ifPresent(s -> System.out.println("Concatenated string: '" + s + "'")); // Expected: 'Java Streams are cool!'
    }

    public static void reduceProductWithIdentity() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        // Identity for product is 1
        int product = numbers.stream().reduce(1, (a, b) -> a * b);
        System.out.println("Product of numbers " + numbers + " with identity 1: " + product); // Expected: 120
    }


    // --- Collecting Examples ---
    public static void collectToList() {
        Stream<String> stream = Stream.of("a", "b", "c", "a");
        List<String> list = stream.collect(Collectors.toList());
        System.out.println("Collected to List: " + list); // Expected: [a, b, c, a]
    }

    public static void collectToSet() {
        Stream<String> stream = Stream.of("a", "b", "c", "a", "b");
        Set<String> set = stream.collect(Collectors.toSet());
        System.out.println("Collected to Set (unique elements): " + set); // Expected: [a, b, c] (order may vary)
    }

    public static void collectToMap() {
        List<Person> people = Arrays.asList(
                new Person("Alice", 30, "New York"),
                new Person("Bob", 25, "London"),
                new Person("Charlie", 35, "Paris")
                // Add new Person("Alice", 28, "Berlin") to see mergeFunction work
        );
        // Key: name, Value: age. Throws IllegalStateException if duplicate keys found.
        try {
            Map<String, Integer> peopleMapSimple = people.stream()
                    .collect(Collectors.toMap(Person::getName, Person::getAge));
            System.out.println("People collected to Map (Name -> Age): " + peopleMapSimple);
            // Expected: {Alice=30, Bob=25, Charlie=35}
        } catch (IllegalStateException e) {
            System.out.println("Error creating simple map due to duplicate keys: " + e.getMessage());
        }


        // Handling duplicate keys: if two persons have the same name, keep the older one.
        Map<String, Integer> peopleMapHandlingDuplicates = people.stream()
                .collect(Collectors.toMap(
                        Person::getName,
                        Person::getAge,
                        (existingAge, newAge) -> Math.max(existingAge, newAge) // Merge function for duplicates
                ));
        System.out.println("People collected to Map (Name -> Age, handling duplicates by keeping older): " + peopleMapHandlingDuplicates);
        // Expected: {Alice=30, Bob=25, Charlie=35} (if Alice/28/Berlin added, Alice would be 30)
    }

    public static void collectWithJoining() {
        List<String> words = Arrays.asList("Java", "Streams", "are", "powerful");
        String joinedString = words.stream()
                .collect(Collectors.joining(", ", "[", "]"));
        System.out.println("Joined string: " + joinedString); // Expected: [Java, Streams, are, powerful]
    }

    public static void collectWithGroupingBy() {
        List<Person> people = Arrays.asList(
                new Person("Alice", 30, "New York"),
                new Person("Bob", 25, "London"),
                new Person("Charlie", 35, "New York"),
                new Person("David", 25, "London"),
                new Person("Eve", 30, "Paris")
        );
        Map<String, List<Person>> peopleByCity = people.stream()
                .collect(Collectors.groupingBy(Person::getCity));
        System.out.println("People grouped by city: " + peopleByCity);
        // Expected: {New York=[Person{name='Alice', age=30, city='New York'}, Person{name='Charlie', age=35, city='New York'}],
        //            London=[Person{name='Bob', age=25, city='London'}, Person{name='David', age=25, city='London'}],
        //            Paris=[Person{name='Eve', age=30, city='Paris'}]}

        // Grouping by city and then counting people in each city
        Map<String, Long> countByCity = people.stream()
                .collect(Collectors.groupingBy(Person::getCity, Collectors.counting()));
        System.out.println("Count of people by city: " + countByCity); // Expected: {New York=2, London=2, Paris=1}
    }

    public static void collectWithPartitioningBy() {
        List<Person> people = Arrays.asList(
                new Person("Alice", 30, "New York"),
                new Person("Bob", 22, "London"),
                new Person("Charlie", 35, "Paris"),
                new Person("David", 19, "Berlin")
        );
        int ageThreshold = 25;
        Map<Boolean, List<Person>> partitionedByAge = people.stream()
                .collect(Collectors.partitioningBy(p -> p.getAge() >= ageThreshold));
        System.out.println("People partitioned by age >= " + ageThreshold + ": " + partitionedByAge);
        // Expected: {false=[Person{name='Bob', age=22, city='London'}, Person{name='David', age=19, city='Berlin'}],
        //            true=[Person{name='Alice', age=30, city='New York'}, Person{name='Charlie', age=35, city='Paris'}]}
    }

    // --- Matching Examples ---
    public static void matchAnyElement() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, -1, 6);
        boolean anyNegative = numbers.stream().anyMatch(n -> n < 0);
        System.out.println("Are there any negative numbers in " + numbers + "? " + anyNegative); // Expected: true

        boolean anyGreaterThan10 = numbers.stream().anyMatch(n -> n > 10);
        System.out.println("Are there any numbers greater than 10 in " + numbers + "? " + anyGreaterThan10); // Expected: false
    }

    public static void matchAllElements() {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);
        boolean allEven = numbers.stream().allMatch(n -> n % 2 == 0);
        System.out.println("Are all numbers in " + numbers + " even? " + allEven); // Expected: true

        List<Integer> mixedNumbers = Arrays.asList(2, 4, 5, 8, 10);
        boolean allEvenMixed = mixedNumbers.stream().allMatch(n -> n % 2 == 0);
        System.out.println("Are all numbers in " + mixedNumbers + " even? " + allEvenMixed); // Expected: false
    }

    public static void matchNoneElement() {
        List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 9);
        boolean noneEven = numbers.stream().noneMatch(n -> n % 2 == 0);
        System.out.println("Are no numbers in " + numbers + " even? " + noneEven); // Expected: true

        List<Integer> mixedNumbers = Arrays.asList(1, 3, 4, 7, 9);
        boolean noneEvenMixed = mixedNumbers.stream().noneMatch(n -> n % 2 == 0);
        System.out.println("Are no numbers in " + mixedNumbers + " even? " + noneEvenMixed); // Expected: false
    }

    // --- Finding Examples ---
    public static void findFirstElement() {
        List<String> words = Arrays.asList("apple", "banana", "apricot", "blueberry");
        Optional<String> firstA = words.stream()
                .filter(s -> s.startsWith("a"))
                .findFirst();
        firstA.ifPresent(s -> System.out.println("First word starting with 'a': " + s)); // Expected: apple

        Optional<String> firstZ = words.stream()
                .filter(s -> s.startsWith("z"))
                .findFirst();
        System.out.println("First word starting with 'z': " + (firstZ.isPresent() ? firstZ.get() : "Not found")); // Expected: Not found
    }

    public static void findAnyElement() {
        List<String> words = Arrays.asList("apple", "banana", "apricot", "blueberry", "avocado");
        // In a sequential stream, findAny usually returns the first element, but it's not guaranteed.
        // It's more relevant for parallel streams where any element found quickly by any thread can be returned.
        Optional<String> anyA = words.stream()
                .filter(s -> s.startsWith("a"))
                .findAny();
        anyA.ifPresent(s -> System.out.println("Any word starting with 'a' (sequential): " + s)); // Expected: usually apple

        Optional<String> anyAParallel = words.parallelStream()
                .filter(s -> s.startsWith("a"))
                .findAny();
        anyAParallel.ifPresent(s -> System.out.println("Any word starting with 'a' (parallel): " + s)); // Could be apple, apricot, or avocado
    }

    // --- flatMap Examples ---
    public static void flatMapListOfLists() {
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8, 9)
        );
        List<Integer> flattenedList = listOfLists.stream()
                .flatMap(List::stream) // or list -> list.stream()
                .collect(Collectors.toList());
        System.out.println("Original list of lists: " + listOfLists);
        System.out.println("Flattened list: " + flattenedList); // Expected: [1, 2, 3, 4, 5, 6, 7, 8, 9]
    }

    public static void flatMapSentencesToWords() {
        List<String> sentences = Arrays.asList(
                "Java Streams are powerful",
                "flatMap is very useful",
                "Learn Java Streams"
        );
        // Get unique words from all sentences
        Set<String> uniqueWords = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" "))) // Stream<String[]> -> Stream<String>
                .map(String::toLowerCase) // Optional: normalize to lower case
                .collect(Collectors.toSet());
        System.out.println("Original sentences: " + sentences);
        System.out.println("Unique words: " + uniqueWords);
        // Expected (order may vary): [streams, useful, java, learn, are, powerful, very, flatmap, is]
    }


    // --- Primitive Streams Examples ---
    public static void primitiveIntStreamRange() {
        System.out.print("IntStream.range(1, 5): "); // Exclusive upper bound
        IntStream.range(1, 5).forEach(i -> System.out.print(i + " ")); // Expected: 1 2 3 4
        System.out.println();

        System.out.print("IntStream.rangeClosed(1, 5): "); // Inclusive upper bound
        IntStream.rangeClosed(1, 5).forEach(i -> System.out.print(i + " ")); // Expected: 1 2 3 4 5
        System.out.println();

        System.out.print("IntStream.of(2, 4, 6, 8): ");
        IntStream.of(2, 4, 6, 8).forEach(i -> System.out.print(i + " ")); // Expected: 2 4 6 8
        System.out.println();
    }

    public static void primitiveIntStreamSum() {
        int sum = IntStream.rangeClosed(1, 100).sum();
        System.out.println("Sum of numbers from 1 to 100 using IntStream.sum(): " + sum); // Expected: 5050

        OptionalDouble average = IntStream.rangeClosed(1, 10).average();
        average.ifPresent(avg -> System.out.println("Average of numbers from 1 to 10: " + avg)); // Expected: 5.5
    }

    // --- Parallel Stream Example ---
    public static void parallelStreamExample() {
        List<Integer> largeList = new ArrayList<>();
        for (int i = 0; i < 100; i++) { // Using a smaller list for quick demo
            largeList.add(i);
        }

        // When to use:
        // - Large datasets where the processing of each element is independent.
        // - Computationally intensive tasks for each element.
        // - Be cautious with shared mutable state and operations that depend on order.
        // - Overhead of parallelism might make it slower for small datasets or very simple operations.

        System.out.println("Processing a list in parallel (order of output might vary):");
        largeList.parallelStream()
                .filter(n -> n % 10 == 0) // Example: filter numbers divisible by 10
                .forEach(n -> System.out.print(n + " ")); // The order of printed elements is not guaranteed
        System.out.println("\nParallel processing finished.");
        // Expected: 0 10 20 30 40 50 60 70 80 90 (order might vary)
    }
}
