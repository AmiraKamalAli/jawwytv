/**
 * 
 */
package Subscribe.Jawwy.dataprovider;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.testng.annotations.DataProvider;
import Subscribe.Jawwy.utility.CountriesDataUtility;

/**
 * @author Amira
 *
 */
public class DataProviders {

	@DataProvider(name = "Subscription")

	public Object[][] GetPriceAndcurencyPerCountry() throws IOException {
		List<Map<String, String>> testDataInMap = CountriesDataUtility.getMapTestDataInMap();
		Object[][] data = new Object[1][4];

		String countryName = testDataInMap.get(0).get("countryName");
		String Subscription_Type = testDataInMap.get(0).get("SubscriptionPackageType");
		String Price = testDataInMap.get(0).get("Price");
		String Currency = testDataInMap.get(0).get("Currency");

		data[0][0] = countryName;
		data[0][1] = Subscription_Type;
		data[0][2] = Price;
		data[0][3] = Currency;
		return data;


	}
	
	@DataProvider(name = "UAE")

	public Object[][] GetUAEPriceAndcurencyPerCountry() throws IOException {
		List<Map<String, String>> testDataInMap = CountriesDataUtility.getMapTestDataInMap2();
		Object[][] data = new Object[1][4];

		String countryName = testDataInMap.get(1).get("countryName");
		String Subscription_Type = testDataInMap.get(1).get("SubscriptionPackageType");
		String Price = testDataInMap.get(1).get("Price");
		String Currency = testDataInMap.get(1).get("Currency");

		data[0][0] = countryName;
		data[0][1] = Subscription_Type;
		data[0][2] = Price;
		data[0][3] = Currency;
		return data;

		

	}
	@DataProvider(name = "Algeria")

	public Object[][] Get_Algeria_PriceAndcurencyPerCountry() throws IOException {
		List<Map<String, String>> testDataInMap = CountriesDataUtility.getMapTestDataInMap2();
		Object[][] data = new Object[1][4];

		String countryName = testDataInMap.get(8).get("countryName");
		String Subscription_Type = testDataInMap.get(8).get("SubscriptionPackageType");
		String Price = testDataInMap.get(8).get("Price");
		String Currency = testDataInMap.get(8).get("Currency");

		data[0][0] = countryName;
		data[0][1] = Subscription_Type;
		data[0][2] = Price;
		data[0][3] = Currency;
		return data;
	}
	
	@DataProvider(name = "Djibouti")

	public Object[][] Get_Djibouti_PriceAndcurencyPerCountry() throws IOException {
		List<Map<String, String>> testDataInMap = CountriesDataUtility.getMapTestDataInMap2();
		Object[][] data = new Object[1][4];

		String countryName = testDataInMap.get(9).get("countryName");
		String Subscription_Type = testDataInMap.get(9).get("SubscriptionPackageType");
		String Price = testDataInMap.get(9).get("Price");
		String Currency = testDataInMap.get(9).get("Currency");

		data[0][0] = countryName;
		data[0][1] = Subscription_Type;
		data[0][2] = Price;
		data[0][3] = Currency;
		return data;
	}
	@DataProvider(name = "Chad")

	public Object[][] Get_Chad_PriceAndcurencyPerCountry() throws IOException {
		List<Map<String, String>> testDataInMap = CountriesDataUtility.getMapTestDataInMap2();
		Object[][] data = new Object[1][4];

		String countryName = testDataInMap.get(10).get("countryName");
		String Subscription_Type = testDataInMap.get(10).get("SubscriptionPackageType");
		String Price = testDataInMap.get(10).get("Price");
		String Currency = testDataInMap.get(10).get("Currency");

		data[0][0] = countryName;
		data[0][1] = Subscription_Type;
		data[0][2] = Price;
		data[0][3] = Currency;
		return data;
	}
	
	@DataProvider(name = "Lebanon")

	public Object[][] Get_Lebanon_PriceAndcurencyPerCountry() throws IOException {
		List<Map<String, String>> testDataInMap = CountriesDataUtility.getMapTestDataInMap2();
		Object[][] data = new Object[1][4];

		String countryName = testDataInMap.get(11).get("countryName");
		String Subscription_Type = testDataInMap.get(11).get("SubscriptionPackageType");
		String Price = testDataInMap.get(11).get("Price");
		String Currency = testDataInMap.get(11).get("Currency");

		data[0][0] = countryName;
		data[0][1] = Subscription_Type;
		data[0][2] = Price;
		data[0][3] = Currency;
		return data;
	}
	@DataProvider(name = "Iraq")

