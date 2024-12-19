import java.util.Scanner;

public class InsaneProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            long k = sc.nextLong();
            long l1 = sc.nextLong();
            long r1 = sc.nextLong();
            long l2 = sc.nextLong();
            long r2 = sc.nextLong();
            long count =0;
            for (long i = l1; i <=r1 ; i++) {
                for (long j = l2; j <=r2 ; j++) {
                    if(j%i==0) {
                        if ((j / i) % k == 0) {
                            count++;
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }
}
