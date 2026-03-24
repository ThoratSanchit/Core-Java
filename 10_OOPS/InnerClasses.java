public class InnerClasses {

    // 1. MEMBER INNER CLASS — defined inside a class, needs outer instance
    private String outerField = "Outer Field";

    class Inner {
        void display() {
            // can access outer class private members
            System.out.println("Inner class accessing: " + outerField);
        }
    }

    // 2. STATIC NESTED CLASS — does NOT need outer class instance
    static class StaticNested {
        void display() {
            System.out.println("Static nested class — no outer instance needed");
            // cannot access outerField (not static)
        }
    }

    void demonstrate() {
        // 3. LOCAL INNER CLASS — defined inside a method
        class Local {
            void display() {
                System.out.println("Local inner class inside a method");
            }
        }
        new Local().display();

        // 4. ANONYMOUS INNER CLASS — no name, defined and instantiated at once
        // Commonly used to implement interfaces or extend classes on the fly
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous inner class implementing Runnable");
            }
        };
        r.run();

        // Same thing with lambda (modern way — Java 8+)
        Runnable lambda = () -> System.out.println("Lambda replacing anonymous class");
        lambda.run();
    }

    public static void main(String[] args) {
        InnerClasses outer = new InnerClasses();

        // Member inner class — needs outer instance
        InnerClasses.Inner inner = outer.new Inner();
        inner.display();

        // Static nested class — no outer instance needed
        InnerClasses.StaticNested nested = new InnerClasses.StaticNested();
        nested.display();

        // Local + anonymous inner classes
        outer.demonstrate();
    }
}
