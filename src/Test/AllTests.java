package Test;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ AddressTest.class, BooksTest.class, CartTest.class, ClientTest.class, ClothingTest.class,
		EletronicsTest.class, HomeAppliancesTest.class, OrderHistoryTest.class, OrderTest.class, ProductTest.class,
		StockTest.class })
public class AllTests {

}
