
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
        

        
    }
}


