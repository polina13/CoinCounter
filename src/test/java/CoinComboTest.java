import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class CoinComboTest {

  @Test
  public void makesChange() {
    CoinCombo testCoinCombo = new CoinCombo();
    assertEquals("Your change for 27 cents is: 1 quarters", testCoinCombo.makesChange(27));
  }

  @Test
  public void makesChange() {
    CoinCombo testCoinCombo = new CoinCombo();
    assertEquals("Your change for 27 cents is: 1 quarters", testCoinCombo.makesChange(27));
  }
}
