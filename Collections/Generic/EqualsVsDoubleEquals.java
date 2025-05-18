package Collections.Generic;

/*
 * The primary goal of this code is to illustrate the 
 * fundamental difference between the == operator and the .equals() method in Java, 
 * especially when dealing with primitive types versus object types (like String).
 */
public class EqualsVsDoubleEquals {


    public static void main(String[] args) {

        // --- Primitives (int) ---
        int a = 10;
        int b = 10;
        // For primitives, == compares values.
        System.out.println("Primitives (a=10, b=10):");
        System.out.println("  a == b : " + (a == b) + " // Compares values");
        System.out.println();

        // --- Strings ---
        String c = "Mansoor"; // Literal -> String Pool
        String d = "Ahmed";   // Literal -> String Pool (different object than c)
        String e = new String("Mansoor"); // Explicit new object on Heap
        String f = new String("Mansoor"); // Explicit new object on Heap (different from e)

        System.out.println("String Literals (c=\"Mansoor\", d=\"Ahmed\"):");
        // == compares references (memory locations) for objects.
        System.out.println("  c == d : " + (c == d) + " // Different objects in pool");
        // .equals() compares the actual content (character sequence) for Strings.
        System.out.println("  c.equals(d) : " + c.equals(d) + " // Different content");
        System.out.println();

        System.out.println("String Objects (e=new String(\"Mansoor\"), f=new String(\"Mansoor\")):");
        // e and f are distinct objects because 'new' was used.
        System.out.println("  e == f : " + (e == f) + " // Different objects on heap");
        // .equals() compares content, which is the same here.
        System.out.println("  e.equals(f) : " + e.equals(f) + " // Same content");
        System.out.println();

        System.out.println("Literal vs Object (c=\"Mansoor\", e=new String(\"Mansoor\")):");
        // c is in the pool, e is on the heap - different objects.
        System.out.println("  c == e : " + (c == e) + " // Different objects (pool vs heap)");
        // .equals() compares content, which is the same.
        System.out.println("  c.equals(e) : " + c.equals(e) + " // Same content");
        System.out.println();

        // --- Key Takeaway ---
        // == : Compares values for primitives, references (memory addresses) for objects.
        // .equals() : Compares content for Strings (and should be overridden for custom objects).

        // --- Optional: Uncomment to see the effect of assigning references ---
        /*
        System.out.println("--- After Assignment (e = f) ---");
        e = f; // Now 'e' points to the same object as 'f'
        System.out.println("  e == f : " + (e == f) + " // Now true (same object)");
        System.out.println("  e.equals(f) : " + e.equals(f) + " // Still true (same content)");
        */
    }
}
