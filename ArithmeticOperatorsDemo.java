public class ArithmeticOperatorsDemo{

    public static void main(String[] args) {

        int a = 20;
        int b = 6;

        System.out.println("Value of a = " + a);
        System.out.println("Value of b = " + b);

        // Addition
        int add = a + b;
        System.out.println("Addition (a + b) = " + add);

        // Subtraction
        int sub = a - b;
        System.out.println("Subtraction (a - b) = " + sub);

        // Multiplication
        int mul = a * b;
        System.out.println("Multiplication (a * b) = " + mul);

        // Division
        int div = a / b;
        System.out.println("Division (a / b) = " + div);

        // Modulus (remainder)
        int mod = a % b;
        System.out.println("Modulus (a % b) = " + mod);

        // Increment
        a++;
        System.out.println("After Increment a++ = " + a);

        // Decrement
        b--;
        System.out.println("After Decrement b-- = " + b);
    }
}
