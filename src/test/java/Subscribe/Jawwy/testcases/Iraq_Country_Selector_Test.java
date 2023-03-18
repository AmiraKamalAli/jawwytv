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
public class Iraq_Country_Selector_Test extends BaseClass {

	@Test(priority = 1)
	public void Countryselector() throws Throwable {
		Log.startTestCase("contry selector");
		Log.info("click in country selector ");
		country Iraq = new country();
		Iraq.clickCountry();
		Log.info("clcik in country selector is Sucess");
		Log.endTestCase("contry selector");

	}

	@Test(priority = 2)
	public void Iraq() throws Throwable {
		Log.startTestCase("Iraq selection");
		Log.info("click in Iraq");
		country Iraq = new country();
		Iraq.clickIraq();
		Log.info("click in Iraq is Sucess");
		Log.endTestCase("Iraq selection");

	}	
}
