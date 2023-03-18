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
public class Algeria_Country_Selector_Test extends BaseClass {

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
	public void Algeria() throws Throwable {
		Log.startTestCase("Algeria selection");
		Log.info("click in Algeria");
		country Algeria = new country();
		Algeria.clickAlgeria();
		Log.info("click in Algeria is Sucess");
		Log.endTestCase("Algeria selection");

	}	
}
