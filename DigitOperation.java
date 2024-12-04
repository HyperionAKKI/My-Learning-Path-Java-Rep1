public class DigitOperation {
    private int sumofDigits;
    public Integer number;
    private int max;
    private int min;
    private String s;
    public int getSumofDigits(){
        int a=number;
        while(a!=0){
            sumofDigits+=a%10;
            a=a/10;

        }
        return this.sumofDigits;
    }
    public int getMax(){
        int num=0;
        int temp;
        int flag=number;
        while(flag!=0){
            temp=flag%10;
            if(temp>=num){
                num=temp;
            }
            flag=flag/10;


        }
        max=num;
        return this.max;
    }

public int getMin(){;
    int t=9;
    int b=number;
    int l;
    while(b!=0){
        l=b%10;
        if(l<t){
            t=l;
        }
        b/=10;
    }
    min=t;
    return this.min;
}
public String toString(){
    s=number.toString();
    return this.s;

}




}
