import io.utils.TextUtils;

import static org.junit.jupiter.api.Assertions.*;

class TextUtilsTest {

    @org.junit.jupiter.api.Test
    void isAnySymbolsInLine_is_false() {
        assertFalse(TextUtils.isAnySymbolsInLine("     "));
    }

    @org.junit.jupiter.api.Test
    void isAnySymbolsInLine_is_true() {
        assertTrue(TextUtils.isAnySymbolsInLine("sdf "));
    }

    @org.junit.jupiter.api.Test
    void isPalindromeInString_is_false() {
        assertFalse(TextUtils.hasPalindromeInString("asdssa qwd asd qw qa"));
    }

    @org.junit.jupiter.api.Test
    void isPalindromeInString_is_true() {
        assertTrue(TextUtils.hasPalindromeInString("adds sds asdqwe"));
    }
}