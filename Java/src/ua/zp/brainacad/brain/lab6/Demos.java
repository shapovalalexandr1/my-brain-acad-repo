package ua.zp.brainacad.brain.lab6;


import ua.zp.brainacad.brain.lab6.api.CurrencyBoard;
import ua.zp.brainacad.brain.lab6.api.CurrencyConvertor;

import static ua.zp.brainacad.brain.lab6.NBU.*;

public class Demos implements CurrencyConvertor, CurrencyBoard {

    public static double USD_CURRENCY_RATIO = 1.1;
    public static double EUR_CURRENCY_RATIO = 1.2;

    @Override
    public double convertUAHToUSD(double value) {
        return value / UAH_TO_USD_OFFICIAL / USD_CURRENCY_RATIO;
    }

    @Override
    public double convertUSDtoUAH(double value) {return value * USD_TO_UAH_OFFICIAL * USD_CURRENCY_RATIO; }

    @Override
    public double convertUAHToEUR(double value) {return value / UAH_TO_EUR_OFFICIAL / EUR_CURRENCY_RATIO;}

    @Override
    public double convertEURtoUAH(double value) {return value * EUR_TO_UAH_OFFICIAL * EUR_CURRENCY_RATIO;}

    @Override
    public void displayUSD() {
        double buyUsd = UAH_TO_USD_OFFICIAL / USD_CURRENCY_RATIO;
        double saleUsd = USD_TO_UAH_OFFICIAL * USD_CURRENCY_RATIO;
        System.out.printf("Demos! USD: sale = %f, buy = %f", buyUsd, saleUsd);
        System.out.println();
    }

    @Override
    public void displayEUR() {
        double buyUsd = UAH_TO_EUR_OFFICIAL / EUR_CURRENCY_RATIO;
        double saleUsd = EUR_TO_UAH_OFFICIAL * EUR_CURRENCY_RATIO;
        System.out.printf("Demos! EUR: sale = %f, buy = %f", buyUsd, saleUsd);
        System.out.println();
    }
}