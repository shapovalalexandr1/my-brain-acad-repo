package ua.zp.brainacad.brain.lab7.CoffeMachine;

/**
 * Created by Brain25 on 15.11.2018.
 */
public class Americano extends Drink {
    public int temp;

    public void addCoffee(){
        System.out.println("add coffee");
    }

    @Override
    public void addSugar(int sug) {
        System.out.println("add sugar in Americano " +sug);
    }

    public void addWater(int kol, int temp) {
        System.out.println("add water "+kol+" ml temp "+temp+"C");
    }
}
