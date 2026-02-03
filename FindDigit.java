import java.util.Scanner;

public class FindDigit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a long number: ");
        long number = sc.nextLong();

        System.out.print("Enter digit to find: ");
        int digitToFind = sc.nextInt();

        boolean found = false;

        while (number != 0) {
            int lastDigit = (int)(number % 10);

            if (lastDigit == digitToFind) {
                found = true;
                break;
            }

            number = number / 10;
        }

        if (found) {
            System.out.println("Digit FOUND in the number");
        } else {
            System.out.println("Digit NOT FOUND in the number");
        }

        sc.close();
    }
}
