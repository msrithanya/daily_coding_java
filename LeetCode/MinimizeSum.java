package LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinimizeSum {
    public static void main(String[] args) {
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
         arr1.add(1);
          arr1.add(3);
           arr1.add(8);
            arr2.add(1);
          arr2.add(3);
           arr2.add(8);
         Collections.sort(arr1);
        Collections.sort(arr2);
        Collections.reverse(arr2);
        long sum=0;
        int i=0;
        while(i<arr1.size()){
            sum=sum+(arr1.get(i)*arr2.get(i));
            i++;
        }
        
        System.out.println(sum);
    }
}
//