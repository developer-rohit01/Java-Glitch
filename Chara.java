
import java.util.Scanner; 

public class Chara {
  public static void main(String[] args) {
    Scanner sc =  new Scanner(System.in);
      System.out.print("Enter the A: ");
      int a=sc.nextInt();
      System.out.print("Enter the B: ");
      char b=sc.next().charAt(1);
      
      System.out.println("The A is: "+a);
      System.out.println("The B is: "+b);
    }
  }
