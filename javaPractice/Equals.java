package javaPractice;

public class Equals {
    public static void main(String[] args) {
        String name1 = "Sanchit";
        String name2 = "Sanchit";
        System.out.println(name1.equals(name2));

        // Type casting
        // 1 Explicit casing
        int num = 10;
        double newNum = (double) num;
        System.out.println(newNum);
        int[] arr=new int[2];
        arr[0] = 12;
        arr[1] = 2;
        System.out.println("My array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        

        double number=Math.random()*100;
        System.out.println(number);
    }
}
