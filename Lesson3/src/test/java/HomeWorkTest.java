import static org.junit.jupiter.api.Assertions.*;

class HomeWorkTest {

    @org.junit.jupiter.api.Test
    void operation() {
        assertEquals(2, HomeWork.operation(1));
        assertEquals(-3, HomeWork.operation(-1));
    }

    @org.junit.jupiter.api.Test
    void calculateCountOfOddElementsInMatrix() {
        assertEquals(3, HomeWork.calculateCountOfOddElementsInMatrix(new int[]{1, 2, 3, 4, 5}));
    }
}