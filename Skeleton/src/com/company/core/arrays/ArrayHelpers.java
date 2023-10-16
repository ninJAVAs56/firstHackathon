package com.company.core.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    /**
     * Copies elements from the sourceArray to the destinationArray.
     *
     * @param sourceArray      The array from which elements will be copied.
     * @param destinationArray The array to which elements will be copied.
     * @param count            The number of elements to copy.
     *
     * @author Lyubima Malkocheva
     */
    public static void copy(int[] sourceArray, int[] destinationArray, int count) {
        if(sourceArray.length < count){
            count = sourceArray.length;
        }
        for (int i = 0; i < count; i++) {
            destinationArray[i] = sourceArray[i];
        }
    }

    /**
     * Copies elements from the sourceArray, starting from a specified index, to the destinationArray, starting from a specified index.
     *
     * @param sourceArray       The array from which elements will be copied.
     * @param sourceStartIndex  The index in the sourceArray from which copying begins.
     * @param destinationArray  The array to which elements will be copied.
     * @param destStartIndex    The index in the destinationArray where elements will be copied to.
     * @param count             The number of elements to copy.
     *
     * @author Lyubima Malkocheva
     */
    public static void copyFrom(int[] sourceArray, int sourceStartIndex,
                                int[] destinationArray, int destStartIndex, int count) {

        for (int i = sourceStartIndex; i < count ; i++) {
            destinationArray[destStartIndex] = sourceArray[i];
            destStartIndex++;
        }
    }

    /**
     * Fills the given integer array with the specified element.
     *
     * This method assigns the specified elementto every index in the
     * provided sourcearray, effectively filling the array with the
     * given element.
     *
     * @param source The integer array to be filled.
     * @param element The value to be assigned to all elements in the array.
     *
     * @author Kalina Borissova
     */
    public static void fill(int[] source, int element) {
        for(int i =0; i < source.length; i++){
            source[i] = element;
        }
    }

    /**
     * Finds the index of the first occurrence of the specified target element in the given integer array.
     *
     * This method iterates through the provided source array and returns
     * the index of the first occurrence of the target element. If the
     * target element is not found in the array, the method returns -1.
     *
     * @param source The integer array in which to search for the target element.
     * @param target The value to be found within the array.
     * @return The index of the first occurrence of the target element in the array, or -1 if the element is not found.
     *
     * @author Kalina Borissova
     */
    public static int firstIndexOf(int[] source, int target) {
        for (int i = 0; i < source.length; i++) {
            if(source[i] == target){
                return i;
            }
        }
        return -1;
    }

    /**
     * Returns an <code>array</code> with updated value at a given index>.
     *
     * @param source The array which indexes will be updated.
     * @param index The index to be updated in the array.
     * @param element The index of the element which has to be added to the array.
     * @return A modified array.
     *
     * @author Aleksandar Mechkarov
     */

    public static int[] insert(int[] source, int index, int element) {
        List<Integer> arrList = new ArrayList<>();
        for (int i = 0; i < source.length; i++) {
            arrList.add(source[i]);
        }
        arrList.add(index,element);
        int[]newArr = new int[arrList.size()];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arrList.get(i);
        }
        return newArr;
    }
    /**
     * Returns a  <code>boolean</code> with true when an index is present in the array and false when it is not>.
     *
     * @param source The array which indexes will be checked.
     * @param index The index to be checked if present in the array.
     * @return A boolean value.
     *
     * @author Aleksandar Mechkarov
     */
    public static boolean isValidIndex(int[] source, int index) {
        boolean isValid = true;
        if(index>source.length-1||source.length==0){
            isValid=false;
        }
        return isValid;
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
