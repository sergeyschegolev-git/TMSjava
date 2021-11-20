package io.utils;

public final class TextUtils {
    private TextUtils() {

    }

    public static boolean isPalindrome(String word) {
        if (word.length() == 1) {
            return false;
        }
        String clean = word.replaceAll("\\s+", "").toLowerCase();
        StringBuilder plain = new StringBuilder(clean);
        StringBuilder reverse = plain.reverse();
        return (reverse.toString()).equals(clean);
    }

    public static boolean isAnySymbolsInLine(String line) {
        return !line.isBlank();
    }

    public static boolean hasPalindromeInString(String string) {
        String[] words = string.split(" ");

        for (String word : words) {
            if (isPalindrome(word)) {
                return true;
            }
        }

        return false;
    }

    public static boolean isSentenceConsistWordsQuantity(int from, int to, String sentence) {
        String[] words = sentence.split(" ");
        return words.length >= from && words.length <= to;
    }

    public static boolean isTextContainWords(String text, String[] words) {
        for (String word : words) {
            if (isTextContainWord(text, word)) {
                return true;
            }
        }

        return false;
    }

    public static boolean isTextContainWord(String text, String word) {
        return text.contains(word);
    }
}
