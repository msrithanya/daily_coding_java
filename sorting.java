import java.util.ArrayList;
import java.util.Collections;
public class sorting {
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 5, 4, 7, 10};
        ArrayList<Integer> odd=new ArrayList<>();
           ArrayList<Integer> even=new ArrayList<>();
       for(int a:arr){
            if(a%2==0){
                even.add(a);
            }
            else{
                odd.add(a);
            }
       }
        Collections.sort(even);
        Collections.sort(odd);
        Collections.reverse(odd);
        odd.addAll(even);
        System.out.println(odd);
    }
}
