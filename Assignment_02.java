import java.util.Scanner;

public class Assignment_02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // -------- 1D Array Input --------
        System.out.print("Enter size of 1D array: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter elements of 1D array:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("\n1D Array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // -------- 2D Array Input --------
        System.out.print("\n\nEnter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter elements of 2D array:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("\n2D Array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
    
}