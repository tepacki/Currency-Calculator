package org.example;

import java.util.Objects;

public class Result {
    private final String code;
    private final double amount;
    private final double exchanged;
    private final String action;

    public Result(String code, double amount, double exchanged, String action) {
        this.code = code;
        this.amount = amount;
        this.exchanged = exchanged;
        this.action = action;
    }

    public String getCode() {
        return code;
    }

    public double getAmount() {
        return amount;
    }

    public double getExchanged() {
        return exchanged;
    }

    @Override
    public String toString() {
        if (action.equals("buy")) {
            return "For " + amount + " PLN you will get: " + exchanged + " " + code;
        }
        return "For " + amount + " " + code + " you will get: " + exchanged + " PLN";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Result result = (Result) o;
        return Double.compare(amount, result.amount) == 0 && Double.compare(exchanged, result.exchanged) == 0 && Objects.equals(code, result.code) && Objects.equals(action, result.action);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, amount, exchanged, action);
    }
}
