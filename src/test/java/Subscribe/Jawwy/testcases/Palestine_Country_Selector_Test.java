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
public class Palestine_Country_Selector_Test extends BaseClass {

	@Test(priority = 1)
	public void Countryselector() throws Throwable {
		Log.startTestCase("contry selector");
		Log.info("click in country selector ");
		country Palestine = new country();
		Palestine.clickCountry();
		Log.info("clcik in country selector is Sucess");
		Log.endTestCase("contry selector");

	}

	@Test(priority = 2)
	public void Palestine() throws Throwable {
		Log.startTestCase("Palestine selection");
		Log.info("click in Palestine");
		country Algeria = new country();
		Algeria.clickPalestine();
		Log.info("click in Palestine is Sucess");
		Log.endTestCase("Palestine selection");

	}	
}
