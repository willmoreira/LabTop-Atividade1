package br.gov.sp.fatec;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(value={"br.gov.sp.fatec"})
public class BeansConfig {
	
	@Bean(name={"usuario1"}) 
	public Usuario getMensagem() {
		Usuario user = new Usuario();
		user.setNome("William");
		user.setCpf(22222222);
		user.setIdade(35);
		user.setTime("Corinthians");
		return user;
	}
	
	@Bean(name={"usuario2"})
	public Usuario getMensagem2() {
		Usuario user = new Usuario();
		user.setNome("Matheus");
		user.setCpf(333333333);
		user.setIdade(22);
		user.setTime("Brasil");

		return user;
	}
}