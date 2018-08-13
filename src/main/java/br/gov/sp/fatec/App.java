package br.gov.sp.fatec;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(BeansConfig.class);
 
		
		
        Usuario msg1 = (Usuario) context.getBean("usuario1"); 
        System.out.println(msg1.getNome());

        Usuario msg2 = (Usuario) context.getBean("usuario2"); 
        System.out.println(msg2.getNome());
        
		
		context.close();
	}
}
