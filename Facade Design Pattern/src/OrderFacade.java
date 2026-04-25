public class OrderFacade {
    private final InventoryService inventoryService;
    private final PaymentService paymentService;
    private final ShippingService shippingService;
    private final NotificationService notificationService;

    public OrderFacade() {
        this.inventoryService = new InventoryService();
        this.paymentService = new PaymentService();
        this.shippingService = new ShippingService();
        this.notificationService = new NotificationService();
    }

    // The simplified method for the client
    public boolean placeOrder(String productId, String accountId, double amount) {
        System.out.println("=== Starting Order Process ===");

        if (!inventoryService.checkStock(productId)) {
            System.out.println("Order failed: Out of stock.");
            return false;
        }

        if (!paymentService.processPayment(accountId, amount)) {
            System.out.println("Order failed: Payment rejected.");
            return false;
        }

        shippingService.createShippingLabel(productId);
        notificationService.sendOrderConfirmation(accountId);

        System.out.println("=== Order Process Completed Successfully ===");
        return true;
    }
}
