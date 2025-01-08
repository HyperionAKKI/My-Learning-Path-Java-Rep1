import java.util.Scanner;

public class Sheet1 {
       static final double pi = 3.141592653;
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double a=sc.nextDouble();
        System.out.format("%.9f",a*a*pi);
    }
}
