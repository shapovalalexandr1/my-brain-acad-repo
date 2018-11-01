package ua.zp.brainacad.brain.lab5;

/**
 * Created by Brain25 on 01.11.2018.
 */
public class Fish {
    private double length;
    private String color;

    public Fish(double length, String color) {
        this.length = length;
        this.color = color;
    }


    public void swim(){
        System.out.println("Рыбка плавает");
    }
    public void eat() {
        System.out.println("Рыбка ест");
    }

    public double getLength() {
        return length;
    }

    public String getColor() {
        return color;
    }
}
