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
public class UAE_Country_Selector_Test extends BaseClass {

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
	public void UAE() throws Throwable {
		Log.startTestCase("UAE selection");
		Log.info("click in UAE");
		country UAE = new country();
		UAE.clickUAE();
		Log.info("click in UAE is Sucess");
		Log.endTestCase("UAE selection");

	}	
}
