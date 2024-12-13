public class ChefMovieIMDB {
    public static void main(String[] args) {
        String s = "hello";
        OneToN(1,6);
    }
    static void OneToN(int s,int n){
        if(s==n+1){
            return;
        }
        System.out.println(s);
        OneToN(s+1,n);
    }
}
