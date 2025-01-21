import java.util.ArrayList;

public class Scores {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(80);
        scores.add(70);
        scores.add(90);
        scores.add(85);
        scores.add(75);

        int sum = 0;
        for (int marks : scores) {
            sum += marks;
        }
        int avg = sum / scores.size();
        System.out.println("Average is " + avg);

        int closest=0;
        for (int sc : scores) {
            if (sc <= 80 && sc > 75) {
                closest = sc;
            }
        }

        System.out.println("Closest "+closest);

    }
}
