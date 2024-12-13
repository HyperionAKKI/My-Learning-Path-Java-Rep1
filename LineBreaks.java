import java.util.Scanner;

public class LineBreaks {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int m= sc.nextInt();
            sc.nextLine();
            int count=0;
            String[] str = new String[n];
            for (int i = 0; i < n; i++) {

                str[i]= sc.nextLine();
            }
            for (int i = 0; i < n; i++) {
                if(m- str[i].length()>=0){
                    count++;
                }
                m = m-str[i].length();

            }
            System.out.println(count);

        }
    }
}
