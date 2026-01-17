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

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    // Setters
    public void setPrice(double price) {
        this.price = price;
    }
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

        // Display all products
        System.out.println("\n--- All Products ---");
        for (Product p : products) {
            System.out.println(p.getId() + " " + p.getName() + " " +
                               p.getPrice() + " " + p.getCategory());
        }

         // Find max and min price product
        Product maxProduct = products.get(0);
        Product minProduct = products.get(0);

        for (Product p : products) {
            if (p.getPrice() > maxProduct.getPrice())
                maxProduct = p;

            if (p.getPrice() < minProduct.getPrice())
                minProduct = p;
        }

        System.out.println("\nMax Price Product: " +
                maxProduct.getName() + " - " + maxProduct.getPrice());

        System.out.println("Min Price Product: " +
                minProduct.getName() + " - " + minProduct.getPrice());


         // Category-based calculations
        System.out.print("\nEnter category to calculate statistics: ");
        String searchCategory = sc.next();

        double sum = 0;
        int count = 0;
        double catMax = Double.MIN_VALUE;
        double catMin = Double.MAX_VALUE;

        for (Product p : products) {
            if (p.getCategory().equalsIgnoreCase(searchCategory)) {
                sum += p.getPrice();
                count++;

                if (p.getPrice() > catMax)
                    catMax = p.getPrice();

                if (p.getPrice() < catMin)
                    catMin = p.getPrice();
            }
        }

        if (count > 0) {
            System.out.println("\nCategory: " + searchCategory);
            System.out.println("Average Price: " + (sum / count));
            System.out.println("Max Price: " + catMax);
            System.out.println("Min Price: " + catMin);
        } else {
            System.out.println("\nNo products found in this category.");
        }

        sc.close();
    }
}