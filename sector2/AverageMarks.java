import java.util.Scanner;

public class AverageMarks{
    /* This program takes 5 marks from the 5 units a student did last semester and computes the average and displays it on the screen*/

    public static void main(String[] args){
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter marks for Unit 1
        System.out.println("Unit 1: ");

        // Read the input provided by the user
        float unit1= scanner.nextFloat();

        // Prompt the user to enter marks for Unit 2
        System.out.println("Unit 2: ");

        // Read the input provided by the user
        float unit2= scanner.nextFloat();

        // Prompt the user to enter marks for Unit 3
        System.out.println("Unit 3: ");

        // Read the input provided by the user
        float unit3= scanner.nextFloat();

        // Prompt the user to enter marks for Unit 4
        System.out.println("Unit 4: ");

        // Read the input provided by the user
        float unit4= scanner.nextFloat();

        // Prompt the user to enter marks for Unit 5
        System.out.println("Unit 5: ");

        // Read the input provided by the user
        float unit5= scanner.nextFloat();

        // Calculate average
        double average = (unit1 + unit2 + unit3 + unit4 + unit5)/5.0;
        
        // display
        System.out.printf("Average marks: %.2f", average);

        // Close the scanner object to release resources (recommended)
        scanner.close();
    }
}
