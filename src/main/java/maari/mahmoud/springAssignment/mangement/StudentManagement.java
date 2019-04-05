package maari.mahmoud.springAssignment.mangement;

import java.util.List;

import maari.mahmoud.springAssignment.models.Student;

public interface StudentManagement {
	
	Student create();
	Student save ( Student student);
	Student find(int id);
	Student remove(int id);
	List<Student> findall();
	Student edit(Student student);

}
