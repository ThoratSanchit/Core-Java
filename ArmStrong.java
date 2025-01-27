public class ArmStrong {
    public static void main(String[] args) {
        int number = 153;
        String len = String.valueOf(number);
        String arr[] = len.split("");
        int numDigits = len.length();
        int sum = 0;
        boolean flag = false;

        for (int i = 0; i < numDigits; i++) {
            int digit = Integer.parseInt(arr[i]);
            int var = 1;

            for (int j = 0; j < numDigits; j++) {
                var *= digit;
               
            }

            sum += var;
            System.out.println(var);
        }

        if (sum == number) {
            flag = true;
        }

        System.out.println("Is Armstrong number: " + flag);
    }
}
