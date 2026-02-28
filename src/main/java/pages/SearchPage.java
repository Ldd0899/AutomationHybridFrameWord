package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {
  @FindBy (xpath="//input[@type='text']")
  WebElement searchProduct;
  @FindBy(xpath="//i[@class='fa fa-search']")
  WebElement clickSearchProduct;
  public void searchProduct(String text) {
	type(searchProduct,text)  ;
  }
  public void clickSearchProduct()
{
	  click(clickSearchProduct);
}
}
