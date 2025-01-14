public class MannualSplit {

    static void MainSplit(String string) {
        int start = 0;
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);

            if (ch == ' ') {
               
                int end = (ch == ' ') ? i : i + 1;

                System.out.println(string.substring(start, end));

                start = i + 1;
            }

        }
    }

    public static void main(String[] args) {
        String sen = "the baap company, rao is the founder";
        MannualSplit.MainSplit(sen);
    }
}
