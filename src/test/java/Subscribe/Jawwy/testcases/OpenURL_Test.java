/**
 * 
 */
package Subscribe.Jawwy.testcases;

import java.io.IOException;
import org.testng.annotations.Test;
import Subscribe.Jawwy.base.BaseClass;
import Subscribe.Jawwy.pageobjects.GetBaseURLTest;


/**
 * @author Amira
 *
 */
public class OpenURL_Test extends BaseClass {

	@Test(priority = 1)
	public void setup() throws IOException {
		String BaseURL = (String) new GetBaseURLTest().GetBaseUrl();
		String browser = (String) new GetBaseURLTest().driverbrowser();
		System.out.println(BaseURL);
		System.out.println(browser);
		launchApp(browser, BaseURL);
		
	}
}
