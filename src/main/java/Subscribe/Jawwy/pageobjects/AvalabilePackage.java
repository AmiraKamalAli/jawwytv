package Subscribe.Jawwy.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import Subscribe.Jawwy.actiondriver.Action;
import Subscribe.Jawwy.base.BaseClass;
import java.util.regex.Pattern;

public class AvalabilePackage extends BaseClass {

	private static final String REGEX = "/";
	private static final String REGEX2 = " ";
	private static String price = null;
	private static String currency = null;
	@FindBy(xpath = "//strong[@id='name-lite']")
	private WebElement lite;
	@FindBy(xpath = "//strong[@id='name-classic']")
	private WebElement classic;
	@FindBy(xpath = "//strong[@id='name-premium']")
	private WebElement premium;
	@FindBy(xpath = "//div[@class=\"trial-cost\"]")
	private WebElement cost;
	@FindBy(xpath = "//div[2]/div[2]/div[1]/i[1]")
	private WebElement othercost;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/b[1]")
	private WebElement otherprice;

	public AvalabilePackage() {
		PageFactory.initElements(getDriver(), this);
	}

	Action action = new Action();

	public void CheckLitePackage() {

		action.implicitWait(getDriver(), 2);
		action.isDisplayed(getDriver(), lite);

	}

	public void CheckClassicPackage() {
		// TODO Auto-generated method stub
		action.implicitWait(getDriver(), 2);
		action.isDisplayed(getDriver(), classic);

	}

	public void CheckPrimiumPackage() {
		// TODO Auto-generated method stub
		action.implicitWait(getDriver(), 2);
		action.isDisplayed(getDriver(), premium);

	}

	public void GetEgyptPackagePrice() {

		action.implicitWait(getDriver(), 2);
		action.isDisplayed(getDriver(), cost);
		String e = cost.getText();

		Pattern pattern = Pattern.compile(REGEX);
		String[] result = pattern.split(e);

		String d = result[0];
		Pattern pattern2 = Pattern.compile(REGEX2);
		String[] result2 = pattern2.split(d);

		price = result2[1];
		String e3 = result2[2];
		String e4 = result2[3];

		currency = e3 + " " + e4;

		System.out.println("Price is " + price);
		System.out.println("currency is " + currency);

	}

	public void GetPackagePrice() {

		action.implicitWait(getDriver(), 2);
		action.isDisplayed(getDriver(), cost);
		String e = cost.getText();

		Pattern pattern = Pattern.compile(REGEX);
		String[] result = pattern.split(e);

		String d = result[0];
		Pattern pattern2 = Pattern.compile(REGEX2);
		String[] result2 = pattern2.split(d);

		price = result2[1];
		String e3 = result2[2];

		currency = e3;

		System.out.println("Price is " + price);
		System.out.println("currency is " + currency);

	}

	public void GetOtherPackagePrice() {
		action.implicitWait(getDriver(), 2);
		action.isDisplayed(getDriver(), otherprice);
		price = otherprice.getText();
		System.out.println("price is******************** " +price);
		action.implicitWait(getDriver(), 2);
		action.isDisplayed(getDriver(), othercost);
		String e = othercost.getText();
		Pattern pattern = Pattern.compile(REGEX);
		String[] result = pattern.split(e);

		String d = result[0];
		System.out.println("currency is******************** " + d);

		Pattern pattern2 = Pattern.compile(REGEX2);
		String[] result2 = pattern2.split(d);

		currency = d;

		System.out.println("Price is " + price);
		System.out.println("currency is " + currency);

	}

	public void validatePriceAndCurrency(String expectedPrice, String expectedCurrency) {
		// TODO Auto-generated method stub
		action.implicitWait(getDriver(), 2);
		SoftAssert softAssert = new SoftAssert();
		System.out.println("Price is " + price);
		System.out.println("currency is " + currency);
		System.out.println("expectedCurrency is " + expectedCurrency);
		System.out.println("expectedPrice is " + expectedPrice);
		softAssert.assertTrue(price.matches(expectedPrice), "passed");
		action.implicitWait(getDriver(), 5);
		softAssert.assertTrue(currency.matches(expectedCurrency), "passed");
		softAssert.assertAll();
	}

	public void validateOtherPriceAndCurrency(String expectedPrice, String expectedCurrency) {
		// TODO Auto-generated method stub
		action.implicitWait(getDriver(), 2);
		SoftAssert softAssert = new SoftAssert();
		System.out.println("Price is " + price);
		System.out.println("currency is " + currency);
		System.out.println("expectedCurrency is " + expectedCurrency);
		System.out.println("expectedPrice is " + expectedPrice);
		softAssert.assertTrue(price.matches(expectedPrice), "passed");
		action.implicitWait(getDriver(), 5);
		softAssert.assertTrue(currency.matches(expectedCurrency), "passed");
		softAssert.assertAll();
	}

}
