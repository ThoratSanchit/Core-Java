public class NewLength {

    static void Length(String string) {
        int size = 0;
        char[] ch = string.toCharArray();

        for (char str : ch) {
            size++;
        }
        System.out.println(size);
    }

    public static void main(String[] args) {
        NewLength.Length("sanchit");
    }
}
