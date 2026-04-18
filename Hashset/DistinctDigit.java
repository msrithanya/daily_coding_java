package Hashset;

import java.util.HashSet;

public class DistinctDigit {
    public static void main(String args){
        int nums[]={131,44,5};
        int i=0;
        HashSet<Integer> s=new HashSet<>();
        while(i<nums.length){
            int j=0;
            String e=String.valueOf(nums[i]);
            while(j<e.length()){
                 int v = Integer.parseInt(String.valueOf(e.charAt(j)));
                s.add(v);
                j++;
            }
            i++;
        }
        int arr[]=new int[s.size()];
        int k=0;
      for (int val : s) {
            arr[k]=val;
            k++;
            
        }
      System.out.println(s);
    }
}
