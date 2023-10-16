package com.company.core.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Repeat {
    
    @Test
    @DisplayName("repeat() returns source repeated")
    public void repeat() {
        //Arrange
        var word = "Java";
        var expected = "JavaJavaJavaJava";
        
        //Act
        var result = StringHelpers.repeat(word, 4);
        
        //Assert
        Assertions.assertEquals(expected, result);
    }
    
    @Test
    @DisplayName("repeat() returns source when times is 0")
    public void repeat_returnsSource_when_zeroTimes() {
        //Arrange
        var word = "Java";
        var expected = "Java";
        
        //Act
        var result = StringHelpers.repeat(word, 0);
        
        //Assert
        Assertions.assertEquals(expected, result);
    }
    
}
