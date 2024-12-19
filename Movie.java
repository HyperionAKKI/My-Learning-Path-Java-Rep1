import java.util.*;

public class Movie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] S = new int[n];
            int[] R = new int[n];
            int max = 0;

            for (int i = 0; i < n; i++) {
                S[i] = sc.nextInt();
                R[i] = sc.nextInt();

            }
            for (int i = 0; i < n; i++) {
                if(S[i]<=x && R[i]>max){
                    max = R[i];
                }

            }
            System.out.println(max);

        }
    }
}
