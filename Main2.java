import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int k = Math.max(a,b);
            int flag = 0;
            int count = 1;
            while (flag ==0){
                if((k>=a || k>=b) && (k%a==k%b) ){
                    System.out.println(k);
                    flag = 1;
                    count =1;
                }
                count +=1;
                k*=count;


            }

        }
    }
    static int gcd(int a , int b){
        return a%b == 0 ? b: gcd(b,a%b);
    }
}
