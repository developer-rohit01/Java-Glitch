//code to print all armstrong numbers inside  the rang of user given 
import java.util.Scanner;

public class Armstrongs {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the lower bound of the range: ");
    int lower = sc.nextInt();
    System.out.print("Enter the upper bound of the range: ");
    int upper = sc.nextInt();
    sc.close();

    System.out.println("Armstrong numbers in the range " + lower + " to " + upper + " are:");
    for (int i = lower; i <= upper; i++) {
      if (isArmstrong(i)) {
        System.out.print(i + " ");
      }
    }
  }

  public static boolean isArmstrong(int n) {
    int originalNumber = n;
    int sum = 0;
    while (n != 0) {
      int remainder = n % 10;
      sum += Math.pow(remainder, 3);
      n /= 10;
    }
    return sum == originalNumber;
  }
}

