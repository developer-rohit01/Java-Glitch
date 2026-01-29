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

        sc.close();
    }
}
