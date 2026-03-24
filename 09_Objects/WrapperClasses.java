public class WrapperClasses {
    public static void main(String[] args) {

        // Wrapper classes wrap primitives into objects
        // Needed for: Collections, Generics, null values, utility methods

        // Primitive  →  Wrapper
        // int        →  Integer
        // double     →  Double
        // char       →  Character
        // boolean    →  Boolean
        // long       →  Long
        // float      →  Float
        // byte       →  Byte
        // short      →  Short

        // AUTOBOXING — primitive automatically converted to wrapper object
        int x = 10;
        Integer boxed = x;  // autoboxing
        System.out.println(boxed);  // 10

        // UNBOXING — wrapper object automatically converted to primitive
        Integer obj = 50;
        int unboxed = obj;  // unboxing
        System.out.println(unboxed + 5);  // 55

        // Useful static methods
        System.out.println(Integer.MAX_VALUE);       // 2147483647
        System.out.println(Integer.MIN_VALUE);       // -2147483648
        System.out.println(Integer.parseInt("123")); // String → int
        System.out.println(Integer.toBinaryString(10)); // "1010"
        System.out.println(Integer.toHexString(255));   // "ff"
        System.out.println(Integer.toOctalString(8));   // "10"

        System.out.println(Double.parseDouble("3.14")); // String → double
        System.out.println(Character.isDigit('5'));      // true
        System.out.println(Character.isLetter('A'));     // true
        System.out.println(Character.toUpperCase('a'));  // A
        System.out.println(Boolean.parseBoolean("true")); // true

        // Wrapper objects in Collections (primitives not allowed directly)
        java.util.List<Integer> list = new java.util.ArrayList<>();
        list.add(1);   // autoboxing int → Integer
        list.add(2);
        int sum = 0;
        for (int n : list) sum += n;  // unboxing Integer → int
        System.out.println("Sum: " + sum);

        // Null handling — wrapper can be null, primitive cannot
        Integer nullable = null;
        System.out.println(nullable);  // null (no NullPointerException here)
        // int primitive = null;  // ← compile error
    }
}
