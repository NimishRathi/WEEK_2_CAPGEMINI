package level01;

// Base class
class Order {
    private int orderId;
    private String orderDate;

    public Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order placed";
    }

    public int getOrderId() {
        return orderId;
    }
}

// Subclass: ShippedOrder
class ShippedOrder extends Order {
    private String trackingNumber;

    public ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Order shipped";
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }
}

// Subclass: DeliveredOrder
class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;

    public DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Order delivered";
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }
}
public class OnlineRetailManagement {
    public static void main(String[] args) {
        // Base class object
        Order order = new Order(1, "2025-01-24");
        System.out.println("Order ID: " + order.getOrderId() + ", Status: " + order.getOrderStatus());

        // ShippedOrder object
        ShippedOrder shippedOrder = new ShippedOrder(2, "2025-01-23", "TRACK12345");
        System.out.println("Order ID: " + shippedOrder.getOrderId() + ", Status: " + shippedOrder.getOrderStatus() +
                ", Tracking: " + shippedOrder.getTrackingNumber());

        // DeliveredOrder object
        DeliveredOrder deliveredOrder = new DeliveredOrder(3, "2025-01-22", "TRACK67890", "2025-01-24");
        System.out.println("Order ID: " + deliveredOrder.getOrderId() + ", Status: " + deliveredOrder.getOrderStatus() +
                ", Delivered On: " + deliveredOrder.getDeliveryDate());
    }
}
