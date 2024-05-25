import javax.swing.JFrame;
public class Cart {
    private int customerId;
    private int nProducts;
    private product[] products;
    JFrame frame;
    private float s=0;
    private int n=0;
    public Cart(JFrame frame,int customerId, int nProducts) {
        this.customerId = customerId;
        this.nProducts = nProducts;
        this.products=new product[Math.abs(nProducts)];
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
    public int getnProducts() {
        return nProducts;
    }
    public void setnProducts(int nProducts) {
        if (nProducts>0)
            this.nProducts =nProducts;
        else
            this.nProducts = Math.abs(nProducts);
    }
    public product[] getProducts() {
        return products;
    }
    public void setProducts(product[] products) {
        this.products = products;
    }
    public void addProduct(product o) {
// return ; }
//1 System.out.println(products.length);
        products[n]=o;
        n++;
    }
    public void removeProduct(int u) {
        for(int i=0;i<nProducts;i++){
            if( products[i].getProductId()==u)
                products[i]=null;
        }}
    public float calculatePrice(){
        for(int i=0;i<nProducts;i++){
            s+=products[i].getPrice();
        }
        return s;
    }
    public void placeOrder(int w,int customerId, int nProducts, float totalPrice,Cart r){
        if (w==1){
            Order o=new Order( frame,customerId,nProducts, totalPrice);
            for(int i=0;i<nProducts;i++){
                o.setProducts( r.getProducts( ));}
            o.printOrderInfo();}
    }}