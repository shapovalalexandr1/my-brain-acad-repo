package ua.zp.brainacad.brain.lab5;

/**
 * Created by Brain25 on 01.11.2018.
 */
public class Aquarium {

    private double hight;
    private double width;
    private double depth;
    private double vol = hight*width*depth;
    private double temp;
    private  Type type;

    public Aquarium(double hight, double width, double depth, double vol, double temp) {
        this.hight = hight;
        this.width = width;
        this.depth = depth;
        this.vol = vol;
        this.temp = temp;
    }

    public void changeWater(){

    }

    public double getHight() {
        return hight;
    }

    public double getWidth() {
        return width;
    }

    public double getDepth() {
        return depth;
    }
    public double getVol() {
        return vol;
    }

    public double getTemp() {
        return temp;
    }
}
