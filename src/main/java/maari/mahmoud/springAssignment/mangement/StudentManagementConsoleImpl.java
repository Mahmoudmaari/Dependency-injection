package maari.mahmoud.springAssignment.mangement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import maari.mahmoud.springAssignment.data_access.StudentDao;
import maari.mahmoud.springAssignment.data_access.UserInputService;
import maari.mahmoud.springAssignment.models.Student;
@Component
public class StudentManagementConsoleImpl implements StudentManagement {

	
	UserInputService scannerService;
	StudentDao studentdeo;
	
	@Autowired
	public StudentManagementConsoleImpl(UserInputService scannerService, StudentDao studentdeo) {
		super();
		this.scannerService = scannerService;
		this.studentdeo = studentdeo;
	}

	
	@Override
	public Student create() {
		
		String str = scannerService.getString();
		System.out.println(str);
		return null;
	}
	
	@Override
	public Student save(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student remove(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> findall() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student edit(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

}
