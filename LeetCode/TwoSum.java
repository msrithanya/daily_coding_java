package LeetCode;

public class TwoSum {
    public static void main(String[] args) {
        // Sum s=new Sum();
        int n[]={2,7,11,3};
        Sum.display(n,10);
    }
}
class Sum{
static int[] display(int nums[],int target){
for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                 int a[]={i,j};
                 return a;
            }
            }
        }
        return nums;
}
}