package stockapp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;

public class StockTest {

	Portfolio portfolio;
	StockService service;

	@BeforeEach
	public void init() {
		portfolio = new Portfolio();
		service = Mockito.mock(StockService.class);
		portfolio.setStockService(service);
	}

	public void testMarketValue() {
		List<Stock> stocks = new ArrayList<>();
		Stock gstock = new Stock("101", "google", 10);
		Stock mstock = new Stock("102", "microsoft", 100);
		stocks.add(gstock);
		stocks.add(mstock);
		portfolio.setStocks(stocks);
		Mockito.when(service.getPrice(gstock)).thenReturn(500.00);
		Mockito.when(service.getPrice(mstock)).thenReturn(1000.00);
		double expected = 100500.00;
		assertEquals(expected, portfolio.getMarketValue());

	}
}
