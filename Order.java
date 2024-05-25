import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Order {
    private int customerId;
    private int orderId=0;
    private int nProducts;
    public int getnProducts() {
        return nProducts;
    }
    public void setnProducts(int nProducts) {
        if (nProducts>0)
            this.nProducts =nProducts;
        else
            this.nProducts = Math.abs(nProducts);
    }
    private product[] products;
    JFrame frame;
    private float totalPrice;
    public Order(JFrame frame,int customerId, int nProducts, float totalPrice) {
        this.customerId = customerId;
        orderId++;
        this.nProducts = nProducts;
        this.totalPrice = totalPrice;
        this. products= new product [nProducts];
        this.frame=frame;
    }
    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        if (customerId>0)
            this.customerId =customerId;
        else
            this.customerId = Math.abs(customerId);
    }
    public int getOrderId() {
        return orderId;
    }
    public void setOrderId(int orderId) {
        if (orderId>0)
            this.orderId =orderId;
        else
            this.customerId = Math.abs(customerId);
    }
    public product[] getProducts() {
        return products;
    }
    public void setProducts(product[] products) {
        this.products = products;
    }
    public float getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(float totalPrice) {
        if (totalPrice>0)
            this.totalPrice =totalPrice;
        else
            this.totalPrice = Math.abs(totalPrice);
    }
    public void printOrderInfo() {
        StringBuilder orderInfo = new StringBuilder();
        orderInfo.append("Here's your order's summary\n");
        orderInfo.append("Order Id: ").append(orderId).append("\n");
        for (int i = 0; i < nProducts; i++) {
            orderInfo.append(products[i].getName()).append(" - $").append(products[i].getPrice()).append("\n");
        }
        orderInfo.append("Total Price: $").append(totalPrice);
        JOptionPane.showMessageDialog(frame, orderInfo.toString());
    }
}