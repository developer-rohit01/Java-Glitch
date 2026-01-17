import java.util.*;

class Product {
    private int id;
    private String name;
    private double price;
    private String category;

     // Constructor
    public Product(int id, String name, double price, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }







    public class ProductDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

         // Taking dynamic input
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of product " + (i + 1));

            System.out.print("ID: ");
            int id = sc.nextInt();

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            System.out.print("Category: ");
            String category = sc.next();

            products.add(new Product(id, name, price, category));
        }