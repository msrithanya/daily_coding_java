import java.util.ArrayList;

public class Coll {
    public static void main(String[] args) {
        ArrayList<Integer> a1=new ArrayList<>();
        ArrayList<Integer> a2=new ArrayList<>();
        a1.add(1);
        a1.add(2);
         a1.add(7);
        a1.add(3);
        a1.add(7);
           a1.add(1);
       for(int i=0;i<a1.size();i++){
         int a=a1.get(i);
         if(a2.contains(a)){
            continue;
         }
         else{
            a2.add(a);
         }
       }
         System.out.println(a2);
    }
}
