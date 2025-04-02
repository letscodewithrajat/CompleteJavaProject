package com.rajat.exception;

/**
 * @author rajatsrivastava
 **/
class Amount {
    private String currency;
    private int amount;

    public Amount(String currency, int amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public void add(Amount other) throws CurrenciesDoNotMatchException {
        if (!this.currency.equals(other.currency)) {
            // throw new RuntimeException("Currencies don't match");
            // throw new Exception("Currencies don't match " + this.currency + " & " + other.currency);
            throw new CurrenciesDoNotMatchException("Currencies don't match " + this.currency + " & " + other.currency);
        }
        this.amount = this.amount + other.amount;
    }

    @Override
    public String toString() {
        return "amount=" + amount +
                " currency='" + currency
                ;
    }
}


class CurrenciesDoNotMatchException extends Exception {
    //  class CurrenciesDoNotMatchException extends RuntimeException {
    public CurrenciesDoNotMatchException(String message) {
        super(message);
    }
}

public class ThrowingExceptionRunner {
    public static void main(String[] args) throws CurrenciesDoNotMatchException {
        Amount amount1 = new Amount("USD", 10);
        //  Amount amount2 = new Amount("USD", 20);
        //amount1.add(amount2);
        System.out.println(amount1);
        Amount amount3 = new Amount("INR", 20);
        amount1.add(amount3);

    }
}
