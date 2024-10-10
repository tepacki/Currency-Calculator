package org.example;

import org.example.exchangers.Exchanger;
import org.example.models.Rates;
import org.example.utils.ExchangerHandler;

import java.io.IOException;
import java.util.List;

import static org.example.utils.Retriever.retrieveRates;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Rates> rates = retrieveRates();
        Exchanger exchanger = new Exchanger(rates);
        ExchangerHandler exchangerHandler = new ExchangerHandler(exchanger);
        exchangerHandler.handleExchanger(args);

    }
}