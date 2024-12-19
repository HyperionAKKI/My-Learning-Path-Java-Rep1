import java.util.Scanner;

public class MonkeyClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int m = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int ans=0;
            if(a<=m){
                ans +=a;
                if(c>=(m-a)){
                    ans+=(m-a);
                    c-=(m-a);
                }else{
                    ans+=c;
                    c=0;
                }
            }if(b<=m){
                ans+=b;
                if(c>=(m-b)){
                    ans+=(m-b);
                }else{
                    ans+=c;
                }
            }
            if(a>m){
                ans+=m;
            }if(b>m){
                ans+=m;
            }
            System.out.println(ans);

        }
    }
}
