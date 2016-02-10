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
    Integer quarter = 0;
    Integer dime = 0;
    Integer nickel = 0;
    Integer penny = 0;

    while (number >= 25) {
      quarter += 1;
      number -= 25;
    }
    while (number >= 10) {
      dime += 1;
      number -= 10;
    }
    while (number >= 5) {
      nickel += 1;
      number -= 5;
    }
    while (number >= 1) {
      penny += 1;
      number --;
    }
    return "Your change is: " + quarter + " quarters " + dime + " dimes " + nickel + " nickels " + penny + " pennies";
  }
}
