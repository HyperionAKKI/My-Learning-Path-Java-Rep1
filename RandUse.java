import java.util.Random;
public class RandUse {
    public static void main(String[] args){
        Random random =new Random();
         //these are not  true random numb but pseudo random number
        int x = random.nextInt(100)+1;
        double y = random.nextDouble(100)+1;
        System.out.println(x);
        System.out.println(y);

    }
}
