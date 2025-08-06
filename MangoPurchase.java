// wap that ask the current price of dozen mangoes in the market.Thrn ask the number of mangoes the the customer wants to purchases. finally calculate the total price he/she has to pay.
import java.util.Scanner;
public class MangoPurchase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask for the current price of a dozen mangoes
        System.out.print("Enter the current price of a dozen mangoes: ");
        double pricePerDozen = scanner.nextDouble();
        
        // Ask for the number of mangoes the customer wants to purchase
        System.out.print("Enter the number of mangoes you want to purchase: ");
        int numberOfMangoes = scanner.nextInt();
        
        // Calculate the total price
        double pricePerMango = pricePerDozen / 12;
        double totalPrice = pricePerMango * numberOfMangoes;
        
        // Display the total price
        System.out.printf("The total price for %d mangoes is: %.2f%n", numberOfMangoes, totalPrice);
        
        scanner.close();
    }
}