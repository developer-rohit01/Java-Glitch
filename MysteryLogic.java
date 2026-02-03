public class MysteryLogic {

    public static void main(String[] args) {

        int n = 123;
        int result = 0;

        while (n != 0) {
            int digit = n % 10;
            result = result * 10 + digit;
            n = n / 10;
        }

        System.out.println(result);
    }
}
