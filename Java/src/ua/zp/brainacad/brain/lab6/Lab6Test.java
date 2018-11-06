package ua.zp.brainacad.brain.lab6;

public class Lab6Test {

    public static void main(String[] args) {
        PrivatBank pBank=new PrivatBank();
        PrivatBank pBank2=new PrivatBank();
        pBank.displayUSD();
        pBank.displayEUR();
       // pBank2.displayUSD();
       // pBank2.displayEUR();
        System.out.println("поменяли 100$ на "+pBank.convertUSDtoUAH(100.0)+"грн");
        System.out.println("поменяли 1000грн на "+pBank.convertUAHToUSD(1000.0)+"$");

        Demos demos=new Demos();
        demos.displayUSD();
        demos.displayEUR();
        System.out.println("поменяли 100$ на "+demos.convertUSDtoUAH(100.0)+"грн");
        System.out.println("поменяли 1000грн на "+demos.convertUAHToUSD(1000.0)+"$");

        NBU.cheapenUAH(10);

        pBank.displayUSD();
        pBank.displayEUR();
       // pBank2.displayUSD();
       // pBank2.displayEUR();
        System.out.println("поменяли 100$ на "+pBank.convertUSDtoUAH(100.0)+"грн");
        System.out.println("поменяли 1000грн на "+pBank.convertUAHToUSD(1000.0)+"$");


        demos.displayUSD();
        demos.displayEUR();
        System.out.println("поменяли 100$ на "+demos.convertUSDtoUAH(100.0)+"грн");
        System.out.println("поменяли 1000грн на "+demos.convertUAHToUSD(1000.0)+"$");

        AngolenkoMoneyAgent menyala=new AngolenkoMoneyAgent();
        menyala.askExchangeRates("Почём евро?");

    }
}
