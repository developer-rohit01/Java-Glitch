//Program to implement all core java concept like oops concept method overriding, method overloading, abstraction, encapsulation, inheritance and polymorphism  all conditional statements and loops and arrays , exception handling in java
import java.util.Scanner;
public class Rambaad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Using conditional statements
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // Using loops
        System.out.println("Numbers from 1 to " + number + ":");
        for (int i = 1; i <= number; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Using arrays
        int[] array = new int[number];
        for (int i = 0; i < number; i++) {
            array[i] = i + 1;
        }
        System.out.println("Array elements:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Using exception handling
        try {
            int result = number / 0; // This will throw an exception
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero. Please provide a non-zero number.");
        }

        scanner.close();
    }
}

