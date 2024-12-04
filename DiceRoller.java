import java.util.Random;

public class DiceRoller {
    Random rand = new Random();
    int rolled = 0;

    DiceRoller() {

        roll(); //ya toh as arguments pass kro to use local variable in a constructor outside class(cant use) ya fir make them global
    }

    void roll() {
        int roll = rand.nextInt(6) + 1;
        System.out.println(roll);
    }
}