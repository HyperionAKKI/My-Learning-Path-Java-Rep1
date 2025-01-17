import java.util.Locale;
import java.util.Scanner;

public class PairSumTrgt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a =sc.nextLine();

        System.out.println(isPalindrome(a));
    }
    public static boolean isPalindrome(String s){
        String newS =CreateAsmallCaseString(s);
        int r=newS.length()-1;
        for (int i = 0; i < newS.length(); i++) {
            if(i>=r){
                return true;
            }
            if(newS.charAt(i)==newS.charAt(r)){
                r--;
            }else{return false;}
        }
        return true;
    }
    public static String CreateAsmallCaseString(String s){
        char[] arr=new char[26];
        char k=97;
        StringBuilder l=new StringBuilder();
        for (int i = 0; i < 26; i++) {
            arr[i]= k;
            k++;
        }
        for (int i = 0; i < s.length(); i++) {
            if( s.charAt(i) - 65 <26 &&  s.charAt(i) - 65 >=0 ){
                l.append(arr[s.charAt(i) - 65]);
            }if(s.charAt(i) <=122 && s.charAt(i)>=97){
                l.append(s.charAt(i));
            }if(s.charAt(i) <=57 && s.charAt(i)>=48){
                l.append(s.charAt(i));}
        }
        return l.toString();
    }
}
