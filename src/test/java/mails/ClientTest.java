package mails;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {
    Client client;

    @BeforeEach
    void setUp() {
        client = new Client("Oleno4ka", Gender.FEMALE, 18, "karakum@gmail.com");
    }

    @Test
    void getName() {
        assertEquals(client.getName(), "Oleno4ka");
    }

    @Test
    void getAge() {
        assertEquals(client.getAge(), 18);
    }

    @Test
    void getEmail() {
        assertEquals(client.getEmail(), "karakum@gmail.com");
    }

    @Test
    void getSex() {
        assertEquals(client.getSex(), Gender.FEMALE);
    }
}