package mails;

public class MailSender {
    public static void sendMail(MailInfo info){
        System.out.println(info.getText()+" was sent to "+info.getEmail());
    }
}
