package product;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Product> cart;
    private DataBase DB;

    public ArrayList<Product> getCart() {
        return cart;
    }

    public void setCart(ArrayList<Product> cart) {
        this.cart = cart;
    }

    public DataBase getDB() {
        return DB;
    }

    public void setDB(DataBase dB) {
        DB = dB;
    }

    ShoppingCart(){
        cart = new ArrayList<>();
        DB = new DataBase();
    }

    public void addProductToCart(int itemID,int quantity) throws CloneNotSupportedException{
        Product p = DB.getProduct(itemID);
        if(p.getQuatity()>=quantity){
            p.setQuantity(p.getQuatity()-quantity);
            Product q = (Product)p.clone();
            q.setQuantity(quantity);
            cart.add(q);
        }
    }
    public void removeProductFromCart(int itemID,int n) {
        for(Product p : cart){
            if(p.getItemID()==itemID && n==0){
                cart.remove((Product)p);
                break;
            }
            else if(p.getItemID()==itemID){
                n--;
            }
        }
    }
    public void showDetails(){
        System.out.println("-----------------------------");
        for(Product p : cart){
            p.displayDetails();
            System.out.println("-----------------------------");
        }
    }
    public void checkout(){
        int amount = 0;
        for(Product p : cart){
            amount+=p.getQuatity()*p.getPrice();
        }
        System.out.println("The Total Amount is "+amount);
        System.out.println("Are you sure to checkout:YES OR NO : ");
        boolean decision = (Main.sc.next().toLowerCase().equals("yes"));
        if(decision){
            cart = new ArrayList<Product>();
            System.out.println("Purchase is successfull");
        }
        else{
            System.out.print("Transcation is Declined");
        }
    }
}
