package String;

import java.util.Arrays;
import java.util.Locale;

/**
 * Demonstrates widely used methods of the immutable String class in Java.
 * Covers straightforward to tricky use cases and highlights "behind-the-scenes" aspects.
 */
public class StringMethodsPractice {

    public static void main(String[] args) {
        System.out.println("--- String Methods Practice ---");

        String str1 = "Hello, World! Welcome to Java.";
        String str2 = "hello, world! welcome to java.";
        String str3 = "   Spaces Everywhere   ";
        String str4 = "";
        String str5 = null;
        String str6 = "Hello";
        String str7 = new String("Hello"); // Explicitly creates a new object in heap
        String str8 = "Hello"; // Likely reuses str6 from string pool

        // --- Basic Information & Comparison ---
        System.out.println("1. length(): " + str1.length()); // 29

        System.out.println("2. charAt(index): " + str1.charAt(7)); // W
        // System.out.println(str1.charAt(30)); // StringIndexOutOfBoundsException

        System.out.println("3. equals(Object anotherString):");
        System.out.println("   str1.equals(str2): " + str1.equals(str2)); // false (case-sensitive)
        System.out.println("   str6.equals(\"Hello\"): " + str6.equals("Hello")); // true

        System.out.println("4. equalsIgnoreCase(String anotherString):");
        System.out.println("   str1.equalsIgnoreCase(str2): " + str1.equalsIgnoreCase(str2)); // true

        System.out.println("5. compareTo(String anotherString):"); // Lexicographical comparison
        System.out.println("   \"apple\".compareTo(\"banana\"): " + "apple".compareTo("banana")); // < 0
        System.out.println("   \"banana\".compareTo(\"apple\"): " + "banana".compareTo("apple")); // > 0
        System.out.println("   \"apple\".compareTo(\"apple\"): " + "apple".compareTo("apple")); // 0
        System.out.println("   str1.compareTo(str2): " + str1.compareTo(str2)); // < 0 (H vs h)

        System.out.println("6. compareToIgnoreCase(String str):");
        System.out.println("   str1.compareToIgnoreCase(str2): " + str1.compareToIgnoreCase(str2)); // 0

        // --- String Pool and `==` vs `equals()` ---
        // `==` checks if two references point to the same object in memory.
        // `equals()` (for String) checks if the character sequences are the same.
        System.out.println("\n--- String Pool & == vs equals() ---");
        System.out.println("str6 == str8 (literal vs literal): " + (str6 == str8)); // true (both likely from string pool)
        System.out.println("str6 == str7 (literal vs new String()): " + (str6 == str7)); // false (str7 is a new object)
        System.out.println("str6.equals(str7): " + str6.equals(str7)); // true (content is the same)

        // intern() method: adds the string to the pool if not already there, and returns the reference from the pool.
        String str9 = new String("Hello").intern();
        System.out.println("str6 == str9 (literal vs interned new String()): " + (str6 == str9)); // true

        // --- Searching ---
        System.out.println("\n--- Searching ---");
        System.out.println("7. indexOf(String str): " + str1.indexOf("World")); // 7 (first occurrence)
        System.out.println("   indexOf('o'): " + str1.indexOf('o')); // 4
        System.out.println("   indexOf(\"Java\"): " + str1.indexOf("Java")); // 25
        System.out.println("   indexOf(\"Python\"): " + str1.indexOf("Python")); // -1 (not found)

        System.out.println("8. indexOf(String str, int fromIndex):");
        System.out.println("   indexOf('o', 5): " + str1.indexOf('o', 5)); // 8 (starts search from index 5)

        System.out.println("9. lastIndexOf(String str): " + str1.lastIndexOf("o")); // 20
        System.out.println("   lastIndexOf('o', 10): " + str1.lastIndexOf('o', 10)); // 8

        System.out.println("10. startsWith(String prefix): " + str1.startsWith("Hello")); // true
        System.out.println("    startsWith(\"World\", 7): " + str1.startsWith("World", 7)); // true (offset)

        System.out.println("11. endsWith(String suffix): " + str1.endsWith("Java.")); // true

        System.out.println("12. contains(CharSequence s): " + str1.contains("Welcome")); // true

        // --- Substrings & Manipulation (Remember: Strings are immutable, these return NEW strings) ---
        System.out.println("\n--- Substrings & Manipulation (New Strings Returned) ---");
        String original = "Immutable";
        String modified = original.toUpperCase(); // original remains "Immutable"
        System.out.println("   Original: " + original + ", Modified: " + modified);

        System.out.println("13. substring(int beginIndex): " + str1.substring(7)); // "World! Welcome to Java."
        System.out.println("14. substring(int beginIndex, int endIndex): " + str1.substring(7, 12)); // "World" (endIndex is exclusive)
        // System.out.println(str1.substring(7, 5)); // StringIndexOutOfBoundsException (begin > end)

        System.out.println("15. concat(String str): " + str6.concat(" User!")); // "Hello User!" (str6 is still "Hello")
        // Prefer '+' for concatenation for readability, compiler often optimizes it to StringBuilder.
        String concatenated = str6 + " Again!";
        System.out.println("   Using '+': " + concatenated);

        System.out.println("16. replace(char oldChar, char newChar): " + str1.replace('o', '0'));
        System.out.println("17. replace(CharSequence target, CharSequence replacement): " + str1.replace("Java", "Kotlin"));

        System.out.println("18. trim(): \"" + str3.trim() + "\""); // "Spaces Everywhere" (removes leading/trailing whitespace)

        System.out.println("19. toLowerCase(): " + str1.toLowerCase());
        System.out.println("20. toUpperCase(): " + str1.toUpperCase());

        // --- Splitting and Joining ---
        System.out.println("\n--- Splitting and Joining ---");
        String sentence = "The-quick-brown-fox";
        String[] words = sentence.split("-"); // Splits by delimiter
        System.out.println("21. split(String regex): " + Arrays.toString(words)); // [The, quick, brown, fox]

        String data = "apple,banana,,orange";
        String[] fruits = data.split(",");
        System.out.println("   split with empty strings: " + Arrays.toString(fruits)); // [apple, banana, , orange]

        String limitedSplit = "one two three four";
        String[] parts = limitedSplit.split(" ", 3); // Limit parameter
        System.out.println("   split with limit: " + Arrays.toString(parts)); // [one, two, three four]

        System.out.println("22. String.join(CharSequence delimiter, CharSequence... elements):");
        String joined = String.join(", ", words);
        System.out.println("   Joined words: " + joined); // "The, quick, brown, fox"

        // --- Empty & Blank Checks ---
        System.out.println("\n--- Empty & Blank Checks ---");
        System.out.println("23. isEmpty():");
        System.out.println("   str4 (\"\") isEmpty(): " + str4.isEmpty()); // true
        System.out.println("   str1 isEmpty(): " + str1.isEmpty()); // false
        // System.out.println("   str5 (null) isEmpty(): " + str5.isEmpty()); // NullPointerException
        if (str5 != null) System.out.println("   str5 (null) isEmpty(): " + str5.isEmpty());


        // isBlank() (Java 11+) - checks if string is empty or contains only white space
        String blankStr = "   \t  \n  ";
        System.out.println("24. isBlank() (Java 11+):");
        System.out.println("   str4 (\"\") isBlank(): " + str4.isBlank()); // true
        System.out.println("   blankStr (\"   \\t  \\n  \") isBlank(): " + blankStr.isBlank()); // true
        System.out.println("   str1 isBlank(): " + str1.isBlank()); // false

        // --- Formatting ---
        System.out.println("\n--- Formatting ---");
        String name = "Alice";
        int age = 30;
        // %s for string, %d for integer, %.2f for float/double with 2 decimal places
        String formattedString = String.format("User: %s, Age: %d, Score: %.2f", name, age, 95.758);
        System.out.println("25. String.format(): " + formattedString);

        // --- Conversion ---
        System.out.println("\n--- Conversion ---");
        System.out.println("26. valueOf():"); // Converts different types to String
        System.out.println("   String.valueOf(123): " + String.valueOf(123));
        System.out.println("   String.valueOf(true): " + String.valueOf(true));
        System.out.println("   String.valueOf(3.14): " + String.valueOf(3.14));
        char[] charArray = {'J', 'a', 'v', 'a'};
        System.out.println("   String.valueOf(charArray): " + String.valueOf(charArray));
        System.out.println("   String.valueOf(charArray, 1, 2): " + String.valueOf(charArray, 1, 2)); // "av" (offset, count)

        // --- Tricky Cases & Immutability Reminder ---
        System.out.println("\n--- Tricky Cases & Immutability ---");
        String test = "test";
        test.toUpperCase(); // This line does NOTHING to 'test' itself because String is immutable.
                           // The result of toUpperCase() is a new String, which is not assigned here.
        System.out.println("   'test' after test.toUpperCase() without assignment: " + test); // "test"

        test = test.toUpperCase(); // NOW 'test' references the new uppercase String.
        System.out.println("   'test' after assignment: " + test); // "TEST"

        // Null handling
        // Most String methods will throw NullPointerException if called on a null reference.
        // String strNull = null;
        // System.out.println(strNull.length()); // Throws NullPointerException

        // `String.valueOf(null)` is a safe way to handle potential nulls if you need "null" as a string.
        System.out.println("   String.valueOf(null): " + String.valueOf(str5)); // "null"

        // Chaining methods
        String chained = "  example  ".trim().toUpperCase().substring(0, 4);
        System.out.println("   Chained methods: \"" + chained + "\""); // "EXAM"

        System.out.println("\n--- End of String Methods Practice ---");
    }
}