/**
 * 
 */
package Subscribe.Jawwy.testcases;

import org.testng.annotations.Test;

import Subscribe.Jawwy.base.BaseClass;
import Subscribe.Jawwy.pageobjects.AvalabilePackage;

import Subscribe.Jawwy.utility.Log;

/**
 * @author Amira
 *
 */
public class Validate_Avalaible_Packages_Test extends BaseClass {

	@Test(priority = 1)
	public void check_Lite_Package() throws Throwable {
		Log.startTestCase("check if Lite Package is found");
		AvalabilePackage LitePackage = new AvalabilePackage();
		LitePackage.CheckLitePackage();
		Log.info("check if Lite Package is found is Sucess");
		Log.endTestCase("check if Lite Package is found");

	}
	@Test(priority = 2)
	public void check_classic_Package() throws Throwable {
		Log.startTestCase("check if classic Package is found");
		AvalabilePackage LitePackage = new AvalabilePackage();
		LitePackage.CheckLitePackage();
		Log.info("check if classic Package is found is Sucess");
		Log.endTestCase("check if classic Package is found");

	}
	
	@Test(priority = 3)
	public void check_PREMIUM_Package() throws Throwable {
		Log.startTestCase("check if PREMIUM Package is found");
		AvalabilePackage LitePackage = new AvalabilePackage();
		LitePackage.CheckLitePackage();
		Log.info("check if PREMIUM Package is found is Sucess");
		Log.endTestCase("check if PREMIUM Package is found");

	}
}
