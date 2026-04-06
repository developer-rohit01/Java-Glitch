//Program to add n number using classes
import java.util.Scanner;

public class Add {
  int n;
  int sum;

  public void getInput() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of elements to add: ");
    n = sc.nextInt();
    sc.close();
  }

  public void calculateSum() {
    sum = 0;
    for (int i = 1; i <= n; i++) {
      sum += i;
    }
  }

  public void displayResult() {
    System.out.println("The sum of the first " + n + " numbers is: " + sum);
  }

  public static void main(String[] args) {
    Add adder = new Add();
    adder.getInput();
    adder.calculateSum();
    adder.displayResult();
  }
}