package ThirdTestCase;

import org.testng.annotations.Test;

public class HomePage {
  @Test
  public void ProductTabs() 
  {
	  System.out.println("The Multiple product tab should be displayed with proper allignment");
  }
  
  @Test
  public void MenuOptions() 
  {
	  System.out.println("The menue option should display at the top of homepage");
  }
  
  @Test
  public void ContactLinks() 
  {
	  System.out.println("The customer care link should be clickable ");
  }
}
