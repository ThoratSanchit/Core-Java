public class TypeCasting {
    public static void main(String[] args) {

        // WIDENING (Implicit) — smaller → larger, done automatically, no data loss
        // byte → short → int → long → float → double
        int i = 100;
        long l = i;       // int to long (automatic)
        double d = l;     // long to double (automatic)
        System.out.println("Widening: " + i + " → " + l + " → " + d);

        // NARROWING (Explicit) — larger → smaller, must cast manually, may lose data
        double pi = 3.99;
        int truncated = (int) pi;   // decimal part is dropped, NOT rounded
        System.out.println("Narrowing: " + pi + " → " + truncated); // 3

        long bigNum = 130L;
        byte b = (byte) bigNum;  // 130 overflows byte (max 127) → wraps around
        System.out.println("Overflow: " + bigNum + " → " + b); // -126

        // OBJECT CASTING (Upcasting & Downcasting)
        // Upcasting — subclass → superclass (automatic)
        Animal animal = new Dog(); // Dog IS-A Animal
        animal.speak();            // calls Dog's overridden method (runtime polymorphism)

        // Downcasting — superclass → subclass (manual, needs instanceof check)
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.fetch();  // Dog-specific method
        }

        // String ↔ Primitive conversions
        String numStr = "42";
        int parsed = Integer.parseInt(numStr);     // String → int
        double parsedD = Double.parseDouble("3.14"); // String → double
        String fromInt = String.valueOf(parsed);   // int → String
        System.out.println(parsed + 1);   // 43
        System.out.println(fromInt + 1);  // "421" (string concat!)
    }
}

class Animal {
    void speak() { System.out.println("Animal speaks"); }
}

class Dog extends Animal {
    @Override
    void speak() { System.out.println("Dog barks"); }
    void fetch() { System.out.println("Dog fetches the ball"); }
}
