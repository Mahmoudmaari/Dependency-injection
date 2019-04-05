package maari.mahmoud.springAssignment.data_access;

import java.util.List;

import org.springframework.stereotype.Component;

import maari.mahmoud.springAssignment.models.Student;
@Component
public class StudentDaoListImpl implements StudentDao {
	
	
 List<Student> studnets;

@Override 
public Student save(Student student) {
	System.out.println("love you");
	return null;
}

@Override
public Student findbyid(int id) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<Student> findall() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void delete(int id) {
	// TODO Auto-generated method stub
	
}

}
