import java.util.*;
public class GoodPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            long sum=0;
            int count=0;
            int[] maxInt = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                sum+=arr[i];
                if(i==0) {
                    maxInt[0]=arr[0];

                }if(i>0){
                    maxInt[i] = Math.max(arr[i], maxInt[i - 1]);
                }
            }

            for (int i = n-1; i >=0 ; i--) {
                if(i<n-1){
                    sum-=arr[i+1];
                }
                if(sum-maxInt[i]==maxInt[i]){
                    count++;
                }
            }


            System.out.println(count);
        }
    }
}
