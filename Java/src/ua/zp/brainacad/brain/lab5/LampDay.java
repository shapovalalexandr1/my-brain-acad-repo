package ua.zp.brainacad.brain.lab5;

/**
 * Created by Brain25 on 01.11.2018.
 */
public class LampDay {
    private double consumption;
    private String color;
    private boolean swich;

    public LampDay(double consumption, String color, boolean swich) {
        this.consumption = consumption;
        this.color = color;
        this.swich = swich;
    }

    public double getConsumption() {
        return consumption;
    }

    public String getColor() {
        return color;
    }
}
