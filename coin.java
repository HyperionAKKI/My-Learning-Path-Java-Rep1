import java.util.Scanner;

public class coin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int N = sc.nextInt();
            int K = sc.nextInt();
            if(K>=N/2 && K < (N+1)/2){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
