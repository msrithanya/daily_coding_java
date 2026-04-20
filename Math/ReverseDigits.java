package Math;

public class ReverseDigits {
  public static void main(String[] args) {
    int rev=0;
    int n=122;
        while(n!=0){
            int temp=n%10;
            n=n/10;
            if(temp!=0){
                rev=rev*10+temp;
            }
        }
        System.out.println(rev);
  }  
}
