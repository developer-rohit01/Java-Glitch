import java.util.Scanner;
public class AddDigit {
  int number;
  int sum;

  public void getInput() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    number = sc.nextInt();
    sc.close();
  }

  public void calculateSum() {
    sum = 0;
    while (number != 0) {
      sum += number % 10;
      number /= 10;
    }
  }

  public void displayResult() {
    System.out.println("The sum of the digits is: " + sum);
  }

  public static void main(String[] args) {
    AddDigit addDigit = new AddDigit();
    addDigit.getInput();
    addDigit.calculateSum();
    addDigit.displayResult();
  }
}
