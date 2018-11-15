package ua.zp.brainacad.brain.lab7.interfaces.communication;

public interface MailSender {

    String createMail(String mail);

    void sendMail(String mail);
}
