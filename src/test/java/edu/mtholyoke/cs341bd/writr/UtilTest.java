package edu.mtholyoke.cs341bd.writr;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * @author jfoley
 */
public class UtilTest {
  @Test
  public void testJoin() {
    String[] data = new String[] {"the", "quick", "brown", "fox"};
    assertEquals("the quick brown fox", Util.join(data));
    assertEquals("", Util.join(new String[0]));
    assertEquals(null, Util.join(null));
  }

  @Test
  public void testMillisToString() {
    // Who says java doesn't have macros?
    //System.out.println("long date = "+System.currentTimeMillis()+"L;");
    long date = 1485886411509L;
    assertEquals("2017-1-31 13:13", Util.dateToEST(date));
  }
}
