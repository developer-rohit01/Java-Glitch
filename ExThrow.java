// program to process student marks using a method decalared with throws , if marks are negative or greater than 100 , use throw to generate a user-defined exception , use multiple catch blocks to handle different types of exceptions

import java.util.Scanner;
class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}

public class ExThrow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student marks: ");
        int marks = scanner.nextInt();

        try {
            processMarks(marks);
            System.out.println("Marks processed successfully.");
        } catch (InvalidMarksException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }  

    public static void processMarks(int marks) throws InvalidMarksException {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Marks must be between 0 and 100.");
        }
        // Further processing of marks can be done here
        System.out.println("Valid marks: " + marks);

    }
}


