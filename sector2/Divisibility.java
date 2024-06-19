import java.util.Scanner;

public class Divisibility{
    /* This program checks if a number is divisible by integers in the range of 0-9*/

    public static void main(String[] args){
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter integer
        System.out.println("Number: ");

        // Read the input provided by the user
        int num= scanner.nextInt();

        // check for its divisiblity
        if ( num%1 == 0 ){
            // divisible by two
            System.out.printf("%d is divisible by one because all numbers are divisible by one\n", num);
        } 

        if ( num%2 == 0 ){
            // divisible by two
            System.out.printf("%d is divisible by two because it is an even number\n", num);
        } 
        
        if ( num%3 == 0 ){
            // divisible by three
            System.out.printf("%d is divisible by three because it is an odd number\n", num);
        }
        
        if ( num%4 == 0 ){
            // divisible by four
            System.out.printf("%d is divisible by four because it is an even number\n", num);
        }
        
        if ( num%5 == 0 ){
            // divisible by five
            System.out.printf("%d is divisible by five because it ends with a 0 or a 5\n", num);

        }
        
        if ( num%6 == 0 ){
            // divisible by six
            System.out.printf("%d is divisible by six because it is divisible by both two and three\n", num);
        }
        
        if ( num%7 == 0 ){
            // divisible by seven
            System.out.printf("%d is divisible by seven\n", num);

        }
        
        if ( num%8 == 0 ){
            // divisible by eight
            System.out.printf("%d is divisible by eight because it is an even number\n", num);
        }
        
        if ( num%9 == 0 ){
            // divisible by nine
            System.out.printf("%d is divisible by nine because it is divisible by 3\n", num);
        }

        // Close the scanner object to release resources (recommended)
        scanner.close();
    }
}