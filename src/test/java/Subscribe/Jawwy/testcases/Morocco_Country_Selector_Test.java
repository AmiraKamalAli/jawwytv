/**
 * 
 */
package Subscribe.Jawwy.testcases;

import org.testng.annotations.Test;

import Subscribe.Jawwy.base.BaseClass;
import Subscribe.Jawwy.pageobjects.country;
import Subscribe.Jawwy.utility.Log;

/**
 * @author Amira
 *
 */
public class Morocco_Country_Selector_Test extends BaseClass {

	@Test(priority = 1)
	public void Countryselector() throws Throwable {
		Log.startTestCase("contry selector");
		Log.info("click in country selector ");
		country Morocco = new country();
		Morocco.clickCountry();
		Log.info("clcik in country selector is Sucess");
		Log.endTestCase("contry selector");

	}

	@Test(priority = 2)
	public void Morocco() throws Throwable {
		Log.startTestCase("Morocco selection");
		Log.info("click in Morocco");
		country Morocco = new country();
		Morocco.clickMorocco();
		Log.info("click in Morocco is Sucess");
		Log.endTestCase("Morocco selection");

	}	
}
