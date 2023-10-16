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
