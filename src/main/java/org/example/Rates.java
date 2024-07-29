package org.example;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Rates {
    private final String currency;
    private final String code;
    private final double mid;

    public Rates(@JsonProperty("currency") String currency,
                 @JsonProperty("code") String code,
                 @JsonProperty("mid") double mid) {
        this.currency = currency;
        this.code = code;
        this.mid = mid;
    }


    public String getCode() {
        return code;
    }

    public double getMid() {
        return mid;
    }

    @Override
    public String toString() {
        return "Currency= " + currency + "\t" +
                "code= " + code + "\t" +
                "mid=" + mid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rates rates = (Rates) o;
        return Double.compare(mid, rates.mid) == 0 && Objects.equals(currency, rates.currency) && Objects.equals(code, rates.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currency, code, mid);
    }
}
