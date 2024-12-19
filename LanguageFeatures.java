import java.util.Scanner;

public class LanguageFeatures {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int[] x = new int[6];
            for(int i =0 ; i<6;i++){
                x[i] = sc.nextInt();
            }
            if((x[0]==x[2]||x[0]==x[3])&&(x[1]==x[2]||x[1]==x[3]) ){
                System.out.println(1);
            } else if ((x[0]==x[4]||x[0]==x[5])&&(x[1]==x[4]||x[1]==x[5])) {
                System.out.println(2);
            }else{
                System.out.println(0);
            }
        }
    }
}
