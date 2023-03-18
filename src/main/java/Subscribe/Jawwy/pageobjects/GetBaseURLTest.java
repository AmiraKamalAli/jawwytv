package Subscribe.Jawwy.pageobjects;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import Subscribe.Jawwy.base.BaseClass;


public class GetBaseURLTest  extends BaseClass {
	
	public String GetBaseUrl() throws IOException {

		//File propFile = new File("src\\\\Configuration\\Config.properties");
		FileInputStream inputStream = new FileInputStream(
				System.getProperty("user.dir") + "\\Configuration\\config.properties");
		
		prop = new Properties();
		prop.load(inputStream);
		String URL = prop.getProperty("url");
		return URL;
	}

	public String driverbrowser() throws IOException {

		//File propFile = new File("src\\Configuration\\config.properties");
		FileInputStream inputStream =new FileInputStream(
				System.getProperty("user.dir") + "\\Configuration\\config.properties");
		prop = new Properties();
		prop.load(inputStream);
		String browsertype = prop.getProperty("browser");
		return browsertype;
	}
}
