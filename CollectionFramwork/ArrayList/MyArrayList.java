package CollectionFramwork.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList();

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 2; i++) {
            System.out.println("Enter the name: " + i + " ");
            String name = sc.nextLine();
            names.add(name);

        }

        for (String allNames : names) {
            System.out.println("name is :" + allNames);
        }
    }
}
