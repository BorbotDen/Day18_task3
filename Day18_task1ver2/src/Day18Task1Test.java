
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Day18Task1Test {

    @Test
    void recursion1() {
        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
        Assertions.assertEquals(65346, Main.recursionSum(numbers, numbers.length),
                "[1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311]");
    }

    @Test
    void recursion2() {
        int[] numbers = {402, -50, -249, 215, 665, 311};
        Assertions.assertEquals(1294, Main.recursionSum(numbers, numbers.length),
                "[402, -50, -249, 215, 665, 311]");
    }

    @Test
    void recursion3() {
        int[] numbers = {-402, -50, -249, -15, -665, -311};
        Assertions.assertEquals(-1692, Main.recursionSum(numbers, numbers.length),
                "[-402, -50, -249, -15, -665, -311]");
    }
}