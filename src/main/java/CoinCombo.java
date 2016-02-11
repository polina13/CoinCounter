import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class CoinCombo {
   public static void main(String[] args) {
  //   String layout = "templates/layout.vtl";
  //
  //   get("/", (request, response) -> {
  //     Map<String, Object> model = new HashMap<String, Object>();
  //     model.put("template", "templates/main.vtl");
  //     return new ModelAndView(model, layout);
  //   }, new VelocityTemplateEngine());
  //
  //   get("/detector", (request, response) -> {
  //     Map<String, Object> model = new HashMap<String, Object>();
  //     model.put("template", "templates/detector.vtl");
  //     String numberString = request.queryParams("number");
  //     Integer number = Integer.parseInt(numberString);
  //     Object results = CoinCombo.makesChange(number);
  //
  //     model.put("results", results);
  //     return new ModelAndView(model, layout);
  //   }, new VelocityTemplateEngine());
  }

  public static Object makesChange(Integer number) {
    int userNumber = number;
    int quarters = 0;
    while(number>=25) {
      number -=25;
      quarters ++;
    }
    return String.format("Your change for %d cents is: %d quarters", userNumber, quarters);
  }
}
