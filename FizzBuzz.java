import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> a= new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if(i%3 == 0 && i%5==0) {
                a.add("FizzBuzz");
            }
            else if(i%3==0){
                a.add("Fizz");
            }else if(i%5==0){
                a.add("Buzz");
            }else{
                a.add(Integer.toString(i));
            }

        }
        for (int i = 0; i < n; i++) {
            System.out.print(a.get(i) + " ");

        }
    }
}
