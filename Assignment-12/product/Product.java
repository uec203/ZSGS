package product;

abstract public class Product implements Cloneable{
    private String productName;
    private String brandName;
    private int itemID;
    private String description;
    private int price;
    private int quantity;
    
    Product(String productName, String brandname,int itemID,int price, String description,int quantity) {
        this.productName = productName;
        this.brandName = brandname;
        this.itemID = itemID;
        this.price = price;
        this.description = description;
        this.quantity = quantity;
    }

    public String getProductName(){
        return productName;
    }
    public void setProductName(String productName){
        this.productName=productName;
    }
    public String getBrandName(){
        return brandName;
    }
    public void setBrandName(String brandName){
        this.brandName=brandName;
    }
    public int getItemID(){
        return itemID;
    }
    public void setBrandName(int itemID){
        this.itemID=itemID;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public int getPrice(){
        return price;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public int getQuatity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public Object clone(){  
        try{  
            return super.clone();  
        }catch(Exception e){ 
            return null; 
        }
    }
    abstract public void displayDetails();
}
