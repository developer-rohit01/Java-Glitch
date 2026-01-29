import java.util.Scanner;

public class WhileLoopMaster {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Print numbers from 1 to n
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int i = 1;

        System.out.println("\nNumbers from 1 to " + n + ":");
        while (i <= n) {
            System.out.print(i + " ");
            i++;
        }
         
           // 2. Sum of digits
        System.out.print("\n\nEnter a number to find sum of digits: ");
        int num = sc.nextInt();

        int sum = 0;

        while (num != 0) {
            sum = sum + (num % 10);
            num = num / 10;
        }

        System.out.println("Sum of digits = " + sum);

         // 3. Reverse of number
        System.out.print("\nEnter a number to reverse: ");
        int revNum = sc.nextInt();

        int reverse = 0;

        while (revNum != 0) {
            int digit = revNum % 10;
            reverse = reverse * 10 + digit;
            revNum = revNum / 10;
        }

        System.out.println("Reversed number = " + reverse);

        // 4. Factorial of a number
        System.out.print("\nEnter a number to find factorial: ");
        int factNum = sc.nextInt(); 
        int factorial = 1;
        while (factNum > 0) {
            factorial = factorial * factNum;
            factNum--;
        }
        System.out.println("Factorial = " + factorial);

        sc.close();
    }
}
