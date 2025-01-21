import java.util.ArrayList;

public class Salary {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20200);
        list.add(30000);
        list.add(4000);
        list.add(5000);

        int sum = 0;   

        int max = Integer.MIN_VALUE;
        for (int salary : list) {
            sum = sum + salary;
            if (salary > max) {
                max = salary;
            }

        }
        System.out.println("Total salary " + sum);
        System.out.println("Max salary " + max);

        list.replaceAll(salary -> salary + (salary * 10 / 100));
        System.out.println("After updating salary "+list );

    }

}
