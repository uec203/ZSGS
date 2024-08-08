package product;

public class ElectronicProduct extends Product{
    private int warrantyPeriod;
    ElectronicProduct(String productName, String brandname,int itemID,int price, String description,int quantity,int warrantyPeriod){
        super(productName, brandname, itemID, price, description,quantity);
        this.warrantyPeriod=warrantyPeriod;
    }
    public void setWarrantyPeriod(int warrantyPeriod){
        this.warrantyPeriod=warrantyPeriod;
    }
    public int getWarrantyPeriod(){
        return warrantyPeriod;
    }
    @Override
    public void displayDetails() {
        System.out.println("Product Name: " + getProductName());
        System.out.println("Brand Name: " + getBrandName());
        System.out.println("Item ID: " + getItemID());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Quantity : "+ getQuatity());
        System.out.println("Warranty Period: " + getWarrantyPeriod() + " years");
    }

}
