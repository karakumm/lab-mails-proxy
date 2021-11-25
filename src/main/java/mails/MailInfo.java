package mails;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;


@Getter @Setter
public class MailInfo {
    private Client client;
    private MailCode mailCode;

    public String getText() {
        String text = mailCode.generateText();
        HashMap<String, String > templates = new HashMap<String, String>();
        templates.put("%NAME", client.getName());
        templates.put("%AGE", Integer.toString(client.getAge()));

        for (String key: templates.keySet()) {
            text = text.replace(key, templates.get(key));
        }
        return text;
    }

    public String getEmail(){
        return client.getEmail();
    }
}