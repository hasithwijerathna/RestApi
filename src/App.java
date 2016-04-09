import java.util.Date;
import java.util.List;

import com.hasith.dao.EmployeeDao;
import com.hasith.dao.StockDao;
import com.hasith.dao.StudentDao;
import com.hasith.dao.impl.EmployeeDaoImpl;
import com.hasith.dao.impl.StockDaoImpl;
import com.hasith.dao.impl.StudentDaoImpl;
import com.hasith.model.Certificate;
import com.hasith.model.Employee;
import com.hasith.model.Stock;
import com.hasith.model.StockDetail;
import com.hasith.model.Student;

public class App {
	public static void main(String[] args) {
		//insertStudent("Jayantha");
		//getStudentById(7);
		//getAllStudent();
		//insertEmployee();
		insertStock();
		//getStock(1);
	}
	
	private static void getStudentById(int id) {
		StudentDao class1 = new StudentDaoImpl();
		System.out.println(class1.getStudentById(id).toString());
	}

	public static void insertStudent(String name){
		StudentDao class1 = new StudentDaoImpl();
		System.out.println(class1.insertStudent(new Student(name)).toString());
	}
	
	public static void getAllStudent(){
		StudentDao class1 = new StudentDaoImpl();
		List<Student> students = class1.getAllStudent();
		for(Student student : students){
			System.out.print("Id : "+student.getId());
			System.out.println(" Name : "+student.getName());
		}
	}
	
	public static void insertEmployee(){
		Employee employee = new Employee("Hasith", "Wijerathna", 100);
		employee.setId(1);
		Certificate certificate1 = new Certificate("Java");
		certificate1.setId(1);
		Certificate certificate2 = new Certificate("HTML");
		certificate2.setId(2);
		Certificate certificate3 = new Certificate("Scala");
		certificate3.setId(3);
		Certificate certificate4 = new Certificate("REST");
		certificate4.setId(4);
		employee.getCertificates().add(certificate1);
		employee.getCertificates().add(certificate2);
		employee.getCertificates().add(certificate3);
		employee.getCertificates().add(certificate4);
		EmployeeDao employeeDAO = new EmployeeDaoImpl();
		Employee emp = employeeDAO.insertEmployee(employee);
		System.out.println(employee.toString());
	}
	
	public static void insertStock(){
		Stock stock = new Stock();

		stock.setStockCode("8954");
		stock.setStockName("POOMA");

		StockDetail stockDetail = new StockDetail();
		stockDetail.setCompName("ABC India");
		stockDetail.setCompDesc("Best in the world");
		stockDetail.setRemark("Very Special");
		stockDetail.setListedDate(new Date());

		/*stock.setStockDetail(stockDetail);
		stockDetail.setStock(stock);*/

		StockDao stockDAO = new StockDaoImpl();
		
		System.out.println(stockDAO.UpdateStockDetailByStockId(8, stockDetail).toString());
	}
	
	public static void getStock(int id){
		StockDao stockDAO = new StockDaoImpl();
		Stock stock = stockDAO.getStockById(id);
		System.out.println(stock.getStockDetail().getListedDate());
	}
}
