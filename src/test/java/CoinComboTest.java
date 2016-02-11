import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class CoinComboTest {

  @Test
  public void makesChange_testForQuarters() {
    CoinCombo testCoinCombo = new CoinCombo();
    assertEquals("Your change for 25 cents is: 1 quarters, 0 dimes, 0 nickels, 0 pennies", testCoinCombo.makesChange(25));
  }

  @Test
  public void makesChange_testForDimes() {
    CoinCombo testCoinCombo = new CoinCombo();
    assertEquals("Your change for 35 cents is: 1 quarters, 1 dimes, 0 nickels, 0 pennies", testCoinCombo.makesChange(35));
  }

  @Test
  public void makesChange_testForNickels() {
    CoinCombo testCoinCombo = new CoinCombo();
    assertEquals("Your change for 40 cents is: 1 quarters, 1 dimes, 1 nickels, 0 pennies",testCoinCombo.makesChange(40));
  }

  @Test
  public void makesChange_testForPennies() {
    CoinCombo testCoinCombo = new CoinCombo();
    assertEquals("Your change for 41 cents is: 1 quarters, 1 dimes, 1 nickels, 1 pennies", testCoinCombo.makesChange(41));
  }
}
