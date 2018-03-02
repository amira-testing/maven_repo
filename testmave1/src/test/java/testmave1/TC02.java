package testmave1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC02 {
  @Test
  public void Dummy_test_pass() {
	  Assert.assertEquals(1, 1);
  }
  
  @Test
  public void Dummy_test_fail() {
	  Assert.assertEquals(1, 2);
  }
  
  
  
  
}