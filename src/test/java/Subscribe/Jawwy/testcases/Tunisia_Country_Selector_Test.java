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
public class Tunisia_Country_Selector_Test extends BaseClass {

	@Test(priority = 1)
	public void Countryselector() throws Throwable {
		Log.startTestCase("contry selector");
		Log.info("click in country selector ");
		country Tunisia = new country();
		Tunisia.clickCountry();
		Log.info("clcik in country selector is Sucess");
		Log.endTestCase("contry selector");

	}

	@Test(priority = 2)
	public void Tunisia() throws Throwable {
		Log.startTestCase("Tunisia selection");
		Log.info("click in Tunisia");
		country Tunisia = new country();
		Tunisia.clickTunisia();
		Log.info("click in Tunisia is Sucess");
		Log.endTestCase("Tunisia selection");

	}	
}
