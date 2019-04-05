package maari.mahmoud.springAssignment.data_access;

import java.util.List;



import maari.mahmoud.springAssignment.models.Student;

public interface StudentDao {

	Student save (Student student);
	Student findbyid(int id);
	List<Student> findall();
	void delete(int id);
}
 