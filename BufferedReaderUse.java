import java.util.*;
import java.io.*;
public class BufferedReaderUse {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Read the number of test cases
        int T = Integer.parseInt(br.readLine());
        StringBuilder result = new StringBuilder();

        while (T-- > 0) {
            // Read N and X
            String[] line1 = br.readLine().split(" ");
            int N = Integer.parseInt(line1[0]);
            long X = Long.parseLong(line1[1]);

            // Read array A (coin values)
            int[] A = new int[N];
            String[] line2 = br.readLine().split(" ");
            for (int i = 0; i < N; i++) {
                A[i] = Integer.parseInt(line2[i]);
            }

            // Read array B (coin counts)
            int[] B = new int[N];
            String[] line3 = br.readLine().split(" ");
            for (int i = 0; i < N; i++) {
                B[i] = Integer.parseInt(line3[i]);
            }

            // Calculate the result for this test case
            result.append(findAns(A, B, N, X)).append("\n");
        }

        // Print all results at once
        System.out.print(result);
    }

    private static long findAns(int[] A, int[] B, int N, long X) {
        long[] totalCoins = new long[N];
        for (int i = 0; i < N; i++) {
            totalCoins[i] = (long) A[i] * B[i];
            if (totalCoins[i] >= X) {
                return 1;
            }
        }
        Arrays.sort(totalCoins);
        long total = 0;
        long count = 0;
        for (int i = N - 1; i >= 0; i--) {
            total += totalCoins[i];
            count++;
            if (total >= X) {
                return count;
            }
        }

        return -1;
    }
}
