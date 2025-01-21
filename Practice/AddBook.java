import java.util.ArrayList;

public class AddBook {
    public static void main(String[] args) {
        ArrayList<String> book = new ArrayList<>();
        book.add("Java"); 
        book.add("Python");
        book.add("C");

        ArrayList<String> note = new ArrayList<>();
        note.addAll(book);
        int i = 1;
        for (String notes : note) {
            if (notes == "java") {
               continue;
            }
            System.out.println("Book " + i + " " + notes);
            ;
            i++;
        }
    }
}
