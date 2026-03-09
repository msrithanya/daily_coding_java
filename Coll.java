import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Coll {
    public static void main(String[] args) {
        ArrayList<Integer> a1=new ArrayList<>();
        ArrayList<Integer> a2=new ArrayList<>();
        Coll c=new Coll();
         System.out.println(c.count());
        System.out.println(c.commonElement());
        System.out.println(c.sec());
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
    int sec(){
        ArrayList <Integer> arr1=new ArrayList<>();
        arr1.add(1);
        arr1.add(6);
        arr1.add(78);
        arr1.add(8);
        arr1.add(99);
        Collections.sort(arr1);
        Collections.reverse(arr1);
        return arr1.get(1);
    }
   List<Integer> commonElement(){
      List <Integer> l1=new ArrayList<>();
     Set<Integer> s1=new HashSet<>();
     Set<Integer> s2=new HashSet<>();
     s1.add(8);
     s1.add(2);
     s1.add(3);
     s1.add(9);
     s2.add(8);
     s2.add(1);
     s2.add(0);
     s2.add(9);
     for(int i:s1){
        if(s2.contains(i)){
            l1.add(i);
        }
     }
     return l1;
    }
    Map<Integer,Integer> count(){
         ArrayList <Integer> arr1=new ArrayList<>();
         Map<Integer,Integer> m=new HashMap<>();
        arr1.add(1);
        arr1.add(6);
        arr1.add(1);
        arr1.add(8);
        arr1.add(6);
    
        for(int i=0;i<arr1.size()-1;i++){
             int c=0;
         for(int j=0;j<arr1.size()-1;j++){
             if(arr1.get(i)==arr1.get(j)){
                c=c+1;
             }
         }
         m.put(arr1.get(i),c);
        }
        return m;
    }
}
