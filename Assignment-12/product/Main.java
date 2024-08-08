package product;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int choice = 0;
        
        ShoppingCart s = new ShoppingCart();
        System.out.println("Welcome to the Shopping Cart!");
        while (choice != 6) {
            System.out.println("--------------------------------------------");
            System.out.println("1. View Products");
            System.out.println("2. Add Product to Cart");
            System.out.println("3. Remove Product from Cart");
            System.out.println("4. View Cart");
            System.out.println("5. Checkout");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    s.getDB().viewProducts();
                    break;
                case 2:
                    System.out.print("Enter Product ID: ");
                    int productId = sc.nextInt();
                    System.out.print("Enter Quantity: ");
                    int quantity = sc.nextInt();
                    try {
                        s.addProductToCart(productId, quantity);
                    } catch (Exception e) {
                        System.out.println("error ocurred");
                    }
                    break;
                case 3:
                    System.out.print("Enter Product ID: ");
                    productId = sc.nextInt();
                    System.out.println("Enter Nth Time of Product to Remove :");
                    int n = 0;
                    n = sc.nextInt();
                    s.removeProductFromCart(productId,n);
                    break;
                case 4:
                    s.showDetails();
                    break;
                case 5:
                    s.checkout();
                    break;
                case 6:
                    System.out.println("Thank you for shopping with us!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        sc.close();
    }
}
