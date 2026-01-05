import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class Need {
    public static void main(String[] args) {
        int[]arr={5,5,4,4,6,4};
    int[] temp=arr;
    int c=0;
    int max_index=0;
    int max_value=0;
    ArrayList<Integer> frequency=new ArrayList();
    ArrayList<Integer> value=new ArrayList();
    ArrayList<Integer> result=new ArrayList();
    for(int i=0;i<arr.length-1;i++){
        if(c!=0){
            frequency.add(c);
            value.add(arr[i-1]);
              
        c=0;
        }
            for(int j=i+1;j<arr.length;j++){
           if(arr[i]==temp[j]){
               if(c==0){
                  c=c+2; 
               }
               else{
                   c=c+1;
               }
           }
       } 
        
    }
    int min=Collections.min(frequency);
    int max=Collections.max(frequency);
    if(min==max){
       Arrays.sort(arr);
 
    for(int a:arr){
      result.add(a);
    }
    }
    else{
        for(int i=0;i<frequency.size();i++){
        if(arr[i]==max){
           max_index=i; 
        }
        }
         max_value=value.get(max_index);
    while(max!=0){
        result.add(max_value);
        max--;
    }
    for(int a:arr){
        if(max_value!=a){
            result.add(a);
        }
    }
    }
     System.out.println(result); 
    
    }
}
