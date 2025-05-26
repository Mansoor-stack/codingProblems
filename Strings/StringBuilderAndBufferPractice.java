package String;

/**
 * Demonstrates StringBuilder and StringBuffer, highlighting their mutability,
 * differences (thread-safety), and common use cases.
 */
public class StringBuilderAndBufferPractice {

    public static void main(String[] args) {
        System.out.println("--- StringBuilder and StringBuffer Practice ---");

        // --- StringBuilder (Mutable, Not Thread-Safe) ---
        // Generally preferred for single-threaded environments due to better performance.
        System.out.println("\n--- StringBuilder ---");
        StringBuilder sb = new StringBuilder(); // Initial capacity of 16

        // 1. append() - Adds content to the end
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");
        sb.append(123);
        sb.append(true);
        System.out.println("1. After append(): " + sb.toString()); // "Hello World123true"
        System.out.println("   Current capacity: " + sb.capacity());
        System.out.println("   Current length: " + sb.length());

        // 2. insert(int offset, String str) - Inserts content at a specific position
        sb.insert(5, ", Java "); // Insert ", Java " at index 5
        System.out.println("2. After insert(): " + sb.toString()); // "Hello, Java World123true"

        // 3. delete(int start, int end) - Deletes characters from start (inclusive) to end (exclusive)
        sb.delete(11, 14); // Deletes "Wor"
        System.out.println("3. After delete(): " + sb.toString()); // "Hello, Java ld123true"

        // 4. deleteCharAt(int index) - Deletes character at a specific position
        sb.deleteCharAt(sb.length() - 1); // Delete the last character ('e')
        System.out.println("4. After deleteCharAt(): " + sb.toString()); // "Hello, Java ld123tru"

        // 5. replace(int start, int end, String str) - Replaces a portion of the string
        sb.replace(7, 11, "Universe"); // Replace "Java" with "Universe"
        System.out.println("5. After replace(): " + sb.toString()); // "Hello, Universe ld123tru"

        // 6. reverse() - Reverses the content
        sb.reverse();
        System.out.println("6. After reverse(): " + sb.toString());
        sb.reverse(); // Reverse back for further examples

        // 7. length() - Current number of characters
        System.out.println("7. length(): " + sb.length());

        // 8. capacity() - Current allocated capacity (can be more than length)
        // Capacity automatically increases when needed.
        System.out.println("8. capacity(): " + sb.capacity());
        StringBuilder sbc = new StringBuilder(5); // Initial capacity 5
        System.out.println("   Initial capacity of sbc: " + sbc.capacity());
        sbc.append("123456"); // Exceeds initial capacity
        System.out.println("   sbc after append: " + sbc.toString());
        System.out.println("   New capacity of sbc: " + sbc.capacity()); // (5*2)+2 = 12 or similar logic

        // 9. setLength(int newLength) - Truncates or pads with null characters
        sb.setLength(10);
        System.out.println("9. After setLength(10): \"" + sb.toString() + "\" (length: " + sb.length() + ")"); // "Hello, Uni"
        // sb.setLength(15); // Would pad with null characters if length increased beyond current content
        // System.out.println("   After setLength(15): \"" + sb.toString() + "\" (char at 10: " + (int)sb.charAt(10) + ")");

        // 10. toString() - Converts StringBuilder to an immutable String
        String finalString = sb.toString();
        System.out.println("10. finalString (from toString()): " + finalString);

        // --- StringBuffer (Mutable, Thread-Safe) ---
        // Use when modifications are needed in a multi-threaded environment.
        // Methods are synchronized, which adds overhead.
        System.out.println("\n--- StringBuffer ---");
        StringBuffer sbf = new StringBuffer("Initial");

        // Methods are largely the same as StringBuilder:
        sbf.append(" Content");
        sbf.insert(0, "My ");
        System.out.println("StringBuffer example: " + sbf.toString()); // "My Initial Content"

        // --- When to use which ---
        System.out.println("\n--- When to use String, StringBuilder, or StringBuffer ---");
        System.out.println("String: For immutable character sequences. Good for fixed values, keys in maps, etc.");
        System.out.println("        Concatenation with '+' is often optimized to StringBuilder by the compiler, but for many operations in a loop, explicit StringBuilder is better.");
        System.out.println("StringBuilder: For mutable character sequences in a single-threaded environment. Best for performance when you need to modify strings frequently (e.g., building a long string in a loop).");
        System.out.println("StringBuffer: For mutable character sequences in a multi-threaded environment. Use if the string buffer will be accessed/modified by multiple threads concurrently.");

        // Performance consideration (conceptual)
        // String concatenation in a loop (bad practice for many iterations)
        String resultString = "";
        // for (int i = 0; i < 10000; i++) { resultString += i; } // Very inefficient

        // StringBuilder in a loop (good practice)
        StringBuilder efficientBuilder = new StringBuilder();
        for (int i = 0; i < 5; i++) { // Small loop for demonstration
            efficientBuilder.append(i);
            efficientBuilder.append("-");
        }
        if (efficientBuilder.length() > 0) efficientBuilder.deleteCharAt(efficientBuilder.length()-1); // remove last '-'
        System.out.println("Efficiently built string: " + efficientBuilder.toString());

        System.out.println("\n--- End of StringBuilder and StringBuffer Practice ---");
    }
}