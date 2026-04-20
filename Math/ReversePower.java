package Math;

public class ReversePower {
    public static void main(String[] args) {
         int rev=0;
    int n=12;
    int a=n;
        if(n<=9){
            rev=n;
        }else{
             while(n!=0){
            int temp=n%10;
            n=n/10;
                rev=rev*10+temp;
        }
        }
       
        System.out.println((int)Math.pow(a,rev));
    }
   
}
