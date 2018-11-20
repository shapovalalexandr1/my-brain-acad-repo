package ua.zp.brainacad.brain.lab6;

import ua.zp.brainacad.brain.lab6.api.CurrencyConvertor;

import static ua.zp.brainacad.brain.lab6.NBU.*;

public class AngolenkoMoneyAgent implements CurrencyConvertor {
    public static double USD_CURRENCY_RATIO = 1.9;
    public static double EUR_CURRENCY_RATIO = 2.0;

    @Override
    public double convertUAHToUSD(double value) {return value / UAH_TO_USD_OFFICIAL / USD_CURRENCY_RATIO;}

    @Override
    public double convertUSDtoUAH(double value){return value * USD_TO_UAH_OFFICIAL * USD_CURRENCY_RATIO;}

    @Override
    public double convertUAHToEUR(double value) {return value / UAH_TO_EUR_OFFICIAL / EUR_CURRENCY_RATIO;}

    @Override
    public double convertEURtoUAH(double value){return value * EUR_TO_UAH_OFFICIAL * EUR_CURRENCY_RATIO;}

    public void askExchangeRates(String currency) // USD, EUR
    {
        // TODO switch...case for print specific currency exchange rates
        switch (currency){
            case "Почём баксы?": double buyUsd = UAH_TO_USD_OFFICIAL / USD_CURRENCY_RATIO;
                double saleUsd = USD_TO_UAH_OFFICIAL * USD_CURRENCY_RATIO;
                System.out.printf("Меняла! USD: sale = %f, buy = %f", buyUsd, saleUsd);
                System.out.println();
                break;
            case "Почём евро?" :
                double buyUsd2 = UAH_TO_EUR_OFFICIAL / EUR_CURRENCY_RATIO;
                double saleUsd2 = EUR_TO_UAH_OFFICIAL * EUR_CURRENCY_RATIO;
                System.out.printf("Меняла! EUR: sale = %f, buy = %f", buyUsd2, saleUsd2);
                System.out.println();
                break;
                default: System.out.println("Чебуреки за углом");
        }
    }
}
