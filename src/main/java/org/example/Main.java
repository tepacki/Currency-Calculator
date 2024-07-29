package org.example;

import java.io.IOException;
import java.util.List;

import static org.example.Retriever.retrieveRates;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Rates> rates = retrieveRates();
        if (args.length == 0) {
            Menu menu = new Menu();
            menu.handleMenu();
        } else {
            String code = args[0]; //.toUpperCase();
            double amount = Double.parseDouble(args[1]);
            Exchanger exchanger = new Exchanger(rates);
            System.out.println(exchanger.buyCurrency(code, amount));
            System.out.println(exchanger.sellCurrency(code, amount));
        }

    }
}