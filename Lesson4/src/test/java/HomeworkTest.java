import static org.junit.jupiter.api.Assertions.*;

class HomeWorkTest {

    @org.junit.jupiter.api.Test
    void multiple() {
        assertEquals(8, Homework.multiple(2, 4));
        assertEquals(81, Homework.multiple(9, 9));
        assertEquals(-81, Homework.multiple(-9, 9));
        assertEquals(81, Homework.multiple(-9, -9));
        assertEquals(0, Homework.multiple(2, 0));
    }

    @org.junit.jupiter.api.Test
    void findDoubles() {
        assertEquals("There is no duplicates", Homework.findDoubles(new int[]{1, 2, 3}));
        assertEquals("There are following duplicates 2, 3", Homework.findDoubles(new int[]{2, 2, 3, 3, 4, 5}));
    }

    @org.junit.jupiter.api.Test
    void getLine() {
        assertEquals("   **", Homework.getLine(2, 3));
        assertEquals("**", Homework.getLine(2, 0));
    }

    @org.junit.jupiter.api.Test
    void findAndChangePlaceForMaxItemInArray() {
        assertArrayEquals(new int[]{1000, 4, -20, 100, 99, 0}, Homework.findAndChangePlaceForMaxItemInArray(new int[]{0, 4, -20, 100, 99, 1000}));
    }

    @org.junit.jupiter.api.Test
    void findMaxItemAndItsIndex() {
        assertArrayEquals(new int[]{1000, 5}, Homework.findMaxItemAndItsIndex(new int[]{0, 4, -20, 100, 99, 1000}));
    }
}