package maari.mahmoud.springAssignment.configuration;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@Configuration
@ComponentScan("maari.mahmoud.springAssignment")
public class ScannerConfiguration {
	@Bean
	public Scanner scanner() {
		return new Scanner(System.in);
	}

}
