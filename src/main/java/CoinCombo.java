import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;


public class CoinCombo {
   public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/main.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/detector", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/detector.vtl");
      String numberString = request.queryParams("number");
      Integer number = Integer.parseInt(numberString);
      Object results = CoinCombo.makesChange(number);

      model.put("results", results);
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }

  public static Object makesChange(Integer number) {

    int userNumber = number;

    int quarters = 0;
    int dimes = 0;
    int nickels = 0;
    int pennies = 0;

    while(number >= 25) {
      number -=25;
      quarters ++;
    }
    while(number >= 10) {
      number -=10;
      dimes ++;

    }
    while(number >= 5) {
      number -=5;
      nickels ++;
    }
    while(number >= 1) {
      number -=1;
      pennies ++;
    }
      return String.format("Your change for %d cents is: %d quarters, %d dimes, %d nickels, %d pennies", userNumber, quarters, dimes, nickels, pennies);
    }
  }
