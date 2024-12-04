import java.util.ArrayList;
import java.util.Collections;

public class DigitsOperation {
    private Integer num;
    private ArrayList<Integer> digits ;
    private Integer sum =0;

    public DigitsOperation(int number){
        this.num = number;
        this.digits = new ArrayList<Integer>();
        while(number!=0){
            this.sum = this.sum +number%10;
            this.digits.add(number%10);
            number = number/10;
        }
    }

    public int getSumOfDigits(){
        return this.sum;
    }

    public int getMaxDigit(){
        return Collections.max(digits);
    }

    public int getMinDigit(){
        return Collections.min(digits);
    }


    public String numberToString() {
        return this.num.toString();
    }
}
