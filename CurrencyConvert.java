package currencyConvert;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CurrencyConvert {
    private static final Map<String, Double> exchangeRates = new HashMap<>();

    static {
        // Populate exchange rates (static for simplicity)
        exchangeRates.put("USD", 1.0);
        exchangeRates.put("EUR", 0.85);
        exchangeRates.put("GBP", 0.75);
        // Add more currencies as needed
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter the amount to convert: ");
        double amount = scanner.nextDouble();

        System.out.print("Enter the source currency (USD/EUR/GBP): ");
        String sourceCurrency = scanner.next().toUpperCase();

        System.out.print("Enter the target currency (USD/EUR/GBP): ");
        String targetCurrency = scanner.next().toUpperCase();

        // Conversion
        double convertedAmount = convertCurrency(amount, sourceCurrency, targetCurrency);

        // Display Result
        System.out.printf("%.2f %s = %.2f %s%n", amount, sourceCurrency, convertedAmount, targetCurrency);

        scanner.close();
    }

    private static double convertCurrency(double amount, String sourceCurrency, String targetCurrency) {
        double sourceRate = exchangeRates.getOrDefault(sourceCurrency, 0.0);
        double targetRate = exchangeRates.getOrDefault(targetCurrency, 0.0);

        if (sourceRate == 0.0 || targetRate == 0.0) {
            System.out.println("Invalid currency code(s). Please check and try again.");
            System.exit(1);
        }

        return amount * (targetRate / sourceRate);
    }
}
