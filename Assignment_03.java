public class Assignment_03 {

  public static void main(String[] args) {

        // 1. String Creation
        String s1 = "Hello";
        String s2 = new String("Hello");

        System.out.println("String 1: " + s1);
        System.out.println("String 2: " + s2);

        // 2. String Comparison section

        // Using equals()
        System.out.println("\nUsing equals(): " + s1.equals(s2));

        // Using ==
        System.out.println("Using == : " + (s1 == s2));

        // Using compareTo()
        System.out.println("Using compareTo(): " + s1.compareTo(s2));

        // 3. String Immutability section
        String str = "Java";
        str.concat(" Programming");

        System.out.println("\nAfter concat without assignment: " + str);

        str = str.concat(" Programming");

        System.out.println("After concat with assignment: " + str);

        // 4. String Methods uses in SOP

        String text = "Java Programming";

        System.out.println("\nLength: " + text.length());
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());
        System.out.println("Character at index 2: " + text.charAt(2));
        System.out.println("Substring (5,16): " + text.substring(5,16));
        System.out.println("Contains 'Java': " + text.contains("Java"));
        System.out.println("Replace 'Java' with 'Python': " + text.replace("Java","Python"));
    }
  
}
