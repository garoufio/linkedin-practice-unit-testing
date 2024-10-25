package com.linkedin.junit.chapter4;

import com.linkedin.junit.chapter3.Calculator;

import java.util.Arrays;

public class HairSaloon {
  
  enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  private Day[] openingDays = { Day.MONDAY, Day.TUESDAY };
  private int haircutPrice = 30;
  private Calculator calculator = new Calculator();
  
  //-------------------------------------------------------------------------------------------------------------------
  
  // This method should return the openingDays array.
  public Day[] getOpeningDays() {
    return openingDays;
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  // This method should return true if the weekday passed in is present in the openingDays array.
  // If not it should return false. If the String passed in does not end in the letters "day",
  // it should throw an IllegalArgumentException with a message explaining that only weekdays are valid.
  public boolean isOpen(Day weekDay) {
    return Arrays.asList(openingDays).contains(weekDay);
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  public int getHairCutPrice() {
    return haircutPrice;
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  public int applyDiscount() {
    return calculator.divide(haircutPrice, 2) + 5;
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
}
