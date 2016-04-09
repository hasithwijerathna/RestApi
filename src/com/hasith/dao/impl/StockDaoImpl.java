package com.hasith.dao.impl;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.hasith.dao.StockDao;
import com.hasith.model.Stock;
import com.hasith.model.StockDetail;
import com.hasith.util.SpareUtil;

public class StockDaoImpl implements StockDao {
	/* (non-Javadoc)
	 * @see com.hasith.dao.impl.StockDAO#insertStock(com.hasith.model.Stock)
	 */
	@Override
	public String insertStock(Stock stock){
		Session session = SpareUtil.getSessionFactory().openSession();
		session.beginTransaction();
		try{
			session.save(stock);
		}catch(HibernateException exception){
			System.out.println("Saving data custome exception : "+exception.getMessage());
		}
		
		session.getTransaction().commit();
		session.close();
		SpareUtil.getSessionFactory().close();
		return "inserted"; 
	}

	@Override
	public Stock getStockById(int id) {
		Session session = SpareUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Stock stock = null;
		try{
			stock = (Stock)session.get(Stock.class, id);
		}catch(HibernateException exception){
			System.out.println("Loarding data custome exception : "+exception.getMessage());
		}
		session.getTransaction().commit();
		session.close();
		SpareUtil.getSessionFactory().close();
		return stock;
	}
	
	@Override
	public Stock UpdateStockDetailByStockId(int id, StockDetail stockDetail) {
		Session session = SpareUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Stock stock = null;
		try{
			stock = (Stock)session.get(Stock.class, id);
			stock.setStockDetail(stockDetail);
			stockDetail.setStock(stock);
		}catch(HibernateException exception){
			System.out.println("Update Stock custome exception : "+exception.getMessage());
		}
		session.getTransaction().commit();
		session.close();
		SpareUtil.getSessionFactory().close();
		return stock;
	}
}

