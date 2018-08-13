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
		user.setNome("William usuario1");
		user.setCpf(22222222);
		user.setIdade(35);
		user.setTime("Corinthians");
		return user;
	}
	
	@Bean(name={"usuario2"})
	public Usuario getMensagem2() {
		Usuario user = new Usuario();
		user.setNome("Matheus usuario2");
		user.setCpf(333333333);
		user.setIdade(22);
		user.setTime("Brasil");

		return user;
	}
	
	@Bean(name={"usuario3"})
	public Usuario getMensagem3() {
		Usuario user = new Usuario();
		user.setNome("Mineda usuario 3");
		user.setCpf(444444444);
		user.setIdade(30);
		user.setTime("Palmeiras");

		return user;
	}
}