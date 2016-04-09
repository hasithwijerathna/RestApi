package com.hasith.dao.impl;

import org.hibernate.Session;

import com.hasith.dao.EmployeeDao;
import com.hasith.model.Employee;
import com.hasith.util.HibernateUtilities;
import com.hasith.util.SpareUtil;

public class EmployeeDaoImpl implements EmployeeDao {
	
	/* (non-Javadoc)
	 * @see com.hasith.dao.impl.EmployeeDAO#insertEmployee(com.hasith.model.Employee)
	 */
	@Override
	public Employee insertEmployee(Employee employee) {
		Session session = SpareUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(employee);
		session.getTransaction().commit();
		session.close();
		SpareUtil.getSessionFactory().close();
		return employee;
	}
}
