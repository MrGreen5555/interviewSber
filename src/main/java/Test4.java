import java.util.ArrayList;
import java.util.List;

public class Test4 {
    public static void main(String []args) {
      try {
          List list = new ArrayList();

          list.add("Hello");
          String text = list.get(0) + ", world!234";
          System.out.print(text);
      }
      catch (Exception e) {
          System.out.println("Exeption9999");
      }
    }
}
