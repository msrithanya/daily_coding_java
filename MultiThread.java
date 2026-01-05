public class MultiThread{
    public static void main(String[] args) {
        A obj1=new A();

        B obj2=new B();
        Thread b1=new Thread(obj2);
        obj1.start();
        b1.start();
    }
}
class A extends Thread{ //Thread type
   public void run(){
        for(int i=0;i<10;i++){
            System.out.println("A");
        }
    }
}
class B implements Runnable{ //Runnable Type we do this to archieve multiple inheritance
  public  void run(){
        for(int i=0;i<5;i++){
            System.out.println("B");
        }
    }
}
