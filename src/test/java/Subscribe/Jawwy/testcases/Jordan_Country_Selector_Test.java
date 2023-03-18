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
public class Jordan_Country_Selector_Test extends BaseClass {

	@Test(priority = 1)
	public void Countryselector() throws Throwable {
		Log.startTestCase("contry selector");
		Log.info("click in country selector ");
		country Jordan = new country();
		Jordan.clickCountry();
		Log.info("click in country selector is Sucess");
		Log.endTestCase("contry selector");

	}

	@Test(priority = 2)
	public void Jordan() throws Throwable {
		Log.startTestCase("Jordan selection");
		Log.info("click in Jordan");
		country Jordan = new country();
		Jordan.clickJordan();
		Log.info("click in Jordan is Sucess");
		Log.endTestCase("Jordan selection");

	}	
}
