package mails;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class MailBox {
    private List<MailInfo> infos = new ArrayList<>();

    public void addMailInfo(MailInfo info) {
        infos.add(info);
    }
    public void sendAll() {
        for (MailInfo info: infos) {
            MailSender.sendMail(info);
        }
    }
}