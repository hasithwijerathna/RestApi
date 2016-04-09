package com.hasith.dao;

import com.hasith.model.Stock;
import com.hasith.model.StockDetail;

public interface StockDao {

	String insertStock(Stock stock);
	
	Stock getStockById(int id);
	
	Stock UpdateStockDetailByStockId(int id, StockDetail stockDetail);

}