import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        String word = "word";
        List<String> stringList = new ArrayList<>();
        String text1 = "Hello there";
        String text2 = "Hello there";
        String text3 = text1;
        String text4 = new String("Hello there");
        if (text1.equals(text2)) {
            System.out.println("text1 matches text2");
        }
        if (text1 == text2) {
            System.out.println("text1 matches2 text2");
        }
        if (text2 == text3) {
            System.out.println("text2 matches3 text3");
        }
        if (text4 == text2) {
            System.out.println("text2 matches4 text3");
        }
    }
}
