import java.util.*;

public class PQW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String n = sc.nextLine();
            StringBuilder a = new StringBuilder(n.length());
            for (int i = 0; i < n.length(); i++) {
                a.append(n.charAt(i));
            }
            for (int i = 0; i < n.length(); i++) {
                if(n.charAt(i)=='p'){
                    a.setCharAt(i,'q');
                } else if (n.charAt(i)=='q') {
                   a.setCharAt(i,'p');
                }else{
                   a.setCharAt(i,'w');
                }

            }
            System.out.println(a.reverse());
        }

    }
}
