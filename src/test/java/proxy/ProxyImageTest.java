package proxy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProxyImageTest {
    ProxyImage image;

    @BeforeEach
    void setUp() {
        image = new ProxyImage("nudes");
    }

    @Test
    void getFileName() {
        assertEquals(image.getFileName(), "nudes");
    }
}