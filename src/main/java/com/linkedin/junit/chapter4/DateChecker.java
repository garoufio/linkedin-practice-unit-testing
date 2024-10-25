package com.linkedin.junit.chapter4;

public class DateChecker {
  
  enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  public boolean has31Days(Month month) {
    return switch (month) {
      case JANUARY, MARCH, MAY, JULY, AUGUST, OCTOBER, DECEMBER -> true;
      default -> false;
    };
  }
  
  //-------------------------------------------------------------------------------------------------------------------

}
