@FunctionalInterface
interface Interface {
    public void dis();
}
public class Functionalinterface{
    public static void main(String[] args) {
        Interface c=()->{
            System.out.println("heyyyy");
        };
        c.dis();
    }
}