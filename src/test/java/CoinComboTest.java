import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class CoinComboTest {

  @Test
  public void makesChange() {
    CoinCombo testCoinCombo = new CoinCombo();
    assertEquals("Your change is: 2 quarters 0 dimes 0 nickels 0 pennies", testCoinCombo.makesChange(51));
  }

  @Test
  public void makesChangeDimes() {
    CoinCombo testCoinCombo = new CoinCombo();
    assertEquals("Your change is: 2 quarters 1 dimes 0 nickels 0 pennies", testCoinCombo.makesChange(61));
  }

  @Test
  public void makesChangeNickels() {
    CoinCombo testCoinCombo = new CoinCombo();
    assertEquals("Your change is: 2 quarters 1 dimes 1 nickels 0 pennies", testCoinCombo.makesChange(66));
  }

  @Test
  public void makesChangePennies() {
    CoinCombo testCoinCombo = new CoinCombo();
    assertEquals("Your change is: 2 quarters 1 dimes 1 nickels 1 pennies", testCoinCombo.makesChange(67));
  }
}
