//wap to print the reverse of a three digit tnumber
import java.util.Scanner;
 class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       
        // Ask the user to enter a three-digit number
        System.out.print("Enter a three-digit number: ");
        int number = scanner.nextInt();
        // Check if the number is a three-digit number
        if (number < 100 || number > 999) {
            System.out.println("Please enter a valid three-digit number.");
        } else {
            // Calculate the reverse of the number
            int reverse = 0;
            while (number != 0) {
                int digit = number % 10; // Get the last digit
                reverse = reverse * 10 + digit; // Build the reverse number
                number /= 10; // Remove the last digit
            }
            // Display the reversed number
            System.out.println("The reverse of the number is: " + reverse);
        }
        scanner.close();
    }}