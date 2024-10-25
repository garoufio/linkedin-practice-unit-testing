package com.linkedin.junit.chapter2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CalculatorTest {
  
  Calculator calculator = new Calculator();
  
  //-------------------------------------------------------------------------------------------------------------------
  
  @Test
  public void testSum() {
    assertEquals(calculator.sum(1, 2), 3);
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  @Test
  public void testSubtract() {
    assertEquals(calculator.subtract(1, 2), -1);
    assertNotEquals(calculator.subtract(5, 2), 2);
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  @Test
  public void testMultiply() {
    assertEquals(calculator.multiply(3, 2), 6);
    assertNotEquals(calculator.multiply(3, 2), 2);
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  @Test
  public void testDivide() {
    assertEquals(calculator.divide(2, 2), 1);
    assertEquals(calculator.divide(-10, 2), -5);
    assertNotEquals(calculator.divide(10, 2), 2);
    assertEquals(calculator.divide(10, 0), 0);
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
}
