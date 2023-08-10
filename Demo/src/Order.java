public class Order {

    int orderId;

    String orderName;

    String orderType;

    int orderPrice;

    public Order() {
    }

    public Order(int orderId, String orderName, String orderType, int orderPrice) {
        this.orderId = orderId;
        this.orderName = orderName;
        this.orderType = orderType;
        this.orderPrice = orderPrice;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public int getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(int orderPrice) {
        this.orderPrice = orderPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderName='" + orderName + '\'' +
                ", orderType='" + orderType + '\'' +
                ", orderPrice=" + orderPrice +
                '}';
    }
}
