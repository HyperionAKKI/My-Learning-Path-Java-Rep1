import java.util.regex.Matcher;
public class RegexInJava {
    public static void main(String[] args) {
        String t = "Hello Akki123@";
        boolean has = t.matches(".*\\d.*");
    }
}
