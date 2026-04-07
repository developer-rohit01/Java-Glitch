import java.util.Scanner;
public class Pelindrom {
  int number;
  int originalNumber;
  int reversedNumber = 0;

  public void getInput() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    number = sc.nextInt();
    sc.close();
    originalNumber = number;
  }

  public void calculatePelindrom() {
    while (number != 0) {
      int remainder = number % 10;
      reversedNumber = reversedNumber * 10 + remainder;
      number /= 10;
    }
  }

  public void displayResult() {
    if (reversedNumber == originalNumber) {
      System.out.println(originalNumber + " is a palindrome.");
    } else {
      System.out.println(originalNumber + " is not a palindrome.");
    }
  }

  public static void main(String[] args) {
    Pelindrom pelindrom = new Pelindrom();
    pelindrom.getInput();
    pelindrom.calculatePelindrom();
    pelindrom.displayResult();
  
}
}
