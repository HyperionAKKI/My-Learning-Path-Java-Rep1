import java.util.HashSet;
import java.util.Scanner;

public class ChefAndLibrary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n =sc.nextInt();
            int[] arr = new int[n+1];
            int sum =0;
            HashSet<Integer> contains = new HashSet<>();
            for (int i = 1; i < n+1; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = n; i >=1 ; i--) {
                if(!contains.contains(arr[i])){
                    sum+=i;
                    contains.add(arr[i]);
                }
            }


            System.out.println(sum);
        }
    }
}
