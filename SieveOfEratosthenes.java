import java.util.Arrays;
import java.util.Scanner;

public class SieveOfEratosthenes {//finds theprime untill the given number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number upto which u want all primes listed"+"\n");
        int n = sc.nextInt();
        boolean[] prime = sieveOfEratosthenes(n);

    }
    static boolean[] sieveOfEratosthenes(int n){
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime ,true);
        isPrime[0]=false;
        isPrime[1]=false;
        for (int i = 2; i*i <= n ; i++) {
            for (int j = 2*i; j <=n ; j+=i) {
                isPrime[j]=false;
            }
        }

        return isPrime;
    }
}
