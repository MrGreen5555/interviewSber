import java.util.ArrayList;
import java.util.List;

public class Test5 {
    public static void main(String []args){
        List list = new ArrayList();
        list.add("Hello!");
        list.add(123);
        for (Object str : list) {
            System.out.println((String)str);
        }
    }
}
