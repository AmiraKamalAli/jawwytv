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

		
//		for (int i = 0; i < 10; i++) {
//			String latitude = Location.get(i).get("lat");
//			String longitude = Location.get(i).get("long");
//			Loc[i][0] = latitude;
//			Loc[i][1] = longitude;
//			System.out.println("+++++++++++++++++++" + latitude);
//			System.out.println("+++++++++++++++++++" + longitude);
//
//		}
//		return Loc;
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

		
//		for (int i = 0; i < 10; i++) {
//			String latitude = Location.get(i).get("lat");
//			String longitude = Location.get(i).get("long");
//			Loc[i][0] = latitude;
//			Loc[i][1] = longitude;
//			System.out.println("+++++++++++++++++++" + latitude);
//			System.out.println("+++++++++++++++++++" + longitude);
//
//		}
//		return Loc;
	}

}
