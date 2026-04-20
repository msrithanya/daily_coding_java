package Math;

public class CountDigits {
    public static void main(String[] args) {
        int n=12;
        int total=n;
        int count=0;
        while(n!=0){
            int t=n%10;
            n=n/10;
            if(t != 0 && total % t == 0){
                count=count+1;
            }
        }
        System.out.println(count);
    }
}
