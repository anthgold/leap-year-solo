import org.junit.*;
import static org.junit.Assert.*;

public class LeapYearTest {

  @Test // nameOfFunction_testCase_expectedResult()
  public void isLeapYear_forNumberDivisibleByFour_true() {
    LeapYear leapYear = new LeapYear();
    assertEquals(true, leapYear.isLeapYear(2012));
  }

  @Test // nameOfFunction_testCase_expectedResult()
  public void isLeapYear_forMultiplesOfOneHundred_false() {
    LeapYear leapYear = new LeapYear();
    assertEquals(false, leapYear.isLeapYear(1900));
  }



}
