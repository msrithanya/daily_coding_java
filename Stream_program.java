// 🟢 Level 1 (Easy)
// Q1. Print all numbers greater than 5

import java.util.ArrayList;
import java.util.stream.Stream;

public class Stream_program {
    static ArrayList <Integer> a1=new ArrayList<>();
    public static void main(String[] args) {
        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(4);
        a1.add(6);
     Stream<Integer> s1=a1.stream();
      Stream<Integer> a =s1.filter(n->n%2==0);
      a.forEach(n->System.out.println(n));
    Easy.square();
    }
}
// 🟢 Level 1 (Easy)
// Q2. square all number
class Easy{
   static Stream<Integer> s1=Stream_program.a1.stream();
   public static void square(){
    Stream p=s1.map(n->n*2);
    p.forEach(n->System.out.println(n));
   }
}