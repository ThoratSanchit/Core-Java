public class OperatorsDemo {
    public static void main(String[] args) {

        // 1. Arithmetic
        int a = 10, b = 3;
        System.out.println("Arithmetic:");
        System.out.println(a + b);  // 13
        System.out.println(a - b);  // 7
        System.out.println(a * b);  // 30
        System.out.println(a / b);  // 3 (integer division)
        System.out.println(a % b);  // 1

        // 2. Comparison
        System.out.println("\nComparison:");
        System.out.println(a == b);  // false
        System.out.println(a != b);  // true
        System.out.println(a > b);   // true

        // 3. Logical
        System.out.println("\nLogical:");
        System.out.println(a > 5 && b < 5);  // true
        System.out.println(a < 5 || b < 5);  // true
        System.out.println(!(a > 5));         // false

        // 4. Unary
        System.out.println("\nUnary:");
        int x = 5;
        System.out.println(x++);  // 5 (post-increment: use then increment)
        System.out.println(x);    // 6
        System.out.println(++x);  // 7 (pre-increment: increment then use)

        // 5. Ternary
        System.out.println("\nTernary:");
        int max = (a > b) ? a : b;
        System.out.println("Max: " + max);  // 10

        // 6. Bitwise
        System.out.println("\nBitwise:");
        System.out.println(5 & 3);   // 1  (0101 & 0011 = 0001)
        System.out.println(5 | 3);   // 7  (0101 | 0011 = 0111)
        System.out.println(5 ^ 3);   // 6  (0101 ^ 0011 = 0110)
        System.out.println(5 << 1);  // 10 (left shift = multiply by 2)
        System.out.println(5 >> 1);  // 2  (right shift = divide by 2)

        // 7. instanceof
        System.out.println("\ninstanceof:");
        String str = "Hello";
        System.out.println(str instanceof String);  // true
    }
}
