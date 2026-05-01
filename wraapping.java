public class wraapping {
  

    public static void main(String[] args) {
        // Creating wrapper objects

        int a = 10;
        double b = 3.14;
        char c = 'A';

        Integer intObj = Integer.valueOf(a);
        Double doubleObj = Double.valueOf(b);
        Character charObj = Character.valueOf(c);

        // Displaying wrapper objects
        System.out.println("Integer Object: " + intObj);
        System.out.println("Double Object: " + doubleObj);
        System.out.println("Character Object: " + charObj);
}
}