	public Object[][] Get_Iraq_PriceAndcurencyPerCountry() throws IOException {
		List<Map<String, String>> testDataInMap = CountriesDataUtility.getMapTestDataInMap2();
		Object[][] data = new Object[1][4];

		String countryName = testDataInMap.get(2).get("countryName");
		String Subscription_Type = testDataInMap.get(2).get("SubscriptionPackageType");
		String Price = testDataInMap.get(2).get("Price");
		String Currency = testDataInMap.get(2).get("Currency");

		data[0][0] = countryName;
		data[0][1] = Subscription_Type;
		data[0][2] = Price;
		data[0][3] = Currency;
		return data;
	}
	
	
	@DataProvider(name = "Jordan")

	public Object[][] Get_Jordan_PriceAndcurencyPerCountry() throws IOException {
		List<Map<String, String>> testDataInMap = CountriesDataUtility.getMapTestDataInMap2();
		Object[][] data = new Object[1][4];

		String countryName = testDataInMap.get(3).get("countryName");
		String Subscription_Type = testDataInMap.get(3).get("SubscriptionPackageType");
		String Price = testDataInMap.get(3).get("Price");
		String Currency = testDataInMap.get(3).get("Currency");

		data[0][0] = countryName;
		data[0][1] = Subscription_Type;
		data[0][2] = Price;
		data[0][3] = Currency;
		return data;
	}
	
	@DataProvider(name = "Morocco")

	public Object[][] Get_Morocco_PriceAndcurencyPerCountry() throws IOException {
		List<Map<String, String>> testDataInMap = CountriesDataUtility.getMapTestDataInMap2();
		Object[][] data = new Object[1][4];

		String countryName = testDataInMap.get(12).get("countryName");
		String Subscription_Type = testDataInMap.get(12).get("SubscriptionPackageType");
		String Price = testDataInMap.get(12).get("Price");
		String Currency = testDataInMap.get(12).get("Currency");

		data[0][0] = countryName;
		data[0][1] = Subscription_Type;
		data[0][2] = Price;
		data[0][3] = Currency;
		return data;
	}
	
	
	@DataProvider(name = "Oman")

	public Object[][] Get_Oman_PriceAndcurencyPerCountry() throws IOException {
		List<Map<String, String>> testDataInMap = CountriesDataUtility.getMapTestDataInMap2();
		Object[][] data = new Object[1][4];

		String countryName = testDataInMap.get(4).get("countryName");
		String Subscription_Type = testDataInMap.get(4).get("SubscriptionPackageType");
		String Price = testDataInMap.get(4).get("Price");
		String Currency = testDataInMap.get(4).get("Currency");

		data[0][0] = countryName;
		data[0][1] = Subscription_Type;
		data[0][2] = Price;
		data[0][3] = Currency;
		return data;
	}
	

	@DataProvider(name = "Tunisia")

	public Object[][] Get_Tunisia_PriceAndcurencyPerCountry() throws IOException {
		List<Map<String, String>> testDataInMap = CountriesDataUtility.getMapTestDataInMap2();
		Object[][] data = new Object[1][4];

		String countryName = testDataInMap.get(5).get("countryName");
		String Subscription_Type = testDataInMap.get(5).get("SubscriptionPackageType");
		String Price = testDataInMap.get(5).get("Price");
		String Currency = testDataInMap.get(5).get("Currency");

		data[0][0] = countryName;
		data[0][1] = Subscription_Type;
		data[0][2] = Price;
		data[0][3] = Currency;
		return data;
	}
	
	@DataProvider(name = "Yemen")

	public Object[][] Get_Yemen_PriceAndcurencyPerCountry() throws IOException {
		List<Map<String, String>> testDataInMap = CountriesDataUtility.getMapTestDataInMap2();
		Object[][] data = new Object[1][4];

		String countryName = testDataInMap.get(6).get("countryName");
		String Subscription_Type = testDataInMap.get(6).get("SubscriptionPackageType");
		String Price = testDataInMap.get(6).get("Price");
		String Currency = testDataInMap.get(6).get("Currency");

		data[0][0] = countryName;
		data[0][1] = Subscription_Type;
		data[0][2] = Price;
		data[0][3] = Currency;
		return data;
	}
	
	
	@DataProvider(name = "Palestine")

	public Object[][] Get_Palestine_PriceAndcurencyPerCountry() throws IOException {
		List<Map<String, String>> testDataInMap = CountriesDataUtility.getMapTestDataInMap2();
		Object[][] data = new Object[1][4];

		String countryName = testDataInMap.get(7).get("countryName");
		String Subscription_Type = testDataInMap.get(7).get("SubscriptionPackageType");
		String Price = testDataInMap.get(7).get("Price");
		String Currency = testDataInMap.get(7).get("Currency");

		data[0][0] = countryName;
		data[0][1] = Subscription_Type;
		data[0][2] = Price;
		data[0][3] = Currency;
		return data;
	}
	
}
