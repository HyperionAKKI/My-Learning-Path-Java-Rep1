import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BacteriaLoverCF {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int a =Integer.parseInt(br.readLine());
            System.out.println(1 + (int) (a - Math.pow(2, (int) (Math.log(a) / Math.log(2)))));
        }
    }
}
