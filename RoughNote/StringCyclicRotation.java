package RoughNote;


public class StringCyclicRotation {
    
    public static void main(String[] args) {
        String input = "Tester";
            int n = input.length();
            String concatenatedInput = input + input; // Concatenate string with itself to handle rotation
        
            for (int i = 0; i <= n; i++) {
                // Print substring from concatenated string starting from index i of length n
                System.out.println(concatenatedInput.substring(i, i + n));
            // String placeHolder = input.substring(i)+input.substring(0, i);
            // System.out.println(placeHolder);
            // System.out.println(input.substring(-1));

            }

            
        }
}
