package TwoPointer;

public class RemoveDuplicate {
    public static void main(String[] args) {
		int arr[]={1,2,2,3,5,5,7};
		int j=0;
		for(int i=1;i<arr.length;i++){
		    if(arr[j]!=arr[i]){
		        j++;
		        arr[j]=arr[i];
		    }
		}
		for(int k=0;k<=j;k++){
		    System.out.print(arr[k]);
		}
	}
}
