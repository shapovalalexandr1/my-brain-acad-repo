package ua.zp.brainacad.brain.lab5;

public class Price {
    private double powerPrice;
    private double waterPrice;
    private double foodPrice;


    public Price(double powerPrice, double waterPrice, double foodPrice) {
        this.powerPrice = powerPrice;
        this.waterPrice = waterPrice;
        this.foodPrice = foodPrice;
    }

    public double getPowerPrice() {
        return powerPrice;
    }

    public double getWaterPrice() {
        return waterPrice;
    }

    public double getFoodPrice() {
        return foodPrice;
    }
}
