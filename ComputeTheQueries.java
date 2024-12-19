import java.util.Scanner;

/*given array of n integer give Q queries and in each query given number X
print count of that number in array
Constraints
1<=N<=10^5
1<=a[i]<=10^7
1<=Q<=10^5
 */
public class ComputeTheQueries {
    static final int M = (int)1e9+7;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int k=(int)1e7+10;
        int[] hash=new int[k];
     int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
            hash[a[i]]++;
        }
        int Q=sc.nextInt();
        while (Q-->0){
            int x=sc.nextInt();
            System.out.println(hash[x]);
        }
    }
}
