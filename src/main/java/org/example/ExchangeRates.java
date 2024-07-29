package org.example;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ExchangeRates {
    private final String table;
    private final String no;
    private final String effectiveDate;
    private final List<Rates> rates;

    public ExchangeRates(@JsonProperty("table") String table,
                         @JsonProperty("no") String no,
                         @JsonProperty("effectiveDate") String effectiveDate,
                         @JsonProperty("rates") List<Rates> rates) {
        this.table = table;
        this.no = no;
        this.effectiveDate = effectiveDate;
        this.rates = rates;
    }

    public List<Rates> getRates() {
        return rates;
    }

    @Override
    public String toString() {
        return "ExchangeRates{" +
                "table='" + table + '\'' +
                ", no='" + no + '\'' +
                ", effectiveDate='" + effectiveDate + '\'' +
                ", rates=" + rates +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExchangeRates that = (ExchangeRates) o;
        return Objects.equals(table, that.table) && Objects.equals(no, that.no) && Objects.equals(effectiveDate, that.effectiveDate) && Objects.equals(rates, that.rates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(table, no, effectiveDate, rates);
    }
}
