import java.util.*;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] currencies = {"USD", "INR", "EUR", "GBP"};
        double[][] rates = {
            // USD,   INR,   EUR,   GBP
            {1.0, 83.0, 0.92, 0.78},  // USD
            {0.012, 1.0, 0.011, 0.0094}, // INR
            {1.09, 90.0, 1.0, 0.85},  // EUR
            {1.28, 105.0, 1.18, 1.0}  // GBP
        };

        System.out.println("Available Currencies:");
        for (int i = 0; i < currencies.length; i++) {
            System.out.println(i + 1 + ". " + currencies[i]);
        }

        System.out.print("Choose base currency (1-4): ");
        int base = sc.nextInt() - 1;

        System.out.print("Choose target currency (1-4): ");
        int target = sc.nextInt() - 1;

        System.out.print("Enter amount in " + currencies[base] + ": ");
        double amount = sc.nextDouble();

        double converted = amount * rates[base][target];
        System.out.println("Converted Amount: " + converted + " " + currencies[target]);
    }
}

