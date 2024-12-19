import java.util.Scanner;
/* Ques is to find the factorial of a given number for t test cases untill given integer n alsoto its modulo m
use the limits as 1<=N<=10^5
use the limits as 1<=T<=10^5
M=1e9+7
 */
public class CPFact {
       static final int m = (int)1e9+7;
       static final int n1 = (int)1e5+7;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        long[] PreCom = new long[n1];
        PreCom[0]=1;
        PreCom[1]=1;
        for (int i = 2; i < n1; i++) {
            PreCom[i]=PreCom[i-1]*i%m;
        }
        while(t-->0){
            int n = sc.nextInt();
            for(int i = 0 ; i<=n;i++){
                System.out.println(PreCom[i]);
            }
        }
    }
}
