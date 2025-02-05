public class happy {
    public static void main(String[] args) {
        

        int square;

        int num=19;
        System.out.println(num%10);
        int sum=0;
       
        String convertedNum=String.valueOf(num);
        String arr[]=convertedNum.split("");
        int newSum;
        for(int i=0;i<convertedNum.length();i++){
            System.out.println(arr[i]);
            sum+=Integer.parseInt(arr[i])*Integer.parseInt(arr[i]);
        }
        System.out.println(sum);
    }
}
