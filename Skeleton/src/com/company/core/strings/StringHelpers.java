package com.company.core.strings;

@SuppressWarnings("StringConcatenationInLoop")
public class StringHelpers {
    /**
     * Abbreviates a string, if its length extends the given length.
     *
     * @param source The string to be abbreviated
     * @param maxLength The maximum length, after which the string will be abrevviated, using "..."
     * @return A string that includes the initial string, up to the selected length, followed by "..."
     *
     * @author Petar Andreev
     */
    public static String abbreviate(String source, int maxLength) {
        String[] stringArray = source.split("");
        int length = maxLength;
        String dots = "...";
        String result = "";
        if(stringArray.length < maxLength){
            result = source;
        } else if (source.isEmpty()){
            result = "";
        } else {
            for (int i = 0; i < length; i++) {
                    result += stringArray[i];
            }
            result += dots;
        }
        return result;
    }
    /**
     * Capitalizes the first letter in a string.
     *
     * @param source The string to be abbreviated
     * @return The capitalized string.
     *
     * @author Petar Andreev
     */
    public static String capitalize(String source) {
        String[] stringArray = source.split("");
        stringArray[0] = stringArray[0].toUpperCase();
        String result = "";
        for (int i = 0; i < stringArray.length; i++) {
            result += stringArray[i];
        }
        return result;
    }

    public static String concat(String string1, String string2) {
        return null;
    }

    public static boolean contains(String source, char symbol) {
        return false;
    }

    public static boolean endsWith(String source, char target) {
        return false;
    }

    public static int firstIndexOf(String source, char target) {
        return 0;
    }

    public static int lastIndexOf(String source, char symbol) {
        return 0;
    }

    public static String pad(String source, int length, char paddingSymbol) {
        return null;

    }

    public static String padEnd(String source, int length, char paddingSymbol) {
        return null;
    }

    public static String padStart(String source, int length, char paddingSymbol) {
        return null;

    }

    public static String repeat(String source, int times) {
        return null;
    }

    public static String reverse(String source) {
        return null;
    }

    public static String section(String source, int start, int end) {
        return null;
    }

    public static boolean startsWith(String source, char target) {
        return false;
    }

}
