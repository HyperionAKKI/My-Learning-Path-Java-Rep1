import java.util.Scanner;

public class CountBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t-->0){
            int N =sc.nextInt();
            sc.nextLine();
            String S = sc.nextLine();
            String T = sc.nextLine();
            int countS=0;
            int countT=0;
            for (int i = 0; i < N; i++) {
                if(S.charAt(i)=='1'){
                    countS++;
                }

            }
            for (int i = 0; i < N; i++) {
                if(T.charAt(i)=='1'){
                    countT++;
                }
            }
            if(Math.abs(countS-countT)%2 !=0){
                System.out.println("NO");
            }else {
                System.out.println("YES");
            }

        }
    }
}
