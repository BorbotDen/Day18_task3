
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Day18Task2Test {

    @Test
    void five() {
        Assertions.assertEquals(5, Main.count7(717771237), "717771237");
    }

    @Test
    void two() {
        Assertions.assertEquals(2, Main.count7(1712370), "1712370");
    }

    @Test
    void zero() {
        Assertions.assertEquals(0, Main.count7(-112380), "-112380");
    }
}