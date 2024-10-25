package com.linkedin.junit.chapter3;

import java.util.Arrays;

public class Calculator {
  
  public int sum(int a, int b) {
    return a + b;
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  public int subtract(int a, int b) {
    return a - b;
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  public int multiply(int a, int b) {
    return a * b;
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  public int divide(int a, int b) {
    if (b == 0) throw new IllegalArgumentException("Cannot divide by zero");
    
    return a / b;
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  public boolean isEven(int a) {
    return a % 2 == 0;
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  public int[] incrementArray(int[] array) {
    return Arrays.stream(array).map(i -> i + 1).toArray();
  }
  
}
