import java.util.ArrayList;

public class Duplicate {
    public static void main(String[] args) {
        int arr1[]={10, 20, 10, 30, 20, 40};
        ArrayList<Integer> arr=new ArrayList<>(); 
        for(int a:arr1){
            if(!arr.contains(a)){
               arr.add(a);
            }
        }
System.out.println(arr);
    }
}
