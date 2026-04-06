import java.util.Scanner;
public class Fabonacci {
  int n;
  int a = 0, b = 1, c;

  public void getInput() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of terms in Fibonacci series: ");
    n = sc.nextInt();
    sc.close();
  }

  public void calculateFibonacci() {
    System.out.print("Fibonacci series: ");
    for (int i = 1; i <= n; i++) {
      System.out.print(a + " ");
      c = a + b;
      a = b;
      b = c;
    }
  }

  public static void main(String[] args) {
    Fabonacci fabonacci = new Fabonacci();
    fabonacci.getInput();
    fabonacci.calculateFibonacci();
  
}
}