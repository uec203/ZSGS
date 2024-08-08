package product;

public class BookProduct extends Product{
    private String isbnNumber;
    private String authorName;
    BookProduct(String productName, String brandname,int itemID,int price, String description,int quantity, String isbnNumber,String autherName){
        super(productName, brandname, itemID, price, description,quantity);
        this.isbnNumber=isbnNumber;
        this.authorName=autherName;
    }
    public String getIsbnNumber() {
        return isbnNumber;
    }
    public void setIsbnNumber(String isbnNumber) {
        this.isbnNumber = isbnNumber;
    }
    public String getAuthorName() {
        return authorName;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    @Override
    public void displayDetails() {
        System.out.println("Product Name: " + getProductName());
        System.out.println("Brand Name: " + getBrandName());
        System.out.println("Item ID: " + getItemID());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("ISBN Number: " + getIsbnNumber());
        System.out.println("Quantity : "+ getQuatity());
        System.out.println("Author Name: " + getAuthorName());
    }

}
