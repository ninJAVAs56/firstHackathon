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
        return string1 + string2;
    }

    public static boolean contains(String source, char symbol) {
        boolean contains = false;
        if (source.contains(""+symbol)){
            contains = true;
        }
        return contains;
    }

    /**
     * Checks if the given string ends with the specified character.
     *
     * @param source The input string to be checked.
     * @param target The character to check for at the end of the string.
     * @return True if the string ends with the specified character; otherwise, false.
     * @author Lyubima Malkocheva
     */
    public static boolean endsWith(String source, char target) {
        if (source != null && !source.isEmpty()) {
            int index = source.length();
            char search = source.charAt(index - 1);
            return search == target;
        }
        return false;
    }

    /**
     * Finds the index of the first occurrence of the specified character in the given string.
     *
     * @param source The input string to search within.
     * @param target The character to search for.
     * @return The index of the first occurrence of the character in the string, or -1 if not found.
     * @author Lyubima Malkocheva
     */
    public static int firstIndexOf(String source, char target) {
        if (!source.isEmpty()) {
            for (int i = 0; i < source.length(); i++) {
                if (source.charAt(i) == target) {
                    return i;
                }
            }
        }
        return -1;
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

    /**
     * Returns a padded <code>string1</code> with added symbol/s at the end when a given length is not 0>.
     *
     * @param source The string which has to be padded
     * @param length The expected length of the new string
     * @param paddingSymbol The symbol to be added to the string
     * @return A string after padding if any is done.
     *
     * @author Aleksandar Mechkarov
     */
    public static String padEnd(String source, int length, char paddingSymbol) {
        int sourceLength = source.length();
        int lengthLeft = length-sourceLength;
        if(sourceLength>length){
            return source;
        }
        else if(length==0){
            return source;
        }
        else {
            for(int i = 0;i<lengthLeft;i++){
                source += paddingSymbol;
            }
        }
        return source;
    }
    /**
     * Returns a padded <code>string1</code> with added symbol/s at the beginning when a given length is not 0>.
     *
     * @param source The string which has to be padded
     * @param length The expected length of the new string
     * @param paddingSymbol The symbol to be added to the string
     * @return A string after padding if any is done.
     *
     * @author Aleksandar Mechkarov
     */
    public static String padStart(String source, int length, char paddingSymbol) {
        int sourceLength = source.length();
        int lengthLeft = length-sourceLength;
        String addSymbol = "";
        if(sourceLength>length){
            return source;
        }
        else if(length==0){
            return source;
        }
        else {
            for(int i = 0;i<lengthLeft;i++){
                addSymbol+=paddingSymbol;
            }
            addSymbol+=source;
            source = addSymbol;
        }
        return source;
    }

    /**
     * Java program to demonstrate the usage of
     * // repeat() method
     *
     * @param source  String
     * @param times - numbers of the times
     * @return returns source repeated
     *
     * @author Ivan Radev
     */

    public static String repeat(String source, int times) {
        times = 4;

        return source.repeat(times);
    }

    /**
     * Java program to demonstrate the usage of
     * // reverse() method
     *
     * @param source  String
     * @param -
     * @return reverses the given string
     *
     * @author Ivan Radev
     */
    public static String reverse(String source) {
        String string = "";
        for (int i = source.length() - 1; i >= 0; i--)
        {
            string += source.charAt(i);
        }
        return string;
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
