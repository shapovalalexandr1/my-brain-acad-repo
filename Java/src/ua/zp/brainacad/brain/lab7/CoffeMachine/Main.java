package ua.zp.brainacad.brain.lab7.CoffeMachine;

/**
 * Created by Brain25 on 15.11.2018.
 */
public class Main {


    public static void main(String[] args) {
        Americano americano = new Americano();
        americano.addCoffee();
        americano.addWater(150, 95);

        Drink americano2 = new Americano();
        americano2.addSugar(5);
        ((Americano) americano2).addCoffee();
    }
}