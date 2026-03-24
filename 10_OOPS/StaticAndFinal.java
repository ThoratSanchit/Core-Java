public class StaticAndFinal {

    // STATIC — belongs to the CLASS, not to any instance
    static int instanceCount = 0;  // shared across all objects
    static final String APP_NAME = "MyApp";  // constant

    String name;

    public StaticAndFinal(String name) {
        this.name = name;
        instanceCount++;  // shared counter
    }

    // Static method — can be called without creating an object
    static void showCount() {
        System.out.println("Total objects created: " + instanceCount);
        // System.out.println(name); // ← ERROR: cannot access instance variable
    }

    // Instance method
    void show() {
        System.out.println("Name: " + name + ", App: " + APP_NAME);
    }

    public static void main(String[] args) {

        // --- STATIC ---
        StaticAndFinal obj1 = new StaticAndFinal("Alice");
        StaticAndFinal obj2 = new StaticAndFinal("Bob");
        StaticAndFinal.showCount();  // 2 — called on class, not instance

        obj1.show();
        obj2.show();

        // --- FINAL ---
        // final variable — value cannot be changed after assignment
        final int MAX = 100;
        // MAX = 200;  // ← compile error

        // final method — cannot be overridden in subclass
        // final class — cannot be extended (e.g., String is final)

        System.out.println("Constant: " + MAX);
    }
}

// final class — cannot be subclassed
final class Immutable {
    final int value;

    Immutable(int value) {
        this.value = value;  // can only be assigned once, in constructor
    }
}

// class TryExtend extends Immutable {}  // ← compile error: cannot extend final class
