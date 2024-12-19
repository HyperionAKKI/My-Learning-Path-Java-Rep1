import java.util.Objects;
import java.util.*;
import java.lang.Math;
public class Hypot {
    public static void main(String[] args) {
//        double x;
//        double y;
//        double z;
//        Scanner input = new Scanner (System.in);
//        System.out.println("Enter the x: ");
//        x = input.nextDouble();
//        System.out.println("Enter the y: ");
//        y = input.nextDouble();
//        z=(x*x + y*y);
//        System.out.printf("%f sqred plus %f sqred's under root equal to %f",x,y,Math.sqrt(z));
//        input.close();
//        enter 3 no from user and make fn  to print avg
//        Scanner input = new Scanner(System.in);
//        int a , b , c ;
//        a =input.nextInt();
//        b =input.nextInt();
//        c = input.nextInt();
//        int avg = (a+b+c)/3;
//        System.out.println(avg);
//        function to print sum of odd numbers
//        System.out.println( sum(5));

//    static int sum(int n){
//        int sum = 0;
//        for(int i=1;i<=n;i+=2){
//
//            sum = sum+i;
//        }
//        return sum;
//       System.out.println(greatest(5,3));
//        do {
//            System.out.println("helloworld");
//        }while (true);
//        int P=0 , N=0 , Z=0;
//        Scanner sc = new Scanner(System.in);
//        while(true) {
//
//            System.out.println("press 0 to exit 1 to continue ");
//            int n=sc.nextInt();
//            if (n==1) {
//                System.out.println("enter any Number");
//                int ip = sc.nextInt();
//                if (ip>0){
//                    P++;
//            } else if (ip<0) {
//                    N++;
//                }
//                else{
//                    Z++;
//                }
//
//            }
//            if(n==0) {
//                System.out.println("Positive- " + P + "Negative- " + N + "Zero- " + Z);
//                break;
//            }

//        int n=5;
//        int pos=2;
//        int bitmask = 1<<pos;
//        int newnum=n-bitmask;
//        System.out.println(newnum)
//      Scanner sc = new Scanner(System.in);
//      int m = sc.nextInt();
//      int n = sc.nextInt();
//      int sum = (m*(m-1)/2)  + (n*(n-1)/2);
//      System.out.println(sum);
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            System.out.println(path_find(n, m));
        }
    }
static int path_find(int n , int m){
        if(n==1||m==1){
            return 1;
        }else{
            return path_find(n,m-1)+path_find(n-1,m);
        }
}

}

//    static int greatest(int a , int b){
//        int big=0;
//        if (a>b){
//            big=a;
//        }
//        else if (b>a) {
//            big=b;
//
//        }
//        return big;
//    }

