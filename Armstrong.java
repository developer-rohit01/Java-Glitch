import java.util.Scanner;

public class Armstrong {
  int number;
  int originalNumber;
  int result = 0;

  public void getInput() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    number = sc.nextInt();
    sc.close();
    originalNumber = number;
  }

  public void calculateArmstrong() {
    while (number != 0) {
      int remainder = number % 10;
      result += Math.pow(remainder, 3);
      number /= 10;
    }
  }

  public void displayResult() {
    if (result == originalNumber) {
      System.out.println(originalNumber + " is an Armstrong number.");
    } else {
      System.out.println(originalNumber + " is not an Armstrong number.");
    }
  }

  public static void main(String[] args) {
    Armstrong armstrong = new Armstrong();
    armstrong.getInput();
    armstrong.calculateArmstrong();
    armstrong.displayResult();
  
}
}