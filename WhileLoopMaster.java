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

       

        sc.close();
    }
}
