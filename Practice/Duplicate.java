import java.util.ArrayList;

public class Duplicate {
    public static void main(String[] args) {
        String str = "The baap company,  The founder of The baap is rao";
        String[] arr = str.split(" ");
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i].equals(arr[j]) && !list.contains(arr[i])) {
                    list.add(arr[i]);
                }
            }
        }
    System.out.println(list);
    }
}
