import java.util.Scanner;

public class DigitFrequencyAndPosition {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        System.out.print("Enter digit to find: ");
        int digitToFind = sc.nextInt();

        int count = 0;
        int position = 1;
        boolean found = false;

        System.out.print("Digit found at positions: ");

        while (number != 0) {
            int lastDigit = (int) (number % 10);

            if (lastDigit == digitToFind) {
                count++;
                found = true;
                System.out.print(position + " ");
            }

            number = number / 10;
            position++;
        }

        if (found) {
            System.out.println("\nDigit appears " + count + " times");
        } else {
            System.out.println("\nDigit not found in the number");
        }

        sc.close();
    }
}
