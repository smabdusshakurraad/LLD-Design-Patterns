public class PaymentService {
    public boolean processPayment(String accountId, double amount){
        System.out.println("Processing payment of $" + amount + "for account " + accountId);
        return true;
    }
}
