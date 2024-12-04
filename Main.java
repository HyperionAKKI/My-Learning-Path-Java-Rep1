import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t, n, k;
        t = sc.nextInt();
        while (t--> 0) {
            n = sc.nextInt();
            k = sc.nextInt();
            int max = 12*n;
            int min = 10*n;
            if (k < max && k > min) {
                int excess = k - min;
                if (excess <= n * 2 && excess >= 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }

            } else {
                System.out.println("NO");
            }

        }

    }
}