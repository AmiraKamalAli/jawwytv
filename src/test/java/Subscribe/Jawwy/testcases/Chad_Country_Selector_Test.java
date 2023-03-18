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
public class Chad_Country_Selector_Test extends BaseClass {

	@Test(priority = 1)
	public void Countryselector() throws Throwable {
		Log.startTestCase("contry selector");
		Log.info("click in country selector ");
		country Egy = new country();
		Egy.clickCountry();
		Log.info("clcik in country selector is Sucess");
		Log.endTestCase("contry selector");

	}

	@Test(priority = 2)
	public void Chad() throws Throwable {
		Log.startTestCase("Chad selection");
		Log.info("click in Chad");
		country Chad = new country();
		Chad.clickChad();
		Log.info("click in Chad is Sucess");
		Log.endTestCase("Chad selection");

	}	
}
