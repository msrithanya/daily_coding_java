import java.util.ArrayList;

public class FirstRepeat {
    int arr1[]={10, 20, 10, 30, 20, 40};
        ArrayList<Integer> arr=new ArrayList<>();
    public static void main(String[] args) {
        FirstRepeat obj=new FirstRepeat();
        System.out.println(obj.first());
    }
       int first(){
       for(int a:arr1){
        arr.add(a);
       if(arr.contains(a)){
               return a;
            }
        }
     return 0;
        }
}
