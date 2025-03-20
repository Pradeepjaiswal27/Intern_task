/*Currency Converter:
Create a class CurrencyConverter that utilizes Java's BigDecimal wrapper class for precise currency calculations.
Define exchange rates: Store exchange rates for a few currencies (e.g., USD, EUR, GBP) within the class 
(you can use static final BigDecimal fields for this). in java */
package Task19;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class CurrencyConverter {
    private static final BigDecimal USD_TO_EUR = new BigDecimal("0.92");
    private static final BigDecimal USD_TO_GBP = new BigDecimal("0.78");
    @SuppressWarnings("deprecation")
    private static final BigDecimal EUR_TO_USD = BigDecimal.ONE.divide(USD_TO_EUR, 4, BigDecimal.ROUND_HALF_UP);
    @SuppressWarnings("deprecation")
    private static final BigDecimal GBP_TO_USD = BigDecimal.ONE.divide(USD_TO_GBP, 4, BigDecimal.ROUND_HALF_UP);

    private static final Map<String, BigDecimal> exchangeRates = new HashMap<>();

    static {
        exchangeRates.put("USD_EUR", USD_TO_EUR);
        exchangeRates.put("USD_GBP", USD_TO_GBP);
        exchangeRates.put("EUR_USD", EUR_TO_USD);
        exchangeRates.put("GBP_USD", GBP_TO_USD);
        exchangeRates.put("EUR_GBP", EUR_TO_USD.multiply(USD_TO_GBP));
        exchangeRates.put("GBP_EUR", GBP_TO_USD.multiply(USD_TO_EUR));
    }

    @SuppressWarnings("deprecation")
    public static BigDecimal convert(String fromCurrency, String toCurrency, BigDecimal amount) {
        if (fromCurrency.equals(toCurrency)) {
            return amount;
        }

        String key = fromCurrency + "_" + toCurrency;
        BigDecimal rate = exchangeRates.get(key);

        if (rate == null) {
            throw new IllegalArgumentException("Invalid currency conversion: " + fromCurrency + " to " + toCurrency);
        }

        return amount.multiply(rate).setScale(2, BigDecimal.ROUND_HALF_UP);
    }

    public static void main(String[] args) {
        BigDecimal amount = new BigDecimal("100");
        System.out.println("100 USD to EUR: " + convert("USD", "EUR", amount));
        System.out.println("100 EUR to USD: " + convert("EUR", "USD", amount));
        System.out.println("100 USD to GBP: " + convert("USD", "GBP", amount));
        System.out.println("100 GBP to EUR: " + convert("GBP", "EUR", amount));
    }
}
