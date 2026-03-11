public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {
        Demo obj=new Demo();
        obj.start();//without join print 0
        obj.join();//with join print 100 because join() method used to wait until the thread completed
        System.out.println(obj.n);
    }
}
class Demo extends Thread{
    int n;
    public void run(){
        do{
                n++;
        }while(n<100);
    }
}