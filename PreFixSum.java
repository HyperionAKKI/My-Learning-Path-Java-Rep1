import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.lang.*;

/*
Given array a of an integers given Q Queries and in each query given L and R. enter.
Print sum of array elements from index L2 are both included.
Constraints.
1<=N<=10^5
1<=a[i]<=10^9
1<=Q<=10^5
1<=L,R<=N
 */
public class PreFixSum {
    static PrintWriter out;
    static FasterReader in;
    public static void main(String[] args) {
        in = new FasterReader();
        out = new PrintWriter(System.out);
        int t =in.nextInt();
        in.nextLine();
        while(t-->0){
            String s = in.nextLine();

        }
        out.flush();
    }
}
class FasterReader {
    BufferedReader br;
    StringTokenizer st;
    public FasterReader() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }
    String next(){
        while (st ==null || !st.hasMoreElements()){
            try{
                st = new StringTokenizer(br.readLine());
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }
    int nextInt(){
        return Integer.parseInt(next());
    }
    long nextLong(){
        return Long.parseLong(next());
    }
    double nextDouble(){
        return Double.parseDouble(next());
    }
    String nextLine(){
        String str ="";
        try{
            str = br.readLine();
        }catch(IOException e) {
           e.printStackTrace();
        }
        return str;
    }
}
