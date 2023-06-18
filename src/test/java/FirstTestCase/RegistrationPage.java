package FirstTestCase;

import org.testng.annotations.Test;

public class RegistrationPage {
  @Test
  public void ValidName() 
  {
	 System.out.println("The name should be in alphabates "); 
  }
  
  @Test
  public void ValidMobileNo() 
  {
	  System.out.println("The Mobile no should have 10 digits");
  }
}
