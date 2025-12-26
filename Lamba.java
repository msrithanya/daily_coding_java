import java.util.Scanner;
public class Lamba {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter your name");
        String name=s.nextLine();
        InnerLamba obj=(n)->{
            if(n.length()>=5){
             return "true";
            }
            else{
                return "false";
            }
        };
        System.out.println(obj.check(name));
    }
}
@FunctionalInterface
interface InnerLamba {
public String check(String name);
    
}
