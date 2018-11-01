package ua.zp.brainacad.brain.lab5;

/**
 * Created by Brain25 on 01.11.2018.
 */
public class Filtr {
    private double power;
    private double consumption;

    public Filtr(double power, double consumption) {
        this.power = power;
        this.consumption = consumption;
    }

    public void clearWater(){

    }

    public double getPower() {
        return power;
    }

    public double getConsumption() {
        return consumption;
    }
}
