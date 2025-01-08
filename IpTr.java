import java.util.Collections;
import java.util.Scanner;

import static java.lang.Integer.MAX_VALUE;

public class IpTr {

    public static void main(String[] args) {


    }
    static int EuclidsRec(int a,int b){
        if(b==0){
            return a;
        }
        return EuclidsRec(b,a%b);

    }
    static int reverse(int x) {
        long newX=0;
        int sign =0;
        if(x<0){
            x = -x;
            sign =1;
        }
        while(x>0){
            int digit =x%10;
            newX = newX*(10)+digit;
            x/=10;
        }
        if(sign==1){
            newX = -newX;
        }
        if(newX>Integer.MAX_VALUE || newX<Integer.MIN_VALUE){
            return 0;
        }
        return (int) newX;
    }
    static boolean isPalindrome(int x){
        boolean isNegative = x<0;
        if(isNegative){
            return false;
        }
        String s = Integer.toString(Math.abs(x));
        StringBuilder ab =new StringBuilder(s).reverse();
        return ab.toString().equals(s);
    }
}
