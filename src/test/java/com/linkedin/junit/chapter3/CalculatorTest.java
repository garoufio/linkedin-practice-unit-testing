package com.linkedin.junit.chapter3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

  Calculator calculator = new Calculator();
  
  //-------------------------------------------------------------------------------------------------------------------
  
  @Test
  public void testIsEven() {
    boolean expected = true;
    boolean actual = calculator.isEven(12);
    assertTrue(expected == actual);
    
    assertTrue(calculator.isEven(-24));
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  @Test
  public void testIsOdd() {
    boolean actual = calculator.isEven(15);
    assertFalse(actual);
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  @Test
  public void testIncrementArray() {
    int[] expectedArray = new int[]{ 2, 3, 4 };
    int[] actualArray = calculator.incrementArray(new int[]{ 1, 2, 3});
    
    assertArrayEquals(expectedArray , actualArray);
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  @Test
  public void testDevideByZero() {
    Exception exception = assertThrows(IllegalArgumentException.class, () -> calculator.divide(5, 0));
    
    String expectedMessage = "Cannot divide by zero";
    String actualMessage = exception.getMessage();
    assertEquals(actualMessage, expectedMessage);
  }
  
  //-------------------------------------------------------------------------------------------------------------------

}
