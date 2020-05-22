package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Actions extends TestBase{
	
	public static Select selection;
	
	
	public void click(WebElement Element) {
		Element.click();
	}
	
	public String gettext(WebElement Element) {
		return Element.getText().trim();
	}
	
	public void entertext(WebElement Element,String textgiven) {
		 Element.sendKeys(textgiven);
	}

	public void waitforgiventime(long time) throws InterruptedException {
		Thread.sleep(time);
	}
	
	public void naviagteback() {
		driver.navigate().back();
	}
	
	public void dropdownselection(WebElement Element) {
		selection=new Select(Element);
		selection.selectByIndex(2);	
	}

	
	public boolean isDisplayed(WebElement Element) {
		return Element.isDisplayed();
	}
}
