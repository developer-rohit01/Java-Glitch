public class Assignment01 {
  public static void main(String[] args) {
    // Primitive Data Types
    byte byteVar = 127;           // 8-bit integer
    short shortVar = 32000;       // 16-bit integer
    int intVar = 2000000;         // 32-bit integer
    long longVar = 9000000000L;   // 64-bit integer
    float floatVar = 3.14f;       // 32-bit decimal
    double doubleVar = 2.71828;   // 64-bit decimal
    boolean boolVar = true;       // true or false
    char charVar = 'A';           // single character
    
    // String (Reference Data Type)
    String strVar = "Hello Java";   
    
    System.out.println("=== Data Types ===");
    System.out.println("Byte: " + byteVar);
    System.out.println("Short: " + shortVar);
    System.out.println("Int: " + intVar);
    System.out.println("Long: " + longVar);
    System.out.println("Float: " + floatVar);
    System.out.println("Double: " + doubleVar);
    System.out.println("Boolean: " + boolVar);
    System.out.println("Char: " + charVar);
    System.out.println("String: " + strVar);
    
    // If-Else Statement
    System.out.println("\n=== If-Else ===");
    if (intVar > 1000000) {
      System.out.println("intVar is greater than 1 million");
    } else if (intVar > 500000) {
      System.out.println("intVar is greater than 500k");
    } else {
      System.out.println("intVar is less than 500k");
    }
    
    // Switch Statement
    System.out.println("\n=== Switch ===");
    int day = 3;
    switch(day) {
      case 1: System.out.println("Monday"); break;
      case 2: System.out.println("Tuesday"); break;
      case 3: System.out.println("Wednesday"); break;
      default: System.out.println("Other day");
    }
    
    // For Loop
    System.out.println("\n=== For Loop ===");
    for (int i = 1; i <= 5; i++) {
      System.out.println("Count: " + i);
    }
    
    // While Loop
    System.out.println("\n=== While Loop ===");
    int counter = 0;
    while (counter < 3) {
      System.out.println("While counter: " + counter);
      counter++;
    }
    
    // Do-While Loop
    System.out.println("\n=== Do-While Loop ===");
    int num = 0;
    do {
      System.out.println("Do-While num: " + num);
      num++;
    } while (num < 2);
    
    // Ternary Operator
    System.out.println("\n=== Ternary Operator ===");
    String result = (doubleVar > 2.5) ? "Greater" : "Lesser";
    System.out.println("Result: " + result);

    // Array Example
    System.out.println("\n=== Arrays ===");
    int[] numbers = {10, 20, 30, 40, 50};
    System.out.println("Array elements:");
    for (int i = 0; i < numbers.length; i++) {
      System.out.println("Index " + i + ": " + numbers[i]);
    }

    String[] fruits = {"Apple", "Banana", "Orange"};
    System.out.println("\nFruit array:");



    
    for (String fruit : fruits) {
      System.out.println(fruit);
    }
  }
  
}
