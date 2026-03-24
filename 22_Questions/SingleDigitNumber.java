// find the sum of digit untill the result is single digit number  finaly print the result 
// input 1234
// step 1:-- 1+2+3+4=10
// step 2:-- 1+0=1
// output=1

// package Questions;


public class SingleDigitNumber {
    public static void main(String[] args) {
        int number = 1234;

        while (number >= 10) { // Repeat until number is a single-digit number
            int result = 0;
            String strNum = String.valueOf(number); // Convert number to string
            String[] numArr = strNum.split(""); // Split into digits

            for (String digit : numArr) {
                result += Integer.parseInt(digit); // Sum of digits
            }

            number = result; // Update number with the sum
        }

        System.out.println("Output: " + number);
    }
}

