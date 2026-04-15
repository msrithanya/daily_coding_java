// You are given an array arr[] of non-negative integers. You have to move all the zeros in the array to the right end while maintaining the relative order of the non-zero elements. The operation must be performed in place, meaning you should not use extra space for another array.

// Examples:

// Input: arr[] = [1, 2, 0, 4, 3, 0, 5, 0]
// Output: [1, 2, 4, 3, 5, 0, 0, 0]
// Explanation: There are three 0s that are moved to the end.
package TwoPointer;

public class Allzero {
    public static void main(String[] args) {
	int arr[]={1, 2, 0, 4, 3, 0, 5, 0};
	int arr1[]=new int[arr.length];
	int j=0;
	for(int i=0;i<arr.length;i++){
	    if(arr[i]!=0){
	        arr1[j]=arr[i];
	        j++;
	    }
	}
	for(int k=j;k<arr.length;k++){
	    arr1[k]=0;
	}
	for(int a:arr1){
	    System.out.println(a);
	}
	}
}

//give optimize code
