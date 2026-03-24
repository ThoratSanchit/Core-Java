package ExceptionHandling;

import java.util.Scanner;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class CustomException {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the nuber");
            byte number = sc.nextByte();
            sc.close();
            if (number < 0) {
                throw new NegativeNumberException("Age must be a posiive");
            }
           
        } catch (NegativeNumberException error) {
            System.out.println(error.getMessage());
        }

    }
}

// You can make the custom exception by extending the Exception class like
// above.....