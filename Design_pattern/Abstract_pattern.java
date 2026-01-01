package Design_pattern;

public class Abstract_pattern {
    public static void main(String[] args) {
        UiFactory ui=new Darktheme();
        ui.button();
        ui.check();

    }
}
interface UiFactory{
    void button();
    void check();
}
class Darktheme implements UiFactory{
    public void button(){
        System.out.println("darkbutton");
    }
    public void check(){
      System.out.println("darkcheck");
    }
}
class Lighttheme implements UiFactory{
    public void button(){
        System.out.println("Lightbutton");
    }
    public void check(){
      System.out.println("Lightcheck");
    }
}