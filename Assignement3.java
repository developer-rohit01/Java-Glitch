
import java.util.ArrayList;
import java.util.Scanner;


class Assignement3 {
              static Scanner sc = new Scanner(System.in);
              static ArrayList<Integer> numbers = new ArrayList<>();

              public static void main(String[] args) {
                int choice;
                do {
                  displayMenu();
                  choice = sc.nextInt();
                  switch (choice) {
                    case 1:
                      addElement();
                      break;
                    case 2:
                      deleteElement();
                      break;
                    case 3:
                      findElement();
                      break;
                    case 4:
                      displayArray();
                      break;
                    case 5:
                      System.out.println("Exiting...");
                      break;
                    default:
                      System.out.println("Invalid choice!");
                  }
                } while (choice != 5);
                sc.close();
              }

              static void displayMenu() {
                System.out.println("\n--- Menu ---");
                System.out.println("1. Add Element");
                System.out.println("2. Delete Element");
                System.out.println("3. Find Element");
                System.out.println("4. Display Array");
                System.out.println("5. Exit");
                System.out.print("Enter choice: ");
              }

              static void addElement() {
                System.out.print("Enter element to add: ");
                numbers.add(sc.nextInt());
                System.out.println("Element added!");
              }

              static void deleteElement() {
                System.out.print("Enter element to delete: ");
                if (numbers.remove(Integer.valueOf(sc.nextInt()))) {
                  System.out.println("Element deleted!");
                } else {
                  System.out.println("Element not found!");
                }
              }

              static void findElement() {
                System.out.print("Enter element to find: ");
                int element = sc.nextInt();
                if (numbers.contains(element)) {
                  System.out.println("Element found at index: " + numbers.indexOf(element));
                } else {
                  System.out.println("Element not found!");
                }
              }

              static void displayArray() {
                System.out.println("Array: " + numbers);
              }
            }