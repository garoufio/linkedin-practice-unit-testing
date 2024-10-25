package com.linkedin.junit.chapter4;

import com.linkedin.junit.chapter4.DateChecker.Month;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DateCheckerTest {
  
  DateChecker dateChecker = new DateChecker();
  
  //-------------------------------------------------------------------------------------------------------------------
  
  @ParameterizedTest
  @EnumSource(value = Month.class, names = { "JANUARY", "MARCH", "MAY", "JULY", "AUGUST", "OCTOBER", "DECEMBER"})
  public void testHas31Days(Month month) {
    assertTrue(dateChecker.has31Days(month));
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  @ParameterizedTest
  @EnumSource(value = Month.class, names = { "FEBRUARY", "APRIL", "JUNE", "SEPTEMBER", "NOVEMBER" })
  public void testDoesNotHave31Days(Month month) {
    assertFalse(dateChecker.has31Days(month));
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
}
