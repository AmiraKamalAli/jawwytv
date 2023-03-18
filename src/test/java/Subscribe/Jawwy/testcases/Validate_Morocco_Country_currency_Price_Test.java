/**
 * 
 */
package Subscribe.Jawwy.testcases;

import org.testng.annotations.Test;
import Subscribe.Jawwy.dataprovider.DataProviders;
import Subscribe.Jawwy.base.BaseClass;
import Subscribe.Jawwy.pageobjects.AvalabilePackage;
import Subscribe.Jawwy.utility.Log;

/**
 * @author Amira
 *
 */
public class Validate_Morocco_Country_currency_Price_Test extends BaseClass {

		@Test(priority = 1, dataProvider = "Morocco", dataProviderClass = DataProviders.class)
	public void Get_Country_currency_Package(String countryName, String Subscription_Type, String ExpectedPrice,
			String ExpectedCurrency) throws Throwable {

		Log.startTestCase("get currency and price");
		AvalabilePackage LitePackage = new AvalabilePackage();
		LitePackage.GetOtherPackagePrice();
		Log.info("get currency and price is Sucess");

		Log.endTestCase("get currency and price");

	}
	@Test(priority = 2, dataProvider = "Morocco", dataProviderClass = DataProviders.class)
	public void Validate_Country_Currency_Package(String countryName, String Subscription_Type, String ExpectedPrice,
			String ExpectedCurrency) throws Throwable {

		Log.startTestCase("get currency and price");
		AvalabilePackage LitePackage = new AvalabilePackage();
		LitePackage.validateOtherPriceAndCurrency(ExpectedPrice, ExpectedCurrency);
		Log.info("Validate currency and price is Sucess");
		Log.endTestCase("Validate currency and price");

	}
}
