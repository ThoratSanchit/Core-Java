package javaPractice;

public class Frequency {
    public static void main(String[] args) {
        String string = "baap";
        int[] frequency = new int[254];

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            frequency[ch]++;
        }

        System.out.println("Character frequencies:");
        for (int i = 0; i < 254; i++) {
            if (frequency[i] > 0) {
                System.out.println((char) i + " comes " + frequency[i] + " times.");
            }
        }
    }
}
