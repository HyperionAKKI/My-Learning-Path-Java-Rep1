import java.util.Scanner;

public class arraysOFCodeChef {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        float c=sc.nextFloat();
        int t=sc.nextInt();
        while(t-->0){
            int l =sc.nextInt();
            int r =sc.nextInt();
            if(l==r){
                System.out.println(1);
            }else{
                long s = (long) r-l +1;
                long p = (s/2)*(s-1);
                System.out.println(p + s);
            }
        }
    }
}
