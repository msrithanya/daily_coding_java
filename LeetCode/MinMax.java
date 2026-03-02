package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class MinMax {
    public static void main(String[] args) {
        MinMax c=new MinMax();
        int arr[]={1,2,3,4};
        c.getMinMax(arr);
    }
      public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        Arrays.sort(arr);
        ArrayList<Integer> l=new ArrayList<>();
        l.add(arr[0]);
        l.add(arr[arr.length-1]);
        return l;
        
    }
}
