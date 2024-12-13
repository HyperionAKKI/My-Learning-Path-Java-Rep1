import java.util.Scanner;

public class GameWin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int N = sc.nextInt();
            long K = sc.nextLong();
            long P = sc.nextLong();
            long Hved = K;
            long Hvar=P;;
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            int tall = arr[0];
            for (int i = 1; i <N ; i++) {
                if(arr[i]>tall){
                    tall=arr[i];
                }
            }
            Hved += tall;
            for (int i = 0; i < N; i++) {
                Hvar+=arr[i];

            }
            Hvar -= tall;
            if(Hvar>Hved){
                System.out.println("VARUN");
            } else if (Hved>Hvar) {
                System.out.println("VED");

            }else{
                System.out.println("EQUAL");
            }
        }
    }
}
