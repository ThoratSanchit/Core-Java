package PrimitiveDataTypes;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        byte aByte = 127; // byte: 1 byte, range -128 to 127
        short aShort = 32000; // short: 2 bytes, range -32,768 to 32,767
        int anInt = 2147483647; // int: 4 bytes, range -2^31 to 2^31-1
        long aLong = 9223372036854775807L; // long: 8 bytes, range -2^63 to 2^63-1
        float aFloat = 3.14f; // float: 4 bytes, single-precision
        double aDouble = 3.141592653589793; // double: 8 bytes, double-precision
        char aChar = 'A'; // char: 2 bytes, Unicode character
        boolean aBoolean = true; // boolean: 1 byte, true or false

        System.out.println("byte value: " + aByte);
        System.out.println("short value: " + aShort);
        System.out.println("int value: " + anInt);
        System.out.println("long value: " + aLong);
        System.out.println("float value: " + aFloat);
        System.out.println("double value: " + aDouble);
        System.out.println("char value: " + aChar);
        System.out.println("boolean value: " + aBoolean);
    }
}
