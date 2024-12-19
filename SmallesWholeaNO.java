import java.util.Scanner;

public class SmallesWholeaNO {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            long n = sc.nextLong();
            long k = sc.nextLong();
            if(k==0){
                System.out.println(n);
            }else{
                System.out.println(n%k);
            }
        }

    }
}
