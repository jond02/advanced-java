package com.nwjon.safari.advjava;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by jondann on 8/16/16.
 */
public class CurrencyPrinter {

    public static void main(String[] args) {
        double amount = 1234533.32456;
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        System.out.println(nf.format(amount));

        nf = NumberFormat.getCurrencyInstance(Locale.UK);
        System.out.println(nf.format(amount));

        System.out.println(nf.getClass().getName());
    }

}

