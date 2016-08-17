package com.nwjon.safari.advjava;

/**
 * Created by jondann on 8/16/16.
 */
public class UseHR {

    public static void main(String[] args) {
        HR hr = new HR();
        hr.hire(new Salaried("Foo"));
        hr.hire(new Salaried("Guy"));
        hr.hire(new Salaried());
        hr.printEverybody();
        hr.payEverybody();
    }
}
