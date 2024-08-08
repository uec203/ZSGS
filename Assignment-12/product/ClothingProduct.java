package product;

public class ClothingProduct extends Product{
    private String size;
    private String color;
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    ClothingProduct(String productName, String brandname,int itemID,int price, String description,int quantity,String size,String color){
        super(productName, brandname, itemID, price, description,quantity);
        this.size=size;
        this.color=color;
    }
    @Override
    public void displayDetails() {
        System.out.println("Product Name: " + getProductName());
        System.out.println("Brand Name: " + getBrandName());
        System.out.println("Item ID: " + getItemID());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Quantity : "+ getQuatity());
        System.out.println("Size: " + getSize());
        System.out.println("Color: " + getColor());
    }
    
}
