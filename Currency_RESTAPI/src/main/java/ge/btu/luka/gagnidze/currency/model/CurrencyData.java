package ge.btu.luka.gagnidze.currency.model;

import java.util.ArrayList;

public class CurrencyData {
    private static ArrayList<Currency> currencydata;

    private CurrencyData() {
    }

    public static ArrayList<Currency> getInstance() {
        if (currencydata == null) {
            currencydata = new ArrayList<>();
            currencydata.add(new Currency("USD", 3.16, 3.2));
            currencydata.add(new Currency("EUR", 3.425, 3.475));
            currencydata.add(new Currency("GBP", 3.84, 3.94));
            currencydata.add(new Currency("RUB", 4.12, 4.25));
            currencydata.add(new Currency("TRY", 0.4, 0.47));
            currencydata.add(new Currency("AZN", 1.6, 1.84));
        }

        return currencydata;
    }
}