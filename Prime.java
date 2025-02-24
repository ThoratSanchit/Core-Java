public class Prime {

    void prime(int n) {
        boolean flag = true;
        for (int i = 2; i <= n-1; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
    public static void main(String[] args) {
        Prime p = new Prime();
        p.prime(5);
    }
}