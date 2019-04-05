package maari.mahmoud.springAssignment;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import maari.mahmoud.springAssignment.configuration.ScannerConfiguration;
import maari.mahmoud.springAssignment.mangement.StudentManagement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context=
        		new AnnotationConfigApplicationContext(ScannerConfiguration.class);
    
        StudentManagement student= context.getBean(StudentManagement.class);
        
       System.out.println(student.create());
        
    
    }
}
