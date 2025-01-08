import java.util.*;
import java.lang.*;
import java.io.*;
public class ChefandStock {

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            double s = sc.nextDouble();
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            double newS;
            newS = s + (c/100)*s;
            if(newS>=a && newS<=b){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }

    }
}
