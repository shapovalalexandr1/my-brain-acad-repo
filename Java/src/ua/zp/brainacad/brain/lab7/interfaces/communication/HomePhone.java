package ua.zp.brainacad.brain.lab7.interfaces.communication;

import ua.zp.brainacad.brain.lab7.interfaces.communication.Caller;

public class HomePhone implements Caller {

    @Override
    public void call(String contact) {
        System.out.println("Press buttons");
        System.out.println("Call my mom!");
    }

}
