import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class CoinComboTest {

  @Test
  public void makesChange_testForQuarters() {
    CoinCombo testCoinCombo = new CoinCombo();
    assertEquals("Your change for 27 cents is: 1 quarters", testCoinCombo.makesChange(27));
  }

  @Test
  public void makesChange_testForDimes() {
    CoinCombo testCoinCombo = new CoinCombo();
    assertEquals("Your change for 37 cents is: 1 quarters, 1 dimes", testCoinCombo.makesChange(37));
  }
}
