public class LeapYear {
  public static void main(String[] args) {}

    public boolean isLeapYear(Integer year) {
      if (year % 100 == 0) {
        return false;
      } else {
        return year % 4 == 0;
      }

  }

}
