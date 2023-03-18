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
public class Djibouti_Country_Selector_Test extends BaseClass {

	@Test(priority = 1)
	public void Countryselector() throws Throwable {
		Log.startTestCase("contry selector");
		Log.info("click in country selector ");
		country Djibouti = new country();
		Djibouti.clickCountry();
		Log.info("clcik in country selector is Sucess");
		Log.endTestCase("contry selector");

	}

	@Test(priority = 2)
	public void Algeria() throws Throwable {
		Log.startTestCase("Djibouti selection");
		Log.info("click in Djibouti");
		country Djibouti = new country();
		Djibouti.clickDjibouti();
		Log.info("click in Djibouti is Sucess");
		Log.endTestCase("Djibouti selection");

	}	
}
