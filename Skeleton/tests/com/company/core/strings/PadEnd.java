package com.company.core.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PadEnd {
    
    @Test
    @DisplayName("padEnd() returns a padded string")
    public void padEnd() {
        //Arrange
        var source = "Company";
        var paddingSymbol = '-';
        var expected = "Company---";
        
        //Act
        var result = StringHelpers.padEnd(source,
                expected.length(),
                paddingSymbol);
        
        //Assert
        Assertions.assertEquals(expected, result);
    }
    
    @Test
    @DisplayName("padEnd() returns empty string when given empty string")
    public void padEnd_returnsEmptyString_when_givenEmptyString() {
        //Arrange
        var source = "";
        var paddingSymbol = '-';
        var expected = "";
        
        //Act
        var result = StringHelpers.padEnd(source,
                expected.length(),
                paddingSymbol);
        
        //Assert
        Assertions.assertEquals(expected, result);
    }
    
    @Test
    @DisplayName("padEnd() returns source when source is longer than length")
    public void padEnd_returnsSource_when_sourceIsLonger() {
        //Arrange
        var source = "Company";
        var paddingSymbol = '-';
        var expected = "Company";
        
        //Act
        var result = StringHelpers.padEnd(source,
                1,
                paddingSymbol);
        
        //Assert
        Assertions.assertEquals(expected, result);
    }
    
}
