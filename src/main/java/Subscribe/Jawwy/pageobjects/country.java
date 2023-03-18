package Subscribe.Jawwy.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Subscribe.Jawwy.actiondriver.Action;
import Subscribe.Jawwy.base.*;

public class country extends BaseClass {

	@FindBy(xpath = "//span[@id='arrow']")
	private WebElement country;
	@FindBy(xpath = "//div[@id='eg-contry-flag']")
	private WebElement Egy;

	@FindBy(xpath = "//span[@id='ae-contry-lable']")
	private WebElement UAE;

	@FindBy(xpath = "//span[@id='dz-contry-lable']")
	private WebElement Algeria;

	@FindBy(xpath = "//span[@id='dj-contry-lable']")
	private WebElement Djibouti;

	@FindBy(xpath = "//span[@id='td-contry-lable']")
	private WebElement Chad;

	@FindBy(xpath = "//span[@id='iq-contry-lable']")
	private WebElement Iraq;

	@FindBy(xpath = "//span[@id='jo-contry-lable']")
	private WebElement Jordan;

	@FindBy(xpath = "//span[@id='lb-contry-lable']")
	private WebElement Lebanon;

	@FindBy(xpath = "//span[@id='om-contry-lable']")
	private WebElement Oman;

	@FindBy(xpath = "//span[@id='ma-contry-lable']")
	private WebElement Morocco;

	@FindBy(xpath = "//span[@id='tn-contry-lable']")
	private WebElement Tunisia;

	@FindBy(xpath = "//span[@id='ye-contry-lable']")
	private WebElement Yemen;

	@FindBy(xpath = "//span[@id='ps-contry-lable']")
	private WebElement Palestine;

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

		action.implicitWait(getDriver(), 2);
		action.click(getDriver(), Algeria);

	}

	public void clickDjibouti() {

		action.implicitWait(getDriver(), 2);
		action.click(getDriver(), Djibouti);

	}

	public void clickLebanon() {

		action.implicitWait(getDriver(), 2);
		action.click(getDriver(), Lebanon);
	}

	public void clickChad() {

		action.implicitWait(getDriver(), 2);
		action.click(getDriver(), Chad);
	}

	public void clickIraq() {

		action.implicitWait(getDriver(), 2);
		action.click(getDriver(), Iraq);
	}

	public void clickJordan() {

		action.implicitWait(getDriver(), 2);
		action.click(getDriver(), Jordan);
	}

	public void clickMorocco() {
		action.implicitWait(getDriver(), 2);
		action.click(getDriver(), Morocco);

	}

	public void clickOman() {
		action.implicitWait(getDriver(), 2);
		action.click(getDriver(), Oman);

	}

	public void clickTunisia() {
		// TODO Auto-generated method stub
		action.implicitWait(getDriver(), 2);
		action.click(getDriver(), Tunisia);
	}

	public void clickYemen() {
		action.implicitWait(getDriver(), 2);
		action.click(getDriver(), Yemen);

	}

	public void clickPalestine() {
		action.implicitWait(getDriver(), 2);
		action.click(getDriver(), Palestine);

	}
}