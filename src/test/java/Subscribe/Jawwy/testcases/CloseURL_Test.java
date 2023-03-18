/**
 * 
 */
package Subscribe.Jawwy.testcases;

import java.io.IOException;
import org.testng.annotations.Test;
import Subscribe.Jawwy.base.BaseClass;



/**
 * @author Amira
 *
 */
public class CloseURL_Test extends BaseClass {

	@Test(priority = 1)
	public void close() throws IOException {
		driver.get().close();
		
		
	}
}
