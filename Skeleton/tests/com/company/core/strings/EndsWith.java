package com.company.core.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class EndsWith {
    
    @Test
    @DisplayName("endsWith() returns true when strings ends with target")
    public void endsWith_true() {
        //Arrange
        var word = "Company";
        
        //Act
        var result = StringHelpers.endsWith(word, 'y');
        
        //Assert
        Assertions.assertTrue(result);
    }
    
    @Test
    @DisplayName("endsWith() returns false when strings doesn't ends with target")
    public void endsWith_false() {
        //Arrange
        var word = "Company";
        
        //Act
        var result = StringHelpers.endsWith(word, 'q');
        
        //Assert
        Assertions.assertFalse(result);
    }
    
    @Test
    @DisplayName("endsWith() returns false when given empty string")
    public void endsWith_empty() {
        //Arrange
        var word = "";
        
        //Act
        var result = StringHelpers.endsWith(word, 'q');
        
        //Assert
        Assertions.assertFalse(result);
    }
    
}
