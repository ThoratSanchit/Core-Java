public class FindMissing {
    public static void main(String[] args) {
        int arr[] = {0,1, 2, 3, 4, 5, 7, 9 };

        int missing=0;
        for (int i = 0; i <arr.length-1; i++) {
          if(arr[i+1]-arr[i]>1){
            missing=arr[i]+1;
          }
        }
        System.out.println(missing);
      
    }
}
