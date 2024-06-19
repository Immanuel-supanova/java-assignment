import java.util.Scanner;

public class SurnameAge{
    /* This program takes surname and age from user, checks the number of characters in the surname and also checks if the age is an odd number or even number*/

    public static void main(String[] args){
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter their name
        System.out.println("Enter your surname: ");

        // Read the input provided by the user
        String surname = scanner.nextLine();

        // Prompt the user to enter their age
        System.out.println("Enter your age: ");

        // Read the input provided by the user
        int age = scanner.nextInt();

        System.out.printf("The number of characters is %d\n", surname.length());
        if (age%2 == 0 ){
            System.out.println("Your current age is an even number");
        } else {
            System.out.println("Your current age is an odd number");
        }

        // Close the scanner object to release resources (recommended)
        scanner.close();
    }
}