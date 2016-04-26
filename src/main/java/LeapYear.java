// This section will move to App.java later
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
// --- end of section ---

public class LeapYear {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";





  public static boolean isLeapYear(Integer year) {
    if (year % 400 == 0) {
      return true;
    } else if (year % 100 == 0) {
      return false;
    } else {
      return year % 4 == 0;
    }
  }
}
