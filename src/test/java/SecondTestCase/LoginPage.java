package SecondTestCase;

import org.testng.annotations.Test;

public class LoginPage {
  @Test
  public void ForgetPassword() 
  {
	  System.out.println("The forget password link should be clickable");
  }
  
  @Test
  public void Username() 
  {
	  System.out.println("The username should be a combination of AlphaNumeric ");
  }
  
  @Test
  public void ImageCaptcha() 
  {
	  System.out.println("The Image captcha should display at the end of the page");
  }
}
