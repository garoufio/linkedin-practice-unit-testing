package com.linkedin.junit.chapter4;

import com.linkedin.junit.chapter3.Calculator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculatorTest {
  
  Calculator calculator = new Calculator();
  
  //-------------------------------------------------------------------------------------------------------------------
  
  @ParameterizedTest
  @ValueSource(ints = { -2, 2, 4, -10000, 1000000 })
  public void testIsEven(int number) {
    assertTrue(calculator.isEven(number));
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
}
