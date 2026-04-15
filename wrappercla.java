//program to demonstrate wrapper class in java
public class wrappercla {
    public static void main(String[] args) {
        // Creating wrapper objects
        Integer intObj = Integer.valueOf(10);
        Double doubleObj = Double.valueOf(3.14);
        Character charObj = Character.valueOf('A');

        // Displaying wrapper objects
        System.out.println("Integer Object: " + intObj);
        System.out.println("Double Object: " + doubleObj);
        System.out.println("Character Object: " + charObj);

        // Unboxing wrapper objects to primitive types
        int intValue = intObj.intValue();
        double doubleValue = doubleObj.doubleValue();
        char charValue = charObj.charValue();

        // Displaying unboxed primitive values
        System.out.println("\nUnboxed Integer Value: " + intValue);
        System.out.println("Unboxed Double Value: " + doubleValue);
        System.out.println("Unboxed Character Value: " + charValue);

        // Using autoboxing and unboxing
        Integer autoBoxedInt = 20; // Autoboxing
        int autoUnboxedInt = autoBoxedInt; // Unboxing

        System.out.println("\nAutoboxed Integer: " + autoBoxedInt);
        System.out.println("Auto-unboxed Integer: " + autoUnboxedInt);
    }
  
}
