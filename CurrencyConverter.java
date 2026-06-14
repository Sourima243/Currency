import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== CURRENCY CONVERTER =====");
        System.out.println("Available Currencies:");
        System.out.println("1. USD (US Dollar)");
        System.out.println("2. INR (Indian Rupee)");
        System.out.println("3. EUR (Euro)");
        System.out.println("4. GBP (British Pound)");

        System.out.print("\nSelect Base Currency (1-4): ");
        int base = sc.nextInt();

        System.out.print("Select Target Currency (1-4): ");
        int target = sc.nextInt();

        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();

        double amountInUSD = 0;
        double convertedAmount = 0;

        // Convert base currency to USD first
        switch (base) {
            case 1: // USD
                amountInUSD = amount;
                break;
            case 2: // INR
                amountInUSD = amount / 83.0;
                break;
            case 3: // EUR
                amountInUSD = amount / 0.92;
                break;
            case 4: // GBP
                amountInUSD = amount / 0.79;
                break;
            default:
                System.out.println("Invalid Base Currency!");
                return;
        }

        // Convert USD to target currency
        switch (target) {
            case 1:
                convertedAmount = amountInUSD;
                break;
            case 2:
                convertedAmount = amountInUSD * 83.0;
                break;
            case 3:
                convertedAmount = amountInUSD * 0.92;
                break;
            case 4:
                convertedAmount = amountInUSD * 0.79;
                break;
            default:
                System.out.println("Invalid Target Currency!");
                return;
        }

        String[] currency = {"USD", "INR", "EUR", "GBP"};

        System.out.println("\n===== CONVERSION RESULT =====");
        System.out.printf("%.2f %s = %.2f %s\n",
                amount,
                currency[base - 1],
                convertedAmount,
                currency[target - 1]);

        sc.close();
    }
}
