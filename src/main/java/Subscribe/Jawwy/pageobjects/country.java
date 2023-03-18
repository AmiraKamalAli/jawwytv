package Subscribe.Jawwy.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Subscribe.Jawwy.actiondriver.Action;
import Subscribe.Jawwy.base.*;

public class country extends BaseClass {
	
	
	@FindBy(xpath ="//span[@id='arrow']")
	private WebElement country;
	@FindBy(xpath ="//div[@id='eg-contry-flag']")
	private WebElement Egy;
	
	@FindBy(xpath ="//span[@id='ae-contry-lable']")
	private WebElement UAE;
	
	@FindBy(xpath ="//span[@id='dz-contry-lable']")
	private WebElement Algeria;
	
	
	public country() {
		PageFactory.initElements(getDriver(), this);
	}

	Action action = new Action();

	

	public void clickCountry() {
		
		action.implicitWait(getDriver(), 2);
		action.click(getDriver(), country);
		
		
	}



	public void clickEgypt() {
		// TODO Auto-generated method stub
		action.implicitWait(getDriver(), 2);
		action.click(getDriver(), Egy);
			
	}

	public void clickUAE() {
		// TODO Auto-generated method stub
		action.implicitWait(getDriver(), 2);
		action.click(getDriver(), UAE);
			
	}



	public void clickAlgeria() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				action.implicitWait(getDriver(), 2);
				action.click(getDriver(), Algeria);
		
	}




}