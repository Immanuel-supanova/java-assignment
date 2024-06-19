import java.util.Scanner;

public class Calculator{
    /* This program takes two numbers as inputs and operator as character then calculates the two numbers based on the operator given*/

    public static void main(String[] args){
        int total;

        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter operator
        System.out.println("Operator(*, /, %, +, -): ");

        // Read the input provided by the user
        String operator = scanner.nextLine();

        // Prompt the user to enter first number
        System.out.println("First Number: ");

        // Read the input provided by the user
        int num1 = scanner.nextInt();

        // Prompt the user to enter second number
        System.out.println("Second Number: ");

        // Read the input provided by the user
        int num2 = scanner.nextInt();

        // Close the scanner object to release resources (recommended)
        scanner.close();

        if(operator.equals("+")) {
            total = num1 + num2;
            System.out.printf("Addition of %d and %d equals to %d", num1, num2, total);
        } else if(operator.equals("-")) {
            total = num1 - num2;
            System.out.printf("Subtraction of %d and %d equals to %d", num1, num2, total);
        } else if(operator.equals("*")) {
            total = num1 * num2;
            System.out.printf("Multiplication of %d and %d equals to %d", num1, num2, total);
        } else if(operator.equals("/")) {
            total = num1 / num2;
            System.out.printf("Division of %d and %d equals to %d", num1, num2, total);
        } else if(operator.equals("%")) {
            total = num1 % num2;
            System.out.printf("Modulus of %d and %d equals to %d", num1, num2, total);
        } else {
            System.out.println("Invalid operator");
        }

    }

}