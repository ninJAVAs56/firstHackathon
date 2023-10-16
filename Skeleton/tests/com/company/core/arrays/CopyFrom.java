package com.company.core.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CopyFrom {
    
    @Test
    @DisplayName("copyFrom() copies enough elements from source array")
    public void copy_sourceArray_bigger() {
        //Arrange
        var source = new int[]{1, 2, 3, 4, 5};
        var destination = new int[4];
        var expected = new int[]{0, 1, 2, 0};
        
        //Act
        ArrayHelpers.copyFrom(source, 0, destination, 1, 2);
        
        //Assert
        Assertions.assertArrayEquals(expected, destination);
    }
    
    @Test
    @DisplayName("copyFrom() fills the empty positions with default values")
    public void copy_destinationArray_bigger() {
        //Arrange
        var source = new int[]{1, 2, 3};
        var destination = new int[5];
        var expected = new int[]{0, 1, 2, 0, 0};
        
        //Act
        ArrayHelpers.copyFrom(source, 0, destination, 1, 2);
        
        //Assert
        Assertions.assertArrayEquals(expected, destination);
    }
    
    @Test
    @DisplayName("copyFrom() takes all values from source array")
    public void copy_take_all() {
        //Arrange
        var source = new int[]{1, 2, 3};
        var destination = new int[4];
        
        var expected = new int[]{0, 1, 2, 3};
        
        //Act
        ArrayHelpers.copyFrom(source, 0, destination, 1, 3);
        
        //Assert
        Assertions.assertArrayEquals(expected, destination);
    }
    
}
