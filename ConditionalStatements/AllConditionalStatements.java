package ConditionalStatements;

public class AllConditionalStatements {
    public static void main(String[] args) {
          // 1. If-Else Example
          int age = 20;
          if (age >= 18) {
              System.out.println("You are eligible to vote.");
          } else {
              System.out.println("You are not eligible to vote.");
          }
  
          // 2. Else-If Example
          int marks = 85;
          if (marks >= 90) {
              System.out.println("Grade: A");
          } else if (marks >= 75) {
              System.out.println("Grade: B");
          } else if (marks >= 50) {
              System.out.println("Grade: C");
          } else {
              System.out.println("Grade: F");
          }
  
          // 3. Switch Example
          int day = 3; // 1 = Monday, 2 = Tuesday, ..., 7 = Sunday
          switch (day) {
              case 1:
                  System.out.println("Today is Monday.");
                  break;
              case 2:
                  System.out.println("Today is Tuesday.");
                  break;
              case 3:
                  System.out.println("Today is Wednesday.");
                  break;
              case 4:
                  System.out.println("Today is Thursday.");
                  break;
              case 5:
                  System.out.println("Today is Friday.");
                  break;
              case 6:
                  System.out.println("Today is Saturday.");
                  break;
              case 7:
                  System.out.println("Today is Sunday.");
                  break;
              default:
                  System.out.println("Invalid day.");
          }
  
          // 4. Ternary Example
          int number = -5;
          String result = (number > 0) ? "The number is positive." : "The number is not positive.";
          System.out.println(result);
    }
}
