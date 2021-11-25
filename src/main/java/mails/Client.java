package mails;

import lombok.Getter;

@Getter
public class Client {
    private int id;
    private String name;
    private int age;
    private String email;
    private Gender sex;

    public Client(String name, Gender sex, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.sex = sex;
        this.id = IDGenerator.generateID();

    }

    private static class IDGenerator {
        private static int counter = 0;

        public static int generateID() {
            return counter++;
        }
    }

}
