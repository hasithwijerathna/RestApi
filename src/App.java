import com.hasith.dao.StudentManipulation;
import com.hasith.dao.impl.StudentManipulationImpl;
import com.hasith.model.Student;

public class App {
	public static void main(String[] args) {
		StudentManipulation class1 = new StudentManipulationImpl();
		System.out.println(class1.insertStudent(new Student(3,"Sumith")).toString());
	}
}
