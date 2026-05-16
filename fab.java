import java.util.Scanner;

class fab{
  public static void main(String[] args){
   
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number to get the Fibonacci value: ");
    int n = sc.nextInt();
    int a = 0, b = 1, c=0;

    if(n==0){
      System.out.println(a);
      sc.close();
      return;
    }
     if(n==1){
      System.out.println(b);
      sc.close();
      return;
    }
  
    for(int i = 1; i < n; i++){
      c = a + b;
      a = b;
      b = c;
    }
    System.out.println(c);
    sc.close();

  }
}