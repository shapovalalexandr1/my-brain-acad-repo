package ua.zp.brainacad.brain.lab7.inheritance.devices;

public class Mobile extends AbstractDevice {

    @Override
    public void switchPower(){
        System.out.println("hold on/off button");
    }

    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.switchPower();
    }
}
