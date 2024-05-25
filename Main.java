import java.awt.Color;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        ElectronicProduct e1=new ElectronicProduct(1,"smart phone", 599.9f,"samsung",1);
        ClothingProduct c1=new ClothingProduct(2,"T-shirt",19.9f,"Medium","Cotton");
        BookProduct p1=new BookProduct(3,"opp",39.99f, "O’Reilly","X Publications");
        JFrame frame=new JFrame();
        frame.setTitle("Ecommerce System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,1000);
        frame.setResizable(false);
        ImageIcon image = new ImageIcon("5.jfif");
        frame.setIconImage(image.getImage());
        frame.setVisible(true);
        frame.getContentPane().setBackground ( new Color(150,200,255));
        frame.setLayout(null);
        JOptionPane.showMessageDialog(frame, "welcome to E-commerce System!");
        int id;
        while(true) { id =Integer.parseInt(JOptionPane.showInputDialog(frame, "please enter your id"));
            if(id!=0)break;}
        String name;
        while(true) {
            name=JOptionPane.showInputDialog(frame, "please enter your name");
            String str = null;
            if (name != null) {
                break;
            }
        }
        String address;
        while(true) {
            address=JOptionPane.showInputDialog(frame, "please enter your address");
            String str = null;
            if (address!= null) {
                break;
            }
        }
        Customer co=new Customer(id,name,address);


        int nProducts =Integer.parseInt(JOptionPane.showInputDialog(frame, "How many products you want to add to your cart?"));
        nProducts= Math.abs(nProducts);
        Cart car=new Cart(frame,id,nProducts);
        for (int i=0;i<nProducts;i++){
            int p_id =Integer.parseInt(JOptionPane.showInputDialog(frame, "which product would you like to buy "+e1.getProductId()+
                    "-"+e1.getName()+" "+c1.getProductId()+
                    "-"+c1.getName()+" "+p1.getProductId()+
                    "-"+p1.getName()));
//System.out.println(car.getnProducts());
            if( p_id ==e1.getProductId())
                car.addProduct(e1);
            else if ( p_id ==c1.getProductId())
                car.addProduct(c1);
            else if ( p_id ==p1.getProductId())
                car.addProduct(p1);
            else
            { JOptionPane.showMessageDialog(frame, "invalid choice");
                i--;
            }
        }
        float total=car.calculatePrice() ;
        int decision=Integer.parseInt(JOptionPane.showInputDialog(frame, "your total price is $"+total+". would you like to blace the order? 1- Yes 2-No"));
        car.placeOrder(decision,id,nProducts,total,car);
    }}