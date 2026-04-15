package TwoPointer;

public class Singleelement {
    public static void main(String[] args) {
        int nums[]={1,1,2,3,3,4,4,8,8};
        int i=0,j=1;
   while(j<nums.length-1){
       if(nums[i]!=nums[j]){
          System.out.println(nums[i]);
          
       }
       i=i+2;
       j=j+2;
   }
     System.out.println(nums[i]);
    }
}
