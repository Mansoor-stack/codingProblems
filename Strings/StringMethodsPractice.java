package String;

import java.util.Arrays;

public class StringMethodsPractice {
    public static void main(String[] args) {
        String str1 = "Hello, World! Welcome to Java.";
        String str2 = "hello, world! welcome to java.";
        String str3 = "   Spaces Everywhere   ";
        String str4 = "";
        String str5 = null;
        String str6 = "Hello";
        String str7 = new String("Hello");
        String str8 = "Hello";

        // Basic info and comparisons
        System.out.println("Length: " + str1.length());
        System.out.println("Char at 7: " + str1.charAt(7));
        System.out.println("Equals: " + str1.equals(str2));
        System.out.println("EqualsIgnoreCase: " + str1.equalsIgnoreCase(str2));
        System.out.println("compareTo: " + str1.compareTo(str2));
        System.out.println("compareToIgnoreCase: " + str1.compareToIgnoreCase(str2));

        // String pool & equals vs ==
        System.out.println("==, same literal: " + (str6 == str8));
        System.out.println("==, literal vs new: " + (str6 == str7));
        System.out.println("equals, literal vs new: " + str6.equals(str7));
        String str9 = new String("Hello").intern();
        System.out.println("==, literal vs interned new: " + (str6 == str9));

        // Searching
        System.out.println("indexOf(\"World\"): " + str1.indexOf("World"));
        System.out.println("indexOf('o'): " + str1.indexOf('o'));
        System.out.println("indexOf(\"Java\"): " + str1.indexOf("Java"));
        System.out.println("indexOf(\"Python\"): " + str1.indexOf("Python"));
        System.out.println("indexOf('o', 5): " + str1.indexOf('o', 5));
        System.out.println("lastIndexOf('o'): " + str1.lastIndexOf('o'));
        System.out.println("lastIndexOf('o', 10): " + str1.lastIndexOf('o', 10));
        System.out.println("startsWith(\"Hello\"): " + str1.startsWith("Hello"));
        System.out.println("startsWith(\"World\", 7): " + str1.startsWith("World", 7));
        System.out.println("endsWith(\"Java.\"): " + str1.endsWith("Java."));
        System.out.println("contains(\"Welcome\"): " + str1.contains("Welcome"));

        // Substrings & manipulation
        String original = "Immutable";
        String modified = original.toUpperCase();
        System.out.println("Original: " + original + ", Modified: " + modified);
        System.out.println("substring(7): " + str1.substring(7));
        System.out.println("substring(7, 12): " + str1.substring(7, 12));
        System.out.println("concat: " + str6.concat(" User!"));
        System.out.println("+: " + (str6 + " Again!"));
        System.out.println("replace(char, char): " + str1.replace('o', '0'));
        System.out.println("replace(seq, seq): " + str1.replace("Java", "Kotlin"));
        System.out.println("trim: \"" + str3.trim() + "\"");
        System.out.println("toLowerCase: " + str1.toLowerCase());
        System.out.println("toUpperCase: " + str1.toUpperCase());

        // Splitting and joining
        String[] words = "The-quick-brown-fox".split("-");
        System.out.println("split: " + Arrays.toString(words));
        String[] fruits = "apple,banana,,orange".split(",");
        System.out.println("split with empty: " + Arrays.toString(fruits));
        String[] parts = "one two three four".split(" ", 3);
        System.out.println("split with limit: " + Arrays.toString(parts));
        String joined = String.join(", ", words);
        System.out.println("join: " + joined);

        // Empty & blank checks
        System.out.println("isEmpty str4: " + str4.isEmpty());
        System.out.println("isEmpty str1: " + str1.isEmpty());
        if (str5 != null) System.out.println("isEmpty str5: " + str5.isEmpty());
        String blankStr = "   \t  \n  ";
        System.out.println("isBlank str4: " + str4.isBlank());
        System.out.println("isBlank blankStr: " + blankStr.isBlank());
        System.out.println("isBlank str1: " + str1.isBlank());

        // Formatting
        String name = "Alice";
        int age = 30;
        String formatted = String.format("User: %s, Age: %d, Score: %.2f", name, age, 95.758);
        System.out.println("format: " + formatted);

        // Conversion
        System.out.println("valueOf int: " + String.valueOf(123));
        System.out.println("valueOf boolean: " + String.valueOf(true));
        System.out.println("valueOf double: " + String.valueOf(3.14));
        char[] charArray = {'J', 'a', 'v', 'a'};
        System.out.println("valueOf(charArray): " + String.valueOf(charArray));
        System.out.println("valueOf(charArray, 1, 2): " + String.valueOf(charArray, 1, 2));

        // Immutability/tricky cases
        String test = "test";
        test.toUpperCase();
        System.out.println("test after toUpperCase(): " + test);
        test = test.toUpperCase();
        System.out.println("test after assignment: " + test);
        System.out.println("valueOf(null): " + String.valueOf(str5));
        String chained = "  example  ".trim().toUpperCase().substring(0, 4);
        System.out.println("Chained: " + chained);
    }
}
