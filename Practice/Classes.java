public class Classes {
    public static void main(String[] args) {
        child s = new child();
        System.out.println(s.add(2, 3));
    }
}

class child {

    int add(int a, int b) {
        return a + b;
    }
}