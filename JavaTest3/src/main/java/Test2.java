import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) throws Exception {
        String word = "word";

        try {
        List<String> stringList2 = new ArrayList<>();
        throw  new FileNotFoundException();

        } catch (RuntimeException e) {
          System.out.println("Exeption1");
            System.exit(2);
        } catch (IOException e) {
            System.out.println("Exeption2");
            System.exit(1);
        }
        finally {
           System.out.println("Finally!");
        }
        System.out.println("Error");
    }
}
