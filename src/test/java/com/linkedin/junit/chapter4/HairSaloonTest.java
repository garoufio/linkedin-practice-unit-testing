package com.linkedin.junit.chapter4;

import com.linkedin.junit.chapter3.Calculator;
import com.linkedin.junit.chapter4.HairSaloon.Day;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class HairSaloonTest {
  
  HairSaloon hairSaloon = new HairSaloon();
  
  //-------------------------------------------------------------------------------------------------------------------
  
  @Test
  public void testGetOpeningDays() {
    Day[] openingDays = hairSaloon.getOpeningDays();
    Day[] expected = { Day.MONDAY, Day.TUESDAY };
    
    assertArrayEquals(openingDays, expected);
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  @ParameterizedTest
  @EnumSource(value = Day.class, names = { "MONDAY", "TUESDAY" })
  public void testSalonIsOpen(Day day) {
    assertTrue(hairSaloon.isOpen(day));
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  @ParameterizedTest
  @EnumSource(value = Day.class, names = { "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY" })
  public void testSalonIsClosed(Day day) {
    assertFalse(hairSaloon.isOpen(day));
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  @Test
  public void testApplyDiscount() {
    Calculator calculator = new Calculator();
    // if this assumption fails, the test is aborted
    assumeTrue(calculator.divide(hairSaloon.getHairCutPrice(), 2) == 15);
    
    System.out.println("Testing apply discount...");
    
    int expected = 20;
    assertEquals(expected, hairSaloon.applyDiscount());
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
}
