package com.company.core.arrays;

@SuppressWarnings({"ManualArrayCopy", "ExplicitArrayFilling"})
public class ArrayHelpers {


    /**
     * Appends an element to an int[] array.
     *
     * @param source The left part of the new array
     * @param element The right part of the new array
     * @return An int[] array that consists of the source array elements followed by the newly added int.
     *
     * @author Petar Andreev
     */
    public static int[] add(int[] source, int element) {
        int[] array = new int[source.length+1];
        for (int i = 0; i < source.length; i++) {
            array[i] = source[i];
        }
        array[array.length-1] = element;
        return array;
    }

    public static int[] addFirst(int[] source, int element)
    {
        return new int[1];
    }
    /**
     * Appends an array of elements to an int[] array.
     *
     * @param source The left part of the new array
     * @param elements The right part of the new array
     * @return An int[] array that consists of the source array elements followed by the newly added integers.
     *
     * @author Petar Andreev
     */
    public static int[] addAll(int[] source, int... elements){
    int[] array = new int[source.length + elements.length];
        for (int i = 0; i < array.length; i++) {
            if(i < source.length){
        array[i] = source[i];
            } else {
                array[i] = elements [i - source.length];
            }
    }
        return array;
}

    public static boolean contains(int[] source, int element) {
        return false;
    }

    public static void copy(int[] sourceArray, int[] destinationArray, int count) {

    }

    public static void copyFrom(int[] sourceArray, int sourceStartIndex,
                                int[] destinationArray, int destStartIndex, int count) {

    }

    public static void fill(int[] source, int element) {

    }

    public static int firstIndexOf(int[] source, int target) {
        return 0;
    }

    public static int[] insert(int[] source, int index, int element) {
        return new int[1];
    }

    public static boolean isValidIndex(int[] source, int index) {
        return false;
    }

    public static int lastIndexOf(int[] source, int target) {
        return 0;
    }

    public static int[] removeAllOccurrences(int[] source, int element) {return new int[1];}


    /**
     * Reverse the array: arrayToReverse
     *
     * @param arrayToReverse New array with the riversed elements
     * @return void
     *
     * @author Kaloyan Enchev
     */
    public static void reverse(int[] arrayToReverse)
    {
        int[] arrHelper = new int[arrayToReverse.length];

        for (int i = 0; i < arrayToReverse.length; i++)
        {
            arrHelper[i] = arrayToReverse[arrayToReverse.length - i - 1];
        }

        for (int i = 0; i < arrayToReverse.length; i++)
        {
            arrayToReverse[i] = arrHelper[i];
        }
    }

    /**
     * Section: Тhe elements in the array from the startIndex to the endIndex remain
     *
     * @param  source New array with the new elements from the startIndex position to
     <code>endIndex</code> position
     * @return An array that starts with the number on startIndex position to the number
     on endIndexcode position. If the passed array is empty or the start index
     is not valid it returns an empty array. Returns all remaining when given longer endIndex
     *
     * @author Kaloyan Enchev
     */
    public static int[] section(int[] source, int startIndex, int endIndex)
    {
        if (startIndex >= source.length || source.length == 0)
        {
            return source;
        }

        if (endIndex > source.length)
        {
            int[] arr = new int[source.length - startIndex];

            for (int i = startIndex, j = 0; i < source.length; i++, j++)
            {
                arr[j] = source[i];
            }
            return arr;
        }

        int[] arr = new int[(endIndex - startIndex) + 1];

        for (int i = startIndex, j = 0; i < endIndex + 1; i++, j++)
        {
            arr[j] = source[i];
        }

        return arr;
    }

}
