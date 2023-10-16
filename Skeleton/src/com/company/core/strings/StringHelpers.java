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

    /**
     * Finds the index of the last occurrence of the specified character in the given string.
     *
     * This method searches for the last occurrence of the symbol character
     * in the provided source string. If the character is found, the method
     * returns its index; otherwise, it returns -1.
     *
     * @param source The string in which to search for the target character.
     * @param symbol The character to be found within the string.
     * @return The index of the last occurrence of the target character in the string, or -1 if the character is not found.
     *
     * @author Kalina Borissova
     */
    public static int lastIndexOf(String source, char symbol) {
        int result = -1;
        char[] chars = source.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == symbol){
                result = i;
            }
        }
        return result;
    }

    /**
     * Pads the given string with a specified padding symbol to achieve the desired length.
     *
     * This method pads the provided source string with the given
     * paddingSymbol on both sides until the resulting string reaches
     * the specified length. If the total padding needed is an odd number,
     * an additional padding symbol is added to the right side of the string.
     *
     * @param source The original string to be padded.
     * @param length The desired length of the padded string.
     * @param paddingSymbol The character used for padding.
     * @return A string padded with the specified symbol on both sides to reach the desired length.
     *
     * @throws IllegalArgumentException If the specified length is less than the length of the source string.
     *
     * @author Kalina Borissova
     */
    public static String pad(String source, int length, char paddingSymbol) {
        String result = "";
        int amm = length - source.length();
        amm = amm / 2;
        for (int i = 0; i < amm; i++) {
            result += paddingSymbol;
        }
        System.out.println(result);
        result += source;
        for (int i = 0; i < amm; i++) {
            result += paddingSymbol;
        }
        return result;
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

    /**
     * Section: Тhe elements in the string from the start to the end remain
     *
     * @param source New string with the new elements from the <code>startIndex</code> position to
    <code>endIndex</code> position
     * @return string that starts with the character on start position to the character
     on end position.
     *
     * @author Kaloyan Enchev
     */
    public static String section(String source, int start, int end)
    {
        String string = "";
        for (int i = start, j = 0; i < end + 1; i++, j++)
        {
            string += source.charAt(i);
        }

        return string;
    }

    /**
     * Checks if the first char of the string is same as the <code>target</code>
     *
     * @return true if the first char of source is same as the target one. Return false when
     the first char of the string is not same as the target one or when source is empty
     *
     * @author Kaloyan Enchev
     */
    public static boolean startsWith(String source, char target)
    {
        if (source.length() == 0 || source.charAt(0) != target)
        {
            return false;
        }

        return true;
    }

}
