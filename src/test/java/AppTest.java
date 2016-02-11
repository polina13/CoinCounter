import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();
  public WebDriver getDefaultDriver() {
      return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
      goTo("http://localhost:4567/");
      assertThat(pageSource()).contains("Title");
  }

  @Test
  public void makesChange() {
    goTo("http://localhost:4567/");
    fill("#number").with("41");
    submit(".btn");
    assertThat(pageSource()).contains("Your change for 41 cents is: 1 quarters, 1 dimes, 1 nickels, 1 pennies");
  }
}
