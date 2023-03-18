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
public class Oman_Country_Selector_Test extends BaseClass {

	@Test(priority = 1)
	public void Countryselector() throws Throwable {
		Log.startTestCase("contry selector");
		Log.info("click in country selector ");
		country Oman = new country();
		Oman.clickCountry();
		Log.info("clcik in country selector is Sucess");
		Log.endTestCase("contry selector");

	}

	@Test(priority = 2)
	public void Oman() throws Throwable {
		Log.startTestCase("Oman selection");
		Log.info("click in Oman");
		country Oman = new country();
		Oman.clickOman();
		Log.info("click in Oman is Sucess");
		Log.endTestCase("Oman selection");

	}	
}
