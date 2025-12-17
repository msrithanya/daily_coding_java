import java.util.Scanner;
public class Diamond{
    public static void main(String[] args){
       Scanner s=new Scanner(System.in);
       System.out.println("Enter any number");
       int limit=s.nextInt();
       for(int i=limit;i>=1;i--){
        for(int j=1;j<=limit;j++){
          if(j>=i){
            System.out.print("* ");
          }
          else{
             System.out.print(" ");
          }
        }
            System.out.println("");
       }
       for(int i=1;i<=limit;i++){
        for(int j=1;j<=limit;j++){
          if(j>=i){
            System.out.print("* ");
          }
          else{
             System.out.print(" ");
          }
        }
            System.out.println("");
       }
    }
    void dis(){
        System.out.println("from diamond class");
    }
}