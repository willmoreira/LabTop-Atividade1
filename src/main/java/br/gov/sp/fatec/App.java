package br.gov.sp.fatec;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author William Moreira 
 * @author Matheus Vinicius Calazans Archanjo
 */
public class App 
{
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(BeansConfig.class);
 
		
		
		Cadastro msg4 = (Cadastro) context.getBean(Cadastro.class);
        System.out.println(msg4.ler());

		
		
        Usuario msg1 = (Usuario) context.getBean("usuario1"); 
        System.out.println(msg1.getNome());

        Usuario msg2 = (Usuario) context.getBean("usuario2"); 
        System.out.println(msg2.getNome());
        
		Usuario msg3 = (Usuario) context.getBean("usuario3");
        System.out.println(msg3.getNome());

		context.close();
	}
}
