public class Dependency_injection {
    public static void main(String[] args) {
      PaymentMethod p=new CreditCardPayment();
      PaymentService p1=new PaymentService(p);
      p1.payment(500);
    }
}

interface PaymentMethod {
    void pay(double amount);
}

class CreditCardPayment implements PaymentMethod{
    public void pay(double amount){
        System.out.println("paid "+amount+" using Credit Card");
    }
}
class UpiPayment implements PaymentMethod{
    public void pay(double amount){
        System.out.println("paid "+amount+" using UPI");
    }
}
class PaymentService {
    PaymentMethod p;
    PaymentService(PaymentMethod p){
        this.p=p;
    }
      public void payment(double amount){
        p.pay(amount);
      }
}
