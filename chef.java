import java.util.Arrays;
import java.util.Scanner;

public class chef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();
            long X = sc.nextLong();
            int minimum = 0;
            int sum = 0;
            int[] CoinType = new int[N];
            int[] NumberOfCoins = new int[N];
            int[] product = new int[N];
            for (int i = N - 1; i >= 0; i--) {
                CoinType[i] = sc.nextInt();

            }
            for (int j = N - 1; j >= 0; j--) {
                NumberOfCoins[j] = sc.nextInt();

            }
            for (int i = 0; i < N; i++) {
                product[i] = CoinType[i] * NumberOfCoins[i];
            }
            Integer[] pWrap = Arrays.stream(product).boxed().toArray(Integer[]::new);

        }
    }
}
