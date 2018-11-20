package ua.zp.brainacad.brain.lab7.CoffeMachine;

/**
 * Created by Brain25 on 15.11.2018.
 */
public class Drink {

    //public int kol = 100;
    public String name;

    public void addWater(int kol) {
        System.out.println("add water " + kol);
    }

    public void addSugar(int sug) {
        System.out.println("add sugar " + sug);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Drink drink = (Drink) o;

        return name != null ? name.equals(drink.name) : drink.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                '}';
    }
}


