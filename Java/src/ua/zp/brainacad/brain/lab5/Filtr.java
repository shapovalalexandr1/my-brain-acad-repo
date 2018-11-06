package ua.zp.brainacad.brain.lab5;

/**
 * Created by Brain25 on 01.11.2018.
 */
public class Filtr {
    private double performance;
    private double consumption;

    public Filtr(double performance, double consumption) {

        this.performance = performance;
        this.consumption = consumption;

    }

    public void clearWater(){

    }

    public double getPower() {
        return performance;
    }

    public double getConsumption() {
        return consumption;
    }
}
