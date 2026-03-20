import java.util.Scanner;

public class DoWhileD {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int i = 1;
        // do whilwe use first done then check 
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= n);

        sc.close();
    }
}
