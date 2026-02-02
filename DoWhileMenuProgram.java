import java.util.Scanner;

public class DoWhileMenuProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMENU");
            System.out.println("1. Say Hello");
            System.out.println("2. Say Bye");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Hello!");
                    break;
                case 2:
                    System.out.println("Bye!");
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 3);

        sc.close();
    }
}
