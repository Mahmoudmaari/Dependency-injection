package maari.mahmoud.springAssignment.data_access;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class ScannerinputService implements UserInputService {

	
	Scanner scanner;
	@Autowired
	public ScannerinputService(Scanner scanner) {
		super();
		this.scanner = scanner;
	}

	@Override
	public String getString() {
		// TODO Auto-generated method stub
		return scanner.nextLine();
	}

	@Override
	public int getint() {
		// TODO Auto-generated method stub
		return scanner.nextInt();
	}

}
