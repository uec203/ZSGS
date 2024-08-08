package product;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
        private List<Product> products;
        private Product p;

        DataBase() {
                products = new ArrayList<Product>();
                String[] productName = { "The Great Gatsby", "1984", "To Kill a Mockingbird", "Pride and Prejudice",
                                "Moby Rick" };
                String[] brandName = { "Scribner", "Secker & Warburg", "J.B. Lippincott & Co.", "T. Egerton",
                                "Harper & Brothers" };
                int[] itemID = { 101, 102, 103, 104, 105 };
                String[] description = {
                                "A novel by F. Scott Fitzgerald set in the Jazz Age that tells the story of Jay Gatsby's unrequited love for Daisy Buchanan.",
                                "A dystopian social science fiction novel by George Orwell, warning against totalitarianism and extreme political ideology.",
                                "A novel by Harper Lee that deals with serious issues like racial injustice and moral growth in the American South.",
                                "A romantic novel by Jane Austen that critiques the British landed gentry at the end of the 18th century.",
                                "A novel by Herman Melville that tells the story of Captain Ahab's obsessive quest to kill the white whale, Moby Dick."
                };
                int[] price = { 15, 20, 18, 12, 22 };
                int[] quantity = { 50, 40, 35, 45, 30 };
                String[] isbnNumber = { "9780743273565", "9780451524935", "9780061120084", "9781503290563",
                                "9781503280786" };
                String[] authorName = { "F. Scott Fitzgerald", "George Orwell", "Harper Lee", "Jane Austen",
                                "Herman Melville" };
                for (int i = 0; i < 5; i++) {
                        p = new BookProduct(productName[i], brandName[i], itemID[i], price[i], description[i],
                                        quantity[i],
                                        isbnNumber[i], authorName[i]);
                        products.add(p);
                }
                productName = new String[] { "iPhone 14 Pro", "Samsung Galaxy S23", "Sony WH-1000XM5", "MacBook Air M2",
                                "Apple Watch Series 8" };
                brandName = new String[] { "Apple", "Samsung", "Sony", "Apple", "Apple" };
                itemID = new int[] { 201, 202, 203, 204, 205 };
                description = new String[] {
                                "Apple's latest smartphone with a 6.1-inch OLED display, A16 Bionic chip, and advanced camera system.",
                                "Samsung's flagship smartphone featuring a 6.2-inch AMOLED display, Snapdragon 8 Gen 2, and versatile camera setup.",
                                "Sony's premium noise-canceling wireless headphones with industry-leading sound quality and comfort.",
                                "Apple's lightweight laptop powered by the M2 chip, offering exceptional performance and battery life.",
                                "The latest Apple Watch with advanced health monitoring features, a larger display, and improved durability."
                };
                price = new int[] { 999, 899, 349, 1199, 399 };
                quantity = new int[] { 100, 80, 150, 60, 120 };
                int[] warrantyPeriod = { 12, 24, 24, 12, 12 };
                for (int i = 0; i < 5; i++) {
                        p = new ElectronicProduct(productName[i], brandName[i], itemID[i], price[i], description[i],
                                        quantity[i], warrantyPeriod[i]);
                        products.add(p);
                }
                productName = new String[] { "Slim Fit Jeans", "Cotton T-Shirt", "Leather Jacket", "Sneakers",
                                "Hoodie" };
                brandName = new String[] { "Levi's", "H&M", "Zara", "Nike", "Adidas" };
                itemID = new int[] { 301, 302, 303, 304, 305 };
                description = new String[] {
                                "Levi's slim fit jeans made from high-quality denim, offering a modern and comfortable fit.",
                                "H&M cotton T-shirt, soft and breathable, ideal for casual wear.",
                                "Zara's classic leather jacket with a sleek design, perfect for a stylish look.",
                                "Nike's lightweight and comfortable sneakers, designed for everyday wear.",
                                "Adidas hoodie with a relaxed fit and cozy material, suitable for all seasons."
                };
                price = new int[] { 60, 15, 120, 80, 55 };
                quantity = new int[] { 200, 300, 100, 150, 250 };
                String[] size = { "32, 34, 36", "S, M, L, XL", "M, L, XL", "8, 9, 10, 11", "S, M, L, XL" };
                String[] color = { "Blue", "White", "Black", "White", "Grey" };
                for (int i = 0; i < 5; i++) {
                        p = new ClothingProduct(productName[i], brandName[i], itemID[i], price[i], description[i],
                                        quantity[i], size[i], color[i]);
                        products.add(p);
                }

        }

        public Product getProduct(int itemID) {
                for (Product p : getProducts()) {
                        if (p.getItemID() == itemID) {
                                return p;
                        }
                }
                return null;
        }

        public void addProduct(Product p) {
                getProducts().add(p);
        }

        public boolean removeProductQuantity(int itemID, int quantity) {
                Product p = getProduct(itemID);
                if (p.getQuatity() >= quantity) {
                        p.setQuantity(p.getQuatity() - quantity);
                        return true;
                }
                return false;

        }

        public void addProductQuantity(int itemID, int quantity) {
                Product p = getProduct(itemID);
                if (p != null)
                        ;
                p.setQuantity(p.getQuatity() + quantity);

        }

        public void removeProduct(int itemID) {
                Product p = getProduct(itemID);
                if (p != null)
                        ;
                getProducts().remove(p);
        }

        public List<Product> getProducts() {
                return products;
        }

        public void setProducts(List<Product> products) {
                this.products = products;
        }

        void viewProducts() {
                for (Product product : products) {
                        product.displayDetails();
                        System.out.println("--------------------------------------------");
                }
        }
}
