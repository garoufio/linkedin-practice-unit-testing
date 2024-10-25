package com.linkedin.junit.chapter3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HairSaloonTest {
  
  HairSaloon hairSaloon = new HairSaloon();
  
  //-------------------------------------------------------------------------------------------------------------------
  
  @Test
  public void testGetOpeningDays() {
    String[] openingDays = hairSaloon.getOpeningDays();
    String[] expected = {"Monday", "Tuesday"};
    
    assertArrayEquals(openingDays, expected);
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  @Test
  public void testSalonIsOpenOnMonday() {
    assertTrue(hairSaloon.isOpen("Monday"));
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  @Test
  public void testSalonIsClosedOnWednesday() {
    assertFalse(hairSaloon.isOpen("Wednesday"));
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  @Test
  public void testExceptionIsThrownIfWeekdayDoesNotEndInDay() {
    Exception exception = assertThrows(IllegalArgumentException.class, () -> hairSaloon.isOpen("Haircut"));
    
    assertTrue(exception.getMessage().contains("Only weekdays are valid"));
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
}
