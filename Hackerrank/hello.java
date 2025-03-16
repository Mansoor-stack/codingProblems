package codingProblems.Hackerrank;

import java.util.*;

public class hello {
    public static void main(String[] args) {
        // Print a basic greeting to the console.
        System.out.println("Hello, World.");

        // Create a Scanner object to read user input from the console.
        Scanner scan = new Scanner(System.in);

        // Prompt the user to enter information.
        System.out.println("Enter the school form");

        // Prompt for and read the user's first name (reads until a space).
        System.out.println("Enter your first name");
        String firstName = scan.next();

        // Consume the leftover newline character from the previous scan.next()
        scan.nextLine();
        // Prompt for and read the user's full name (reads the whole line).
        System.out.println("Enter your full name");
        String fullName = scan.nextLine();

        // Prompt for and read the user's age (as an integer).
        System.out.println("Enter your age");
        int age = scan.nextInt();

        // Prompt for and read the user's father's name (reads until a space).
        System.out.println("Enter your fathername");
        String fatherName = scan.next();

        // Prompt for and read the user's gender (reads until a space).
        System.out.println("Enter your gender");
        String gender = scan.next();

        // Prompt for and read the user's height in feet (as a float).
        System.out.println("Enter your height in ft as Eg 5.0");
        float heightInFeet = scan.nextFloat();

        // Prompt for and read the user's weight in kilograms (as a float).
        System.out.println("Enter your weight in kgs");
        float weightInKgs = scan.nextFloat();

        // Confirm the entered details with the user.
        System.out.println("please confirm your first name : " + firstName);
        System.out.println("please confirm your full name : " + fullName);
        System.out.println("please confirm your age : " + age);
        System.out.println("please confirm your gender : " + gender);
        System.out.println("please confirm your weight : " + weightInKgs);
        System.out.println("please confirm your height : " + heightInFeet);
        System.out.println("please confirm your fathers name : " + fatherName);

        // Close the Scanner to release resources.
        scan.close();

    }

}
