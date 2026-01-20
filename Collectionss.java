import java.util.ArrayList;

public class Collectionss {
    public static void main(String[] args) {
        ArrayList<Integer> a1=new ArrayList<>();
        ArrayList<Integer> a2=new ArrayList<>();
        a1.add(1);
         a1.add(2);
          a1.add(3);
          a2.addAll(a1);
          System.out.println(a2);
    }
}